package com.dstructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArrayJava8 {

	public static void main(String[] args) {

		Article a1 = new Article();
		a1.setName("eswar");
		a1.setTitle("java");
		Article a2 = new Article();
		a2.setName("Jobs");
		a2.setTitle("ObjectiveC");
		Article a3 = new Article();
		a3.setName("eswar");
		a3.setTitle("C++");

		List<Article> articles = new ArrayList<Article>();

		articles.add(a1);
		articles.add(a2);
		articles.add(a3);

		Optional<Article> javaArticle = getJavaArticles(articles);

		System.out.println(javaArticle.get().getName());

		System.out.println(getJavaArticlesList(articles).size());
		
		Map<String, List<Article>> authorsMapArticles = mapArticleByAuthor( articles);
		
		for(String author : authorsMapArticles.keySet()) {
			List<Article> arts = authorsMapArticles.get(author);
			for(Article a : arts) {
				System.out.println(a.getTitle() + "  " + author);
			}
		}

	}

	private static Optional<Article> getJavaArticles(List<Article> articles) {

		return articles.stream().filter(article -> article.getTitle().contains("java")).findFirst();
	}

	private static List<Article> getJavaArticlesList(List<Article> articles) {

		return articles.stream().filter(article -> article.getTitle().contains("java")).collect(Collectors.toList());
	}

	private static Map<String, List<Article>> mapArticleByAuthor(List<Article> articles) {

		return articles.stream().collect(Collectors.groupingBy(Article::getName));

	}

	private static class Article {

		String title;
		String name;

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}

}
