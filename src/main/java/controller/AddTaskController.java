package controller;

import java.nio.charset.StandardCharsets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import dao.TaskDAO;
import entity.Task;


@Controller
public class AddTaskController {
	
	@Autowired
	private TaskDAO taskDAO;
	
	@RequestMapping(value = "/addTask", produces = "text/plain;charset=UTF-8", method = RequestMethod.POST)
	public String creatingTask(@RequestParam("taskText") byte[] taskByte, Model model){
		
	Long addResult = null;
    String taskStatus = "enable";
    
    String taskText = new String(taskByte, StandardCharsets.UTF_8);
    
        Task newTask = new Task();
        newTask.setTaskText(taskText);
        newTask.setTaskStatus(taskStatus);
     
    if (taskText != null){
        addResult = (Long)taskDAO.addTask(newTask);
    }

    if (addResult != null){
        model.addAttribute("message", "Новая цель добавлена");
        return "simplePage";

    } else {
        return "error";
    }
    }

}
