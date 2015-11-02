package fr.jservices.timekeeper.front.tablemodel;

import java.util.Set;

import javax.swing.table.DefaultTableModel;

import fr.jservices.timekeeper.business.srcummanagement.Project;

public class ProjectsTableModel extends DefaultTableModel {
	Set<Project>projects;
	public ProjectsTableModel(Set<Project>projects)  {
		this.projects=projects;
	}

	@Override
	public int getColumnCount() {
		return 1;
	}

	@Override
	public String getColumnName(int arg0) {
		return "Nom";
	}

	@Override
	public int getRowCount() {
		if (projects==null) return 0;
		return projects.size();
	}

	@Override
	public Object getValueAt(int row, int column) {
		return ((Project)projects.toArray()[row]).getName();
	}
	
	
}
