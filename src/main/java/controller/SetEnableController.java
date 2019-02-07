package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import dao.TaskDAO;
import entity.Task;


@Controller
public class SetEnableController {
	
	@Autowired
	private TaskDAO taskDAO;
	
	@RequestMapping(value = "/setEnable", produces = "text/plain;charset=UTF-8", method = RequestMethod.GET)
	public String creatingTask(@RequestParam("task") String[] taskTextList, Model model){
		
	Long setResult = null;
    String taskStatus = "enable";

    for (int i=0; i<taskTextList.length; i++){
        Task enabledTask = new Task();
        enabledTask.setTaskText(taskTextList[i]);
        enabledTask.setTaskStatus(taskStatus);
     
        if (taskTextList[i] != null){
    	    setResult = (Long)taskDAO.setEnable(enabledTask);
        }
    }

    if (setResult != null){
        model.addAttribute("message", "Мы вернули цель в активные");
        return "simplePage";

    } else {
        return "error";
    }
    }
	
}
