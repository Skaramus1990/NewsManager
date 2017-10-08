package by.htp.news.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import by.htp.news.bean.News;
import by.htp.news.dao.NewsDAO;

@Repository("newsDAO")
public class NewsDAOImpl implements NewsDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<News> getNews() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<News> theQuery = currentSession.createQuery("FROM News", News.class);
		List<News> news = theQuery.getResultList();
		return news;
	}

	@Override
	public void saveNews(News news) {
		System.out.println(news);
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(news);
	}

	@Override
	public News getNews(int newsId) {
		Session currentSession = sessionFactory.getCurrentSession();
		News news = currentSession.get(News.class, newsId);
		return news;
	}

	@Override
	public void deleteNews(int newsId) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query theQuery = currentSession.createQuery("delete from News where id=:newsId");
		theQuery.setParameter("newsId", newsId);
		theQuery.executeUpdate();
	}

}
