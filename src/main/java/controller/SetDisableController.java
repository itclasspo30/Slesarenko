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
public class SetDisableController {
	
	@Autowired
	private TaskDAO taskDAO;
	
	@RequestMapping(value = "/setDisable", produces = "text/plain;charset=UTF-8", method = RequestMethod.GET)
	public String creatingTask(@RequestParam("task") String[] taskTextList, Model model){
		
	Long setResult = null;
    String taskStatus = "disable";

    for (int i=0; i<taskTextList.length; i++){
        Task disabledTask = new Task();
        disabledTask.setTaskText(taskTextList[i]);
        disabledTask.setTaskStatus(taskStatus);
     
        if (taskTextList[i] != null){
    	    setResult = (Long)taskDAO.setDisable(disabledTask);
        }
    }

    if (setResult != null){
        model.addAttribute("message", "Мы убрали выполненные цели");
        return "simplePage";
    } else {
        return "error";
    }
    }

}
