package fr.jservices.timekeeper.business.srcummanagement;

import java.util.Set;

public class Project {
	private Set<Feature> features; 
	private Set<User> users;
	private String name;
	
	
	public Set<Feature> getFeatures() {
		return features;
	}
	public void setFeatures(Set<Feature> features) {
		this.features = features;
	}
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
