package webservis.web;

import DAO.daoprogram.DAOPROGRAM;
import models.moduls.Modul;
import models.programs.Program;
import models.topics.Topic;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/")
public class TableController {


	int i = 0;
	int num = 0;
	DAOPROGRAM daoprogram = new DAOPROGRAM();
	Program program = daoprogram.getProgram();

	@ModelAttribute("program")
	public Program program() {
		return program;
	}

	@ModelAttribute("listModules")
	public List<Modul> listModules() {
		return program.getListModuls();
	}

	@ModelAttribute("listTopics")
	public List<Topic> listTopics() {
		return program.getListModuls().get(i).getListTopics();
	}

	@ModelAttribute("title")
	public String title() {
		return "Hello Table";
	}

	@ModelAttribute("i")
	public int i() {
		return i;
	}

	@ModelAttribute("num")
	public int num() {
		return num;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		return "main";
	}

	@RequestMapping(value = "/toTopic",  method = RequestMethod.POST)
	public String printWelcome2(ModelMap model, @RequestParam(value="moduleId") int moduleId) {
		i = moduleId;
//		if (i < program.getListModuls().size()-1) {
//			i++;
//		} else i = 0;
		return "main";
	}

	@RequestMapping(value = "/toNum",  method = RequestMethod.POST)
	public String printNum(ModelMap model, @RequestParam(value="num") int num) {
		i = num - 1;
		return "main";
	}

}