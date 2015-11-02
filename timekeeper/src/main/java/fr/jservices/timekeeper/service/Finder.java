package fr.jservices.timekeeper.service;

import java.util.Set;

import fr.jservices.timekeeper.business.srcummanagement.Project;
import fr.jservices.timekeeper.business.srcummanagement.Task;
import fr.jservices.timekeeper.business.srcummanagement.User;

public interface Finder {

	
	public User findUserByNickname(String nickname);
	
	
	public Set<User> findAllUsers();
	public Set<Project> findUserProjects(User user);
	public Set<Task> findUserTasks(User user, Project project);
	
	public Set<Task> findUserTasks(User user);
	
	public Set<Project> findAllProjects();

}
