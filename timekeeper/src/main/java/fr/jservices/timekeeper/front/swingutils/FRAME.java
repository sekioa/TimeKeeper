package fr.jservices.timekeeper.front.swingutils;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class FRAME {
	public static void center(JFrame f) {
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2);
	}
}
