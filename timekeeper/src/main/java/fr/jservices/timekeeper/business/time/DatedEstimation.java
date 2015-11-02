package fr.jservices.timekeeper.business.time;

import java.util.Date;

import javax.persistence.OneToOne;

import fr.jservices.timekeeper.business.srcummanagement.Task;
import fr.jservices.timekeeper.business.srcummanagement.User;

public class DatedEstimation {

	private Date estimationDate;
	private double estimation;
	@OneToOne
	private User user;
	@OneToOne
	private Task task;

	public Date getEstimationDate() {
		return estimationDate;
	}

	public void setEstimationDate(Date estimationDate) {
		this.estimationDate = estimationDate;
	}

	public double getEstimation() {
		return estimation;
	}

	public void setEstimation(double estimation) {
		this.estimation = estimation;
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
