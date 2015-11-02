package fr.jservices.timekeeper.service;

import fr.jservices.timekeeper.business.srcummanagement.*;
import fr.jservices.timekeeper.business.time.*;

public interface Recorder {
	public void saveFeature(Feature feature);
	public void saveProject(Project project);
	public void saveStory(Story story);
	public void saveTask(Task task);
	public void saveUser(User user);

	public void saveDatedEstimation(DatedEstimation datedEstimation);
	public void saveDatedImputation(Imputation imputation);
}
