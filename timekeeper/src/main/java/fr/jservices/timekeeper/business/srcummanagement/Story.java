package fr.jservices.timekeeper.business.srcummanagement;

import java.util.Date;
import java.util.Set;


public class Story {
	
	public final static int USER_STORY_TYPE = 0;
	public final static int TECHNICAL_STORY_TYPE = 1;
	public final static int TECHNICAL_DEBT_TYPE = 2;
	
	private Feature feature;
	private Set<Task> tasks;
	
	private String name;
	private int storyType;
	
	private int businessValue;
	private int complexityPoints;
	private String shortWording;
	private String longWording;
	
	private Date date;
}
