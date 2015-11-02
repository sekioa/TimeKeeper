package fr.jservices.timekeeper.business.time;

import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import fr.jservices.timekeeper.business.srcummanagement.Task;
import fr.jservices.timekeeper.business.srcummanagement.User;

@Table(name = "imputation")
public class Imputation {

	@OneToOne
	private User user;

	private double hours;
	@ManyToOne
	private Task task;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

}
