package fr.jservices.timekeeper.front;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.util.HashSet;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import fr.jservices.timekeeper.business.srcummanagement.Task;
import fr.jservices.timekeeper.business.srcummanagement.User;
import fr.jservices.timekeeper.front.swingutils.GBC;
import fr.jservices.timekeeper.front.tablemodel.ProjectsTableModel;
import fr.jservices.timekeeper.front.tablemodel.TasksTableModel;

public class UserDashBoardPanel extends JPanel {
	//Business
	User user;
	//Front
	JDesktopPane desktop = new JDesktopPane();
	JInternalFrame projectsFrame = new JInternalFrame("Mes Projets", true, true, true, true);
	JInternalFrame featuresFrame = new JInternalFrame("Les Features du projet", true, true, true, true);
	JInternalFrame storiesFrame = new JInternalFrame("Les Stories du projet", true, true, true, true);
	//JInternalFrame tasksFrame = new JInternalFrame("Tâches", true, true, true, true);
	//JInternalFrame allTasksFrame = new JInternalFrame("Toutes mes tâches", true, true, true, true);
	JInternalFrame projectTasksFrame = new JInternalFrame("Mes Tâches du projet", true, true, true, true);
	JInternalFrame taskFrame = new JInternalFrame("Détail de la tâche", true, true, true, true);
	
	public UserDashBoardPanel(User user) {
		super(new BorderLayout());
		this.user=user;
		
		add(desktop,BorderLayout.CENTER);
		
		/** PROJECTS **/
		desktop.add(projectsFrame);
		projectsFrame.setBounds(0, 0, 300, 200);
		projectsFrame.setVisible(true);

		projectsFrame.setLayout(new BorderLayout());
		JTable projetsTable = new JTable(new ProjectsTableModel(user.getProjects()));
		//projetsTable.setBorder(BorderFactory.createEtchedBorder());
		projectsFrame.add(new JScrollPane(projetsTable),BorderLayout.CENTER);
		
		/** FEATURES **/
		desktop.add(featuresFrame);
		featuresFrame.setBounds(0, 200, 300, 200);
		featuresFrame.setVisible(true);
		
		/** STORIES **/
		desktop.add(storiesFrame);
		storiesFrame.setBounds(0, 400, 300, 200);
		storiesFrame.setVisible(true);
		
		/** TASKS **/
//		desktop.add(tasksFrame);
//		tasksFrame.setBounds(0, 60, 300, 200);
//		tasksFrame.setVisible(true);
		
//		desktop.add(allTasksFrame);
//		allTasksFrame.setBounds(0, 200, 300, 400);
//		allTasksFrame.setVisible(true);
		
		desktop.add(projectTasksFrame);
		projectTasksFrame.setLocation(0, 0);
		projectTasksFrame.setBounds(300, 0, 300, 400);
		projectTasksFrame.setVisible(true);
		
		projectTasksFrame.setLayout(new BorderLayout());
		JTable tasksTable = new JTable(new TasksTableModel(new HashSet<Task>()));
		projectTasksFrame.add(new JScrollPane(tasksTable));
		
		desktop.add(taskFrame);
		taskFrame.setLocation(0, 0);
		taskFrame.setBounds(300, 400, 300, 200);
		taskFrame.setVisible(true);
		
		taskFrame.setLayout(new GridBagLayout());

		JTextField tasknameTxt = new JTextField("Nom de la tâche");
		tasknameTxt.setEditable(false);
		JTextField estimationInitialeTxt = new JTextField("0");
		estimationInitialeTxt.setEditable(false);
		JTextField creationDateTxt = new JTextField("10/10/2070");
		creationDateTxt.setEditable(false);
		JTextField effortTxt = new JTextField("2");
		effortTxt.setEditable(false);
		JTextField totalTxt = new JTextField("12");
		totalTxt.setEditable(false);		
		JTextField ownerTxt = new JTextField("vague nerd");
		ownerTxt.setEditable(false);		
		
		taskFrame.add(new JLabel("Nom : "),GBC.GBC_LABEL);
		taskFrame.add(tasknameTxt,GBC.GBC_XREMAINDER);
		taskFrame.add(new JLabel("Propriétaire : "),GBC.GBC_LABEL);
		taskFrame.add(ownerTxt,GBC.GBC_XREMAINDER);
		taskFrame.add(new JLabel("Date de création : "),GBC.GBC_LABEL);
		taskFrame.add(creationDateTxt,GBC.GBC_XREMAINDER);
		taskFrame.add(new JLabel("Estimation Initiale : "),GBC.GBC_LABEL);
		taskFrame.add(estimationInitialeTxt,GBC.GBC_XREMAINDER);
		taskFrame.add(new JLabel("Total des imputations : "),GBC.GBC_LABEL);
		taskFrame.add(totalTxt,GBC.GBC_XREMAINDER);
		taskFrame.add(new JLabel("Effort (R.A.F.) : "),GBC.GBC_LABEL);
		taskFrame.add(effortTxt,GBC.GBC_XREMAINDER);
		
		JButton imputationButton = new JButton("Imputer");
		taskFrame.add(imputationButton,GBC.GBC_BUTTON);
	}
}
