package fr.jservices.timekeeper.front.action;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.util.Observer;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import fr.jservices.timekeeper.business.srcummanagement.User;
import fr.jservices.timekeeper.front.UserDashBoardPanel;
import fr.jservices.timekeeper.front.swingutils.FRAME;
import fr.jservices.timekeeper.service.Finder;
import fr.jservices.timekeeper.service.impl.CapFinderImpl;

public class OpenUserDashBoard extends AbstractAction {
	CapFinderImpl finder = CapFinderImpl.getInstance();
	User user;
	
	public OpenUserDashBoard(User user) {
		this.user=user;
	}
	
    public void actionPerformed(ActionEvent e)  {
        if (user!=null) {
        	if (user.isTeamMember()) {
        		JFrame f = new JFrame("DashBoard : " + user.getForename() + " " + user.getLastname());
        		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        		f.setContentPane(new UserDashBoardPanel(user));
				f.setPreferredSize(new Dimension(1024,780));
        		f.pack();
        		FRAME.center(f);
        		f.setVisible(true);
        	}
        } else {
        	String msg = "L'utilisateur n'existe pas." ;
        	JOptionPane.showMessageDialog((Component)e.getSource(), msg);
        	System.out.println(msg);
        	
        }
    }
}
