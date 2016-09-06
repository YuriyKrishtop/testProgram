package webservis.web;

import DAO.daoprogram.DAOPROGRAM;
import models.programs.Program;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class TableController {
	int i = 0;

	DAOPROGRAM daoprogram = new DAOPROGRAM();
	Program program = daoprogram.getProgram();

    @RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("title", "Hello TABLE!");
		model.addAttribute("program",program);
		model.addAttribute("ListModules",program.getListModuls());
//		model.addAttribute("topicList",program.getListModuls().get(++i).getListTopics());
		model.addAttribute("i",i);
		return "main";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String printWelcome2(ModelMap model) {
		model.addAttribute("title", "Hello TABLE!");
		model.addAttribute("program",program);
		model.addAttribute("ListModules",program.getListModuls());
		++i;
//		model.addAttribute("topicList",program.getListModuls().get(++i).getListTopics());
		model.addAttribute("i",i);
		return "main";
	}


}