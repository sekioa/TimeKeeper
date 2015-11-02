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

public class ComputeUserConnection extends AbstractAction {
	CapFinderImpl finder = CapFinderImpl.getInstance();
	
    public void actionPerformed(ActionEvent e)  {
        String nickName =((JTextField)e.getSource()).getText(); 
        User user = finder.findUserByNickname(nickName);
        if (user!=null) {
        	if (user.isAdministrator()) {
        		
        	}
        	if (user.isTeamMember()) {
        		new OpenUserDashBoard(user).actionPerformed(e);
        	}
        } else {
        	String msg = "L'utilisateur " + nickName +" n'existe pas." ;
        	JOptionPane.showMessageDialog((Component)e.getSource(), msg);
        	System.out.println(msg);
        	
        }
    }
}
