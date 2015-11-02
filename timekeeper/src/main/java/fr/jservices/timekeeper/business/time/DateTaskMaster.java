/**
 * 
 */
package fr.jservices.timekeeper.business.time;

import java.util.Date;

import javax.persistence.OneToOne;

import fr.jservices.timekeeper.business.srcummanagement.Task;
import fr.jservices.timekeeper.business.srcummanagement.User;

/**
 * @author simon.fuger
 *
 */
public class DateTaskMaster {

	@OneToOne
	private Date date;
	@OneToOne
	private User user;
	@OneToOne
	private Task task;
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Task getTask() {
		return task;
	}
	public void setTask(Task task) {
		this.task = task;
	}
	
	
	
}
