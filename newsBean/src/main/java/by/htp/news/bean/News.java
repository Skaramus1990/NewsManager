package by.htp.news.bean;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "News")
public class News {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@NotNull(message = "is required")
	@Size(min = 3, message = "minimum 3 symbols")
	@Size(max = 200, message = "maximum 200 symbols")
	@Column(name = "title")
	private String title;

	@NotNull(message = "is required")
	@Size(min = 3, message = "minimum 3 symbols")
	@Size(max = 500, message = "maximum 500 symbols")
	@Column(name = "breaf")
	private String breaf;

	@NotNull(message = "is required")
	@Size(min = 3, message = "minimum 3 symbols")
	@Size(max = 5000, message = "maximum 5000 symbols")
	@Column(name = "content")
	private String content;

	@NotNull(message = "is required")
	@Column(name = "date_news")
	private Date date_news;

	public News(int id, String title, String breaf, String content, Date date_news) {
		super();
		this.id = id;
		this.title = title;
		this.breaf = breaf;
		this.content = content;
		this.date_news = date_news;
	}

	public News() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBreaf() {
		return breaf;
	}

	public void setBreaf(String breaf) {
		this.breaf = breaf;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getDate_news() {
		return date_news;
	}

	public void setDate_news(Date date_news) {
		this.date_news = date_news;
	}

	@Override
	public String toString() {
		return "News [id=" + id + ", title=" + title + ", breaf=" + breaf + ", content=" + content + ", date_news="
				+ date_news + "]";
	}

}
