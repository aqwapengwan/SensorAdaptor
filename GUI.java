/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaptorsensor;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;


public class GUI extends JFrame{
		public GUI(Adaptor a, Adaptor b, Adaptor c) {
			setTitle("Sensor Tracker");
			setLayout(new GridLayout(3,1));
			JPanel  aPnl = new JPanel();
			
			aPnl.setBorder(new TitledBorder(a.getName()));
			GridLayout aLayout = new GridLayout(0,2);
			aPnl.setLayout(aLayout);
			add(aPnl);
			double aValue = a.getValue();
			String aStatus = a.getStatus();
			JPanel aColor = new JPanel();
			if(aStatus.equalsIgnoreCase("Ok"))
				aColor.setBackground(Color.green);
			if(aStatus.equalsIgnoreCase("Critical"))
				aColor.setBackground(Color.yellow);
			if(aStatus.equalsIgnoreCase("Danger"))
				aColor.setBackground(Color.red);
			JLabel aLabel = new JLabel(aStatus + " --> " + aValue);
			aPnl.add(aColor);
			aPnl.add(aLabel);
			
			JPanel  bPnl = new JPanel();
			bPnl.setBorder(new TitledBorder(b.getName()));
			GridLayout bLayout = new GridLayout(0,2);
			bPnl.setLayout(bLayout);
			add(bPnl);
			double bValue = b.getValue();
			String bStatus = b.getStatus();
			JLabel bLabel = new JLabel(bStatus + " --> " + bValue);
			JPanel bColor = new JPanel();
			if(bStatus.equalsIgnoreCase("Ok"))
				bColor.setBackground(Color.green);
			if(bStatus.equalsIgnoreCase("Critical"))
				bColor.setBackground(Color.yellow);
			if(bStatus.equalsIgnoreCase("Danger"))
				bColor.setBackground(Color.red);
			bPnl.add(bColor);
			bPnl.add(bLabel);
			
			JPanel  cPnl = new JPanel();
			cPnl.setBorder(new TitledBorder(c.getName()));
			GridLayout cLayout = new GridLayout(0,2);
			cPnl.setLayout(cLayout);
			add(cPnl);
			double cValue = c.getValue();
			String cStatus = c.getStatus();
			JLabel cLabel = new JLabel(cStatus + " --> " + cValue);
			JPanel cColor = new JPanel();
			if(cStatus.equalsIgnoreCase("Ok"))
				cColor.setBackground(Color.green);
			if(cStatus.equalsIgnoreCase("Critical"))
				cColor.setBackground(Color.yellow);
			if(cStatus.equalsIgnoreCase("Danger"))
				cColor.setBackground(Color.red);
			cPnl.add(cColor);
			cPnl.add(cLabel);
			
			
			setPreferredSize(new Dimension(600,600));
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
			pack();
		}
	
}

