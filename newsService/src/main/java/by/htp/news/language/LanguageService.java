package by.htp.news.language;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import by.htp.news.bean.language.Language;
import by.htp.news.bean.language.LanguageAddForm;

@Component
public class LanguageService {
	public static String languageFlag = "Ru";

	public Model modelEdit(Model theModel) {
		if (languageFlag.equals("En")) {
			theModel.addAttribute("managment", Language.getNewsManagmentEn());
			theModel.addAttribute("managmentNews", Language.getNewsTitleEn());
			theModel.addAttribute("listNews", Language.getNewsListEn());
			theModel.addAttribute("addNews", Language.getAddEn());
			theModel.addAttribute("newsTitle", LanguageAddForm.getNewsTitleEn());
			theModel.addAttribute("newsBreaf", LanguageAddForm.getNewsBreafEn());
			theModel.addAttribute("newsDate", LanguageAddForm.getNewsDateEn());
			theModel.addAttribute("newsContent", LanguageAddForm.getNewsContentEn());
			theModel.addAttribute("saveNews", LanguageAddForm.getNewsSaveEn());
			theModel.addAttribute("newsCancel", LanguageAddForm.getNewsCancelEn());

		} else {
			theModel.addAttribute("managment", Language.getNewsManagmentRu());
			theModel.addAttribute("managmentNews", Language.getNewsTitleRu());
			theModel.addAttribute("listNews", Language.getNewsListRu());
			theModel.addAttribute("addNews", Language.getAddRu());
			theModel.addAttribute("newsTitle", LanguageAddForm.getNewsTitleRu());
			theModel.addAttribute("newsBreaf", LanguageAddForm.getNewsBreafRu());
			theModel.addAttribute("newsDate", LanguageAddForm.getNewsDateRu());
			theModel.addAttribute("newsContent", LanguageAddForm.getNewsContentRu());
			theModel.addAttribute("saveNews", LanguageAddForm.getNewsSaveRu());
			theModel.addAttribute("newsCancel", LanguageAddForm.getNewsCancelRu());
		}
		return theModel;
	}

	public Model addModel(Model theModel) {
		if (languageFlag.equals("En")) {
			theModel.addAttribute("managment", Language.getNewsManagmentEn());
			theModel.addAttribute("managmentNews", Language.getNewsTitleEn());
			theModel.addAttribute("listNews", Language.getNewsListEn());
			theModel.addAttribute("addNews", Language.getAddEn());
			theModel.addAttribute("newsTitle", LanguageAddForm.getNewsTitleEn());
			theModel.addAttribute("newsBreaf", LanguageAddForm.getNewsBreafEn());
			theModel.addAttribute("newsDate", LanguageAddForm.getNewsDateEn());
			theModel.addAttribute("newsContent", LanguageAddForm.getNewsContentEn());
			theModel.addAttribute("saveNews", LanguageAddForm.getNewsSaveEn());
			theModel.addAttribute("newsCancel", LanguageAddForm.getNewsCancelEn());

		} else {
			theModel.addAttribute("managment", Language.getNewsManagmentRu());
			theModel.addAttribute("managmentNews", Language.getNewsTitleRu());
			theModel.addAttribute("listNews", Language.getNewsListRu());
			theModel.addAttribute("addNews", Language.getAddRu());
			theModel.addAttribute("newsTitle", LanguageAddForm.getNewsTitleRu());
			theModel.addAttribute("newsBreaf", LanguageAddForm.getNewsBreafRu());
			theModel.addAttribute("newsDate", LanguageAddForm.getNewsDateRu());
			theModel.addAttribute("newsContent", LanguageAddForm.getNewsContentRu());
			theModel.addAttribute("saveNews", LanguageAddForm.getNewsSaveRu());
			theModel.addAttribute("newsCancel", LanguageAddForm.getNewsCancelRu());
		}
		return theModel;
	}

	public Model newsPage(Model theModel) {
		if (languageFlag.equals("En")) {
			theModel.addAttribute("managment", Language.getNewsManagmentEn());
			theModel.addAttribute("managmentNews", Language.getNewsTitleEn());
			theModel.addAttribute("listNews", Language.getNewsListEn());
			theModel.addAttribute("addNews", Language.getAddEn());
			theModel.addAttribute("viewNews", Language.getViewEn());
			theModel.addAttribute("editNews", Language.getEditEn());
			theModel.addAttribute("deleteNews", Language.getDeleteEn());
		} else {
			theModel.addAttribute("managment", Language.getNewsManagmentRu());
			theModel.addAttribute("managmentNews", Language.getNewsTitleRu());
			theModel.addAttribute("listNews", Language.getNewsListRu());
			theModel.addAttribute("addNews", Language.getAddRu());
			theModel.addAttribute("viewNews", Language.getViewRu());
			theModel.addAttribute("editNews", Language.getEditRu());
			theModel.addAttribute("deleteNews", Language.getDeleteRu());
		}
		return theModel;
	}

	public Model viewNews(Model theModel) {
		if (languageFlag.equals("En")) {
			theModel.addAttribute("managment", Language.getNewsManagmentEn());
			theModel.addAttribute("managmentNews", Language.getNewsTitleEn());
			theModel.addAttribute("listNews", Language.getNewsListEn());
			theModel.addAttribute("addNews", Language.getAddEn());
			theModel.addAttribute("newsTitle", LanguageAddForm.getNewsTitleEn());
			theModel.addAttribute("newsBreaf", LanguageAddForm.getNewsBreafEn());
			theModel.addAttribute("newsDate", LanguageAddForm.getNewsDateEn());
			theModel.addAttribute("newsContent", LanguageAddForm.getNewsContentEn());
			theModel.addAttribute("deleteNews", Language.getDeleteEn());
			theModel.addAttribute("Back", Language.getExitEn());

		} else {
			theModel.addAttribute("managment", Language.getNewsManagmentRu());
			theModel.addAttribute("managmentNews", Language.getNewsTitleRu());
			theModel.addAttribute("listNews", Language.getNewsListRu());
			theModel.addAttribute("addNews", Language.getAddRu());
			theModel.addAttribute("newsTitle", LanguageAddForm.getNewsTitleRu());
			theModel.addAttribute("newsBreaf", LanguageAddForm.getNewsBreafRu());
			theModel.addAttribute("newsDate", LanguageAddForm.getNewsDateRu());
			theModel.addAttribute("newsContent", LanguageAddForm.getNewsContentRu());
			theModel.addAttribute("deleteNews", Language.getDeleteRu());
			theModel.addAttribute("Back", Language.getExitRu());
		}
		return theModel;
	}
}
