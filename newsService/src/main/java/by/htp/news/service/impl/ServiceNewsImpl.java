package by.htp.news.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import by.htp.news.bean.News;
import by.htp.news.dao.NewsDAO;
import by.htp.news.service.ServiceNews;

import org.apache.log4j.Logger;

@Service("serviceNews")
public class ServiceNewsImpl implements ServiceNews {

	private static final Logger LOGGER = Logger.getLogger(ServiceNewsImpl.class);

	@Autowired
	private NewsDAO newsDAO;

	@Override
	@Transactional
	public List<News> getNews() {
		LOGGER.info("News List Show");
		return newsDAO.getNews();
	}

	@Override
	@Transactional
	public void saveNews(News news) {
		LOGGER.info("news " + news.toString() + " save to DB");
		newsDAO.saveNews(news);
	}

	@Override
	@Transactional
	public News getNews(int newsId) {
		LOGGER.info("news with id " + newsId + " view or edit");
		return newsDAO.getNews(newsId);
	}

	@Override
	@Transactional
	public void deleteNews(int newsId) {
		LOGGER.info("news with id" + newsId + " delete from BD");
		newsDAO.deleteNews(newsId);
	}
}
