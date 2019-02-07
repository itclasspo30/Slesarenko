package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import dao.TaskDAO;
import entity.Task;


@Controller
public class ShowEnableController {
	
	
	@Autowired
	private TaskDAO taskDAO;
	
	@RequestMapping(value = "/showEnable", produces = "text/plain;charset=UTF-8", method = RequestMethod.POST)
	public String showingTaskList(Model model){
		
    List<Task> tasks = null;
	
    tasks = (List<Task>)taskDAO.getEnableList();

    if (tasks != null){
        model.addAttribute("tasks", tasks);
        return "enableList";

    } else {
        return "error";
    }
    }

}
