package com.yoojuhee.jdbc.raw;

public class Article {
	String articleId;
	String title;
	String content;
	String userID;
	String name;
	String cdate;
	public String getArticleId() {
		return articleId;
	}
	public void setArticleId(String articleId) {
		this.articleId = articleId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCdate() {
		return cdate;
	}
	public void setCdate(String cdate) {
		this.cdate = cdate;
	}
	@Override
	public String toString() {
		return "Article [articleId=" + articleId + ", title=" + title + ", content=" + content + ", userID=" + userID
				+ ", name=" + name + ", cdate=" + cdate + "]";
	}
}
