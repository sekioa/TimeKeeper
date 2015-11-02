package fr.jservices.timekeeper.front.action;

import java.awt.Dimension;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;

import fr.jservices.timekeeper.front.ConnexionPanel;
import fr.jservices.timekeeper.front.swingutils.FRAME;
import fr.jservices.timekeeper.service.impl.CapFinderImpl;

public class OpenConnection  extends AbstractAction {
	CapFinderImpl finder = CapFinderImpl.getInstance();
    public void actionPerformed(ActionEvent e)  {
		JFrame f = new JFrame("TimeKeeper");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setContentPane(new ConnexionPanel());
		f.setPreferredSize(new Dimension(200,f.getPreferredSize().height));
		f.pack();
		FRAME.center(f);
		f.setVisible(true);
    }
}
