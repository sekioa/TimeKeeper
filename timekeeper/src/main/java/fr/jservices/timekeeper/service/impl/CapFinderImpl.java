package fr.jservices.timekeeper.service.impl;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import fr.jservices.timekeeper.business.srcummanagement.Project;
import fr.jservices.timekeeper.business.srcummanagement.Task;
import fr.jservices.timekeeper.business.srcummanagement.User;
import fr.jservices.timekeeper.service.Finder;

public class CapFinderImpl implements Finder {
	private static CapFinderImpl _instance;
	private CapFinderImpl() {
		
	}
	public static CapFinderImpl getInstance() {
		if (_instance==null) _instance=new CapFinderImpl();
		return _instance;
	}

	public User findUserByNickname(String nickname) {
		if (!nickname.equals("wam")) return null;
		User user = new User();
		user.setForename("vague");
		user.setLastname("nerd");
		user.setNickname(nickname);
		user.setTeamMember(true);
		
		Set<Project> projects = new HashSet<Project>();
		Project p1 = new Project();
		p1.setName("AGL");
		Set<User>users = new HashSet<User>();
		users.add(user);
		p1.setUsers(users);
		Project p2 = new Project();
		p2.setName("Référentiels");
		p2.setUsers(users);
		projects.add(p1);
		projects.add(p2);
		user.setProjects(projects);
		
		return user;
	}

	public Set<User> findAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<Project> findUserProjects(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<Task> findUserTasks(User user, Project project) {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<Task> findUserTasks(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<Project> findAllProjects() {
		// TODO Auto-generated method stub
		return null;
	}

}
