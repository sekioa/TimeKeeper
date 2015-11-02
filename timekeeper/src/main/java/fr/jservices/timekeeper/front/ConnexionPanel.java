package fr.jservices.timekeeper.front;

import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import fr.jservices.timekeeper.business.srcummanagement.User;
import fr.jservices.timekeeper.front.action.ComputeUserConnection;
import fr.jservices.timekeeper.front.action.OpenUserDashBoard;
import fr.jservices.timekeeper.front.swingutils.GBC;
import fr.jservices.timekeeper.service.Finder;

public class ConnexionPanel extends JPanel{
	JTextField nickTextfield = new JPasswordField();
	
	Finder finder;
	
	public ConnexionPanel() {
		super(new GridBagLayout());
		add(new JLabel("Nickname :"), GBC.GBC_LABEL);
		add(nickTextfield, GBC.GBC_XREMAINDER);

		nickTextfield.addActionListener(new ComputeUserConnection());

	}
}
