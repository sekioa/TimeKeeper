package fr.jservices.timekeeper;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.pushingpixels.substance.api.skin.SubstanceGraphiteLookAndFeel;

import fr.jservices.timekeeper.front.ConnexionPanel;
import fr.jservices.timekeeper.front.action.OpenConnection;
import fr.jservices.timekeeper.front.swingutils.FRAME;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Throwable {
		   JFrame.setDefaultLookAndFeelDecorated(true);
		    SwingUtilities.invokeLater(new Runnable() {
		      public void run() {
		        try {
		          UIManager.setLookAndFeel(new SubstanceGraphiteLookAndFeel());
		        } catch (Exception e) {
		          System.out.println("Substance Graphite failed to initialize");
		        }
		        new OpenConnection().actionPerformed(null);
			}
		});

	}

}
