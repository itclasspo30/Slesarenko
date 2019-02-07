package dao;

import java.util.List;

import entity.Task;

public interface TaskDAO {
	
	public Long addTask(Task task);
	
	public List<Task> getDisableList();
	
	public List<Task> getEnableList();
	
	public Long setDisable(Task disabledTask);
	
	public Long setEnable(Task enabledTask);

}
