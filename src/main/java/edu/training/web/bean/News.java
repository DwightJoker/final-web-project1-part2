package edu.training.web.bean;

import java.io.Serializable;
import java.util.Objects;

public class News implements Serializable {
	private static final long serialVersionUID = 1L;

	private String title;
	private String brief;
	private String info;
	private String imgPath;
	private String newsId;

	public News() {
	}

	public News(String title, String brief, String info, String imgPath) {
		super();
		this.title = title;
		this.brief = brief;
		this.info = info;
		this.imgPath = imgPath;
	}

	public News(String title, String brief, String info, String imgPath, String newsId) {
		super();
		this.title = title;
		this.brief = brief;
		this.info = info;
		this.imgPath = imgPath;
		this.newsId = newsId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	public String getNewsId() {
		return newsId;
	}

	public void setNewsId(String newsId) {
		this.newsId = newsId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(brief, imgPath, info, newsId, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		News other = (News) obj;
		return Objects.equals(brief, other.brief) && Objects.equals(imgPath, other.imgPath)
				&& Objects.equals(info, other.info) && newsId == other.newsId && Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "News [title=" + title + ", brief=" + brief + ", info=" + info + ", imgPath=" + imgPath + ", newsId="
				+ newsId + "]";
	}
}
