package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tasks")
public class Task {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "task_id")
    private Long taskId;
 
    @Column(name = "task_text")
    private String taskText;
    
    @Column(name = "task_status")
    private String taskStatus;
    
    
    
    public Long getTaskId() {
        return taskId;
    }
 
    public void setTaskId(Long userId) {
        this.taskId = userId;
    }
    
    public String getTaskText() {
        return taskText;
    }
 
    public void setTaskText(String taskText) {
        this.taskText = taskText;
    }
 
    public String getTaskStatus() {
        return taskStatus;
    }
 
    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }
    
}
