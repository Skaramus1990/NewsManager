package by.htp.news.dao;

import java.util.List;

import by.htp.news.bean.News;

public interface NewsDAO {
	
	public List<News> getNews();

	public void saveNews(News news);

	public News getNews(int newsId);

	public void deleteNews(int newsId);
}
