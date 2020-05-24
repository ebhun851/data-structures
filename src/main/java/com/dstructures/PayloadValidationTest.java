package com.dstructures;

import static org.junit.Assert.assertEquals;
import java.io.IOException;
import org.junit.Test;

import com.apple.amp.infra.model.Operation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.protobuf.ByteString;


public class PayloadValidationTest {
	
	@Test
    public void compareInputAndOutputValues() throws JsonParseException, JsonMappingException, IOException {
       
		String inputKey="itunes";
		String inputValue="Replicator";
		String teststore = "some_store";
		
		byte[] kb= inputKey.getBytes();
		ByteString vb= ByteString.copyFromUtf8(inputValue);
		
		
		byte[] incomingBytes = buildInputPayload(kb,vb,teststore);
		
		// Consumer side parsing from bytes to actual values
		String payload = new String((byte[]) incomingBytes);
        ObjectMapper objectMapper = new ObjectMapper();
        Operation operation = objectMapper.readValue(payload, Operation.class);
        String operationType = operation.getType();
        String parsedStore = operation.getStore();
        String parsedKey = operation.getKey();
        String parsedValue = operation.getValue();
        
        
        
        assertEquals(parsedKey, inputKey);
        assertEquals(parsedValue, inputValue);
        assertEquals(parsedStore, teststore);
	}

	
	// Producer side creating payload as byte[]
	public byte[] buildInputPayload(byte[] key, ByteString value,String teststore) throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();

		Operation.Builder operationBuilder = new Operation.Builder();
		operationBuilder.withType("insert").withStore("some_store").withKey(new String(key)).withValue(value.toStringUtf8());
		Operation operation = operationBuilder.build();
		
		String payload = objectMapper.writeValueAsString(operation);
		return payload.getBytes();
	}
}
