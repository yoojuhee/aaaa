package com.yoojuhee.jdbc.raw;

import java.util.List;

public interface ArticleDao {
	/** 목록 */
	List<Article> listArticles();
	
	/** 조회*/
	Article getArticle(String articleId);
	
	/**등록*/
	void addAtricle(Article article);
	
	/**수정*/
	void uppdateArticle(Article article);
	
	/**삭제*/
	void deleteArticle(String article);

}
