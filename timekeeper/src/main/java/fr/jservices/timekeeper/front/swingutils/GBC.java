package fr.jservices.timekeeper.front.swingutils;

import java.awt.GridBagConstraints;

public class GBC {
	public final static GridBagConstraints GBC_LABEL;
	public final static GridBagConstraints GBC_XREMAINDER;
	public final static GridBagConstraints GBC_BUTTON;
	static {
		GBC_LABEL = new GridBagConstraints();
		GBC_LABEL.weightx = 0;
		GBC_LABEL.fill = GridBagConstraints.BOTH;
		
		GBC_XREMAINDER = new GridBagConstraints();
		GBC_XREMAINDER.weightx=1;
		GBC_XREMAINDER.gridwidth = GridBagConstraints.REMAINDER;
		GBC_XREMAINDER.fill = GridBagConstraints.BOTH;
		
		GBC_BUTTON = new GridBagConstraints();
		GBC_BUTTON.weightx=1;
		GBC_BUTTON.weighty=1;
		GBC_BUTTON.gridwidth = GridBagConstraints.REMAINDER;
		GBC_BUTTON.gridheight = GridBagConstraints.REMAINDER;
		GBC_BUTTON.fill = GridBagConstraints.NONE;
	}
}
