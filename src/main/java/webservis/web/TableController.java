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
		return program.getListModuls().get(0).getListTopics();
	}

	@ModelAttribute("title")
	public String title() {
		return "Hello Table";
	}

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome() {
		return "main";
	}

	@RequestMapping(value = "/toTopic",  method = RequestMethod.POST)
	public String printModel(ModelMap model, @RequestParam(value="moduleId") int moduleId) {
		model.addAttribute("listTopics",program.getListModuls().get(moduleId - 1).getListTopics());
		return "main";
	}

}