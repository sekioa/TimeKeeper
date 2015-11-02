package fr.jservices.timekeeper.front.tablemodel;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.swing.table.DefaultTableModel;

import fr.jservices.timekeeper.business.srcummanagement.Project;
import fr.jservices.timekeeper.business.srcummanagement.Story;
import fr.jservices.timekeeper.business.srcummanagement.Task;
import fr.jservices.timekeeper.business.srcummanagement.User;
import fr.jservices.timekeeper.business.time.DatedEstimation;
import fr.jservices.timekeeper.business.time.Imputation;

public class TasksTableModel extends DefaultTableModel {
	Set<Task>tasks;
	public TasksTableModel(Set<Task>tasks)  {
		this.tasks=tasks;
	}

	@Override
	public int getColumnCount() {
		return 3;
	}

	@Override
	public String getColumnName(int arg0) {
//		private Story story;
//		private DatedEstimation initialEstimation;
//		private Set<DatedEstimation> effortEstimation;
//		private List<User> taskMasters;
//		private List<Date> taskMastersChangesDates;
//		private User curentTaskMaster;
//		private Set<Imputation> imputations;
//		private Date date;
//		private boolean closed;

		switch (arg0) {
			case 0: return "Story";
			case 1: return "Tâche";
			//case 2: return "Propriétaire";
			case 2: return "Finie";
		}
		return null;
	}

	@Override
	public int getRowCount() {
		if (tasks==null) return 0;
		return tasks.size();
	}

	@Override
	public Object getValueAt(int row, int column) {
		return "";//((Project)projects.toArray()[row]).getName();
	}
	
	
}
