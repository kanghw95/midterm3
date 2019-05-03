package org.hyun.post;

public class Post {

	String posId;
	String userId;
	String name;
	String content;
	int sweet;
	String cdate;
	public String getPosId() {
		return posId;
	}
	public void setPosId(String posId) {
		this.posId = posId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getSweet() {
		return sweet;
	}
	public void setSweet(int sweet) {
		this.sweet = sweet;
	}
	public String getCdate() {
		return cdate;
	}
	public void setCdate(String cdate) {
		this.cdate = cdate;
	}
	@Override
	public String toString() {
		return "Post [posId=" + posId + ", userId=" + userId + ", name=" + name + ", content=" + content + ", sweet="
				+ sweet + ", cdate=" + cdate + "]";
	}
	
}
