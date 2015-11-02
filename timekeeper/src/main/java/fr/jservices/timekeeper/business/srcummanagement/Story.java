package fr.jservices.timekeeper.business.srcummanagement;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "story")
public class Story {

	public final static int USER_STORY_TYPE = 0;
	public final static int TECHNICAL_STORY_TYPE = 1;
	public final static int TECHNICAL_DEBT_TYPE = 2;

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@Column(name = "story_type")
	private int storyType;
	@Column(name = "name")
	private String name;
	@Column(name = "business_value")
	private int businessValue;
	@Column(name = "complexity_points")
	private int complexityPoints;
	@Column(name = "short_wording")
	private String shortWording;
	@Column(name = "long_wording")
	private String longWording;

	@ManyToOne
	@Column(name = "feature_id")
	private Feature feature;
	
	@OneToMany(mappedBy = "task")
	private Set<Task> tasks;

	@Column(name = "date")
	private Date date;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStoryType() {
		return storyType;
	}

	public void setStoryType(int storyType) {
		this.storyType = storyType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBusinessValue() {
		return businessValue;
	}

	public void setBusinessValue(int businessValue) {
		this.businessValue = businessValue;
	}

	public int getComplexityPoints() {
		return complexityPoints;
	}

	public void setComplexityPoints(int complexityPoints) {
		this.complexityPoints = complexityPoints;
	}

	public String getShortWording() {
		return shortWording;
	}

	public void setShortWording(String shortWording) {
		this.shortWording = shortWording;
	}

	public String getLongWording() {
		return longWording;
	}

	public void setLongWording(String longWording) {
		this.longWording = longWording;
	}

	public Feature getFeature() {
		return feature;
	}

	public void setFeature(Feature feature) {
		this.feature = feature;
	}

	public Set<Task> getTasks() {
		return tasks;
	}

	public void setTasks(Set<Task> tasks) {
		this.tasks = tasks;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
