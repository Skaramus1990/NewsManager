package by.htp.controllerNews;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import by.htp.news.bean.News;
import by.htp.news.bean.language.Language;
import by.htp.news.bean.language.LanguageAddForm;
import by.htp.news.language.LanguageService;
import by.htp.news.service.ServiceNews;

@Controller
public class NewsController {

	@Autowired
	private ServiceNews serviceNews;

	@Autowired
	LanguageService languageService;

	@RequestMapping("/news")
	public String velcomePage(Model theModel) {
		theModel = languageService.newsPage(theModel);
		List<News> news = serviceNews.getNews();
		theModel.addAttribute("news", news);
		return "news-managment";
	}

	@RequestMapping("/view")
	public String vievNews(@RequestParam("id") Integer id, Model theModel) {
		theModel = languageService.viewNews(theModel);
		News theNews = serviceNews.getNews(id);
		theModel.addAttribute("news", theNews);
		return "full-news-content";
	}

	@GetMapping("news/add")
	public String addNews(Model theModel) {
		theModel = languageService.addModel(theModel);
		News news = new News();
		theModel.addAttribute("news", news);
		return "add-news-form";
	}

	@GetMapping("news/edit")
	public String showFormForUpdate(@RequestParam("id") String newsId, Model theModel) {
		theModel = languageService.modelEdit(theModel);
		News news = serviceNews.getNews(Integer.parseInt(newsId));
		theModel.addAttribute("news", news);
		return "add-news-form";
	}

	@RequestMapping("save")
	public String saveUser(@Valid @ModelAttribute("news") News news, BindingResult theBindingResult) {
		if (theBindingResult.hasErrors()) {
			return "add-news-form";
		} else {
			serviceNews.saveNews(news);
		}
		return "redirect:/news";
	}

	@RequestMapping("languageRu")
	public String changeLanguage(Model theModel) {
		if (LanguageService.languageFlag.equals("En")) {
			LanguageService.languageFlag = "Ru";
		}
		return "redirect:/news";
	}

	@RequestMapping("languageEn")
	public String changeLanguageEn(Model theModel) {
		if (LanguageService.languageFlag.equals("Ru")) {
			LanguageService.languageFlag = "En";
		}
		return "redirect:/news";
	}

	@GetMapping("/deleteSingle")
	public String deleteNewsSingleton(@RequestParam("Delete") String newsId) {
		serviceNews.deleteNews(Integer.parseInt(newsId));
		return "redirect:/news";
	}

	@GetMapping("/delete")
	public String deleteNewsId(@RequestParam(name = "deleteNewsParam", required = false) String deleteNews) {
		if (deleteNews == null) {
			return "redirect:/news";
		}
		String[] arg = deleteNews.split(",");
		for (int i = 0; i < arg.length; i++) {
			serviceNews.deleteNews(Integer.parseInt(arg[i]));
		}
		return "redirect:/news";
	}
}
