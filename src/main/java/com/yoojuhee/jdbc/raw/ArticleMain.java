package com.yoojuhee.jdbc.raw;

public class ArticleMain {
	public static void main(String[] args) {
		ArticleDao articleDao = new ArticleDaoImplUsingRawjdbc();
		Article article = articleDao.getArticle("1");
		System.out.println(article);
	}

}
