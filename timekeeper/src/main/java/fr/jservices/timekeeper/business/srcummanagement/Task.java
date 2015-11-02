package fr.jservices.timekeeper.business.srcummanagement;

import java.util.Date;
import java.util.List;
import java.util.Set;

import fr.jservices.timekeeper.business.time.DatedEstimation;
import fr.jservices.timekeeper.business.time.Imputation;

public class Task {
	private Story story;
	private DatedEstimation initialEstimation;
	private Set<DatedEstimation> effortEstimation;
	private List<User> taskMasters;
	private List<Date> taskMastersChangesDates;
	private User curentTaskMaster;
	private Set<Imputation> imputations;
	private Date date;
	private boolean closed;
}
