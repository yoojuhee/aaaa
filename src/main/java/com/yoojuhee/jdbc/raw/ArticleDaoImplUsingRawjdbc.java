package com.yoojuhee.jdbc.raw;

import java.util.List;

public class ArticleDaoImplUsingRawjdbc implements ArticleDao {

	public ArticleDaoImplUsingRawjdbc() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Article> listArticles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Article getArticle(String articleId) {
		Article article = new Article();
		article.setArticleId(articleId);
		article.setTitle("제목");
		article.setContent("내용");
		article.setUserID("1");
		article.setName("유주희");
		article.setCdate("2019-03-08 17:30:00");
		return article;
	}

	@Override
	public void addAtricle(Article article) {
		// TODO Auto-generated method stub

	}

	@Override
	public void uppdateArticle(Article article) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteArticle(String article) {
		// TODO Auto-generated method stub

	}

}
