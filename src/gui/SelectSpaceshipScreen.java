package gui;
import javax.swing.*;
import spaceships.*;
import java.awt.*;
import java.awt.event.*;

public class SelectSpaceshipScreen extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private String[] shipImages = {
            "/images/ZERO.png",
            "/images/ALPHA.png",
            "/images/BETA.png",
            "/images/GAMA.png",
            "/images/DELTA.png"
    };

    //private JLabel[] shipLabels = new JLabel[5];
    //private int selectedShip = -1;
	
	
	SelectSpaceshipScreen(){
		this.setLayout(new BorderLayout(30,30));
		this.add(createNorthPanel(),BorderLayout.NORTH);
		this.add(createCenterPanel(),BorderLayout.CENTER);
		//this.add(createSouthPanel(),BorderLayout.SOUTH);
		this.setBackground(Color.BLACK);
	}
	
	private JPanel createNorthPanel() {
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(100,100));
		JLabel label = new JLabel("Please choose your spaceship");
		label.setFont(new Font("Arcade Classic",Font.PLAIN,25));
		label.setForeground(Color.WHITE);
		panel.setBackground(Color.BLACK);
		panel.add(label);
		return panel;
	}
	
	private JPanel createCenterPanel() {
		JPanel panel = new JPanel();
	    panel.setLayout(new GridLayout(1, 5, 10, 10)); // 1 row, 5 columns, 10px padding
	    panel.setBackground(Color.BLACK);

	    String[] names = {"SZERO", "SALPHA", "SBETA", "SGAMA", "SDELTA"};
	    int btnWidth = 100;
	    int btnHeight = 100;

	    for (int i = 0; i < shipImages.length; i++) {
	        JButton btn = new JButton();

	        
	        ImageIcon originalIcon = new ImageIcon(getClass().getResource(shipImages[i]));
	        Image scaledImg = originalIcon.getImage().getScaledInstance(btnWidth, btnHeight, Image.SCALE_SMOOTH);
	        btn.setIcon(new ImageIcon(scaledImg));

	        btn.setFocusPainted(false);
	        btn.setBorderPainted(false);
	        btn.setContentAreaFilled(false);

	        
	        btn.addActionListener(new SpaceShipSelectionBtnHandler(names[i]));

	        panel.add(btn);
	    }

	    return panel;
		
		
	}
	//private JPanel createSouthPanel() {
		//JPanel panel = new JPanel();
		//panel.setPreferredSize(new Dimension(100,50));
		//JLabel label = new JLabel("Use arrow keys to move your spaceship");
		//label.setFont(new Font("Arcade classic",Font.PLAIN,16));
		//label.setForeground(Color.WHITE);
		//label.setBackground(Color.BLACK);
		//panel.add(label);
		//return panel;
	//}
}


class SpaceShipSelectionBtnHandler implements ActionListener{
	String name;
	
	public SpaceShipSelectionBtnHandler(String x) {
		name =x;
		
	}
	public void actionPerformed(ActionEvent ev) {
		SpaceFrame.cardLayout.next(SpaceFrame.spaceFramePanel);
		SpaceFrame.gamePlayScreen.setFocusable(true); //to cath the keyevents
		SpaceFrame.gamePlayScreen.requestFocusInWindow();
		
		if(name.equalsIgnoreCase("SZERO")) SpaceFrame.gamePlayScreen.setUserSpaceShip(new SpaceShipZERO());
		if(name.equalsIgnoreCase("SALPHA")) SpaceFrame.gamePlayScreen.setUserSpaceShip(new SpaceShipALPHA());
		if(name.equalsIgnoreCase("SBETA")) SpaceFrame.gamePlayScreen.setUserSpaceShip(new SpaceShipBETA());
		if(name.equalsIgnoreCase("SGAMA")) SpaceFrame.gamePlayScreen.setUserSpaceShip(new SpaceShipGAMA());
		if(name.equalsIgnoreCase("SDELTA")) SpaceFrame.gamePlayScreen.setUserSpaceShip(new SpaceShipDELTA());
		
		SpaceFrame.gamePlayScreen.repaint();
	}
	
}
