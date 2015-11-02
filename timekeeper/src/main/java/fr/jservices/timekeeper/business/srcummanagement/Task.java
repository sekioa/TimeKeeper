package fr.jservices.timekeeper.business.srcummanagement;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import fr.jservices.timekeeper.business.time.DateTaskMaster;
import fr.jservices.timekeeper.business.time.DatedEstimation;
import fr.jservices.timekeeper.business.time.Imputation;

@Entity
@Table(name = "task")
public class Task {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	private boolean closed;
	private Date date;

	@ManyToOne
	private Story story;
	@OneToOne(mappedBy = "user")
	private User curentTaskMaster;
	@OneToMany(mappedBy = "user")
	private List<User> taskMasters;
	@ManyToMany
	private DateTaskMaster taskMastersChangesDates;
	@OneToMany(mappedBy = "imputation")
	private Set<Imputation> imputations;
	@ManyToOne
	private DatedEstimation initialEstimation;
	@ManyToMany
	private Set<DatedEstimation> effortEstimation;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isClosed() {
		return closed;
	}

	public void setClosed(boolean closed) {
		this.closed = closed;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Story getStory() {
		return story;
	}

	public void setStory(Story story) {
		this.story = story;
	}

	public User getCurentTaskMaster() {
		return curentTaskMaster;
	}

	public void setCurentTaskMaster(User curentTaskMaster) {
		this.curentTaskMaster = curentTaskMaster;
	}

	public List<User> getTaskMasters() {
		return taskMasters;
	}

	public void setTaskMasters(List<User> taskMasters) {
		this.taskMasters = taskMasters;
	}

	public DateTaskMaster getTaskMastersChangesDates() {
		return taskMastersChangesDates;
	}

	public void setTaskMastersChangesDates(DateTaskMaster taskMastersChangesDates) {
		this.taskMastersChangesDates = taskMastersChangesDates;
	}

	public Set<Imputation> getImputations() {
		return imputations;
	}

	public void setImputations(Set<Imputation> imputations) {
		this.imputations = imputations;
	}

	public DatedEstimation getInitialEstimation() {
		return initialEstimation;
	}

	public void setInitialEstimation(DatedEstimation initialEstimation) {
		this.initialEstimation = initialEstimation;
	}

	public Set<DatedEstimation> getEffortEstimation() {
		return effortEstimation;
	}

	public void setEffortEstimation(Set<DatedEstimation> effortEstimation) {
		this.effortEstimation = effortEstimation;
	}

}
