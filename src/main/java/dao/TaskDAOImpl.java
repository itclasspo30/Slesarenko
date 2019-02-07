package dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import entity.Task;


public class TaskDAOImpl implements TaskDAO{
	
    private SessionFactory sessionFactory;
	
	public TaskDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


	public Long addTask(Task task) {
		Session session = this.sessionFactory.getCurrentSession();
        session.beginTransaction();
        Long result = (Long) session.save(task);
        session.getTransaction().commit();
        return result;
	}



	public List<Task> getEnableList(){
		Session session = this.sessionFactory.getCurrentSession();
		session.beginTransaction();
		Criteria userCriteria = session.createCriteria(Task.class);
		List<Task> tasks = userCriteria.add(Restrictions.eq("taskStatus", "enable")).list();
        session.getTransaction().commit();
		return tasks;
	}
	



	public List<Task> getDisableList() {
		Session session = this.sessionFactory.getCurrentSession();
		session.beginTransaction();
		Criteria userCriteria = session.createCriteria(Task.class);
		List<Task> tasks = userCriteria.add(Restrictions.eq("taskStatus", "disable")).list();
        session.getTransaction().commit();
		return tasks;
	}



	public Long setEnable(Task enabledTask) {
		Session session = this.sessionFactory.getCurrentSession();
	    session.beginTransaction();
	    Criteria userCriteria = session.createCriteria(Task.class);
	    userCriteria.add(Restrictions.eq("taskText", enabledTask.getTaskText()));
	    Task oldTask = (Task) userCriteria.uniqueResult();
	    session.delete(oldTask);
	    Long result = (Long) session.save(enabledTask);
        session.getTransaction().commit();
        return result;
	}



	public Long setDisable(Task disabledTask) {
		Session session = this.sessionFactory.getCurrentSession();
	    session.beginTransaction();
	    Criteria userCriteria = session.createCriteria(Task.class);
	    userCriteria.add(Restrictions.eq("taskText", disabledTask.getTaskText()));
	    Task oldTask = (Task) userCriteria.uniqueResult();
	    session.delete(oldTask);
	    Long result = (Long) session.save(disabledTask);
        session.getTransaction().commit();
        return result;
	}

}
