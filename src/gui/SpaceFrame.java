package gui;
import javax.swing.*;
import java.awt.*;

public class SpaceFrame extends JFrame {
	private static final long serialVersionUID=1L;
	static int width;
	static int height;
	static SelectSpaceshipScreen selectSpaceShipScreen = new SelectSpaceshipScreen();
	static GamePlayScreen gamePlayScreen = new GamePlayScreen();
	static CardLayout cardLayout = new CardLayout();
	static JPanel spaceFramePanel = new JPanel();
	public SpaceFrame(int width,int height) {
		SpaceFrame.width = width;
		SpaceFrame.height=height;
		this.setSize(width,height);
		this.setTitle("Astra game simulation");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setFocusable(true);
		setupMasterPanel();
		setResizable(false);
		this.setVisible(true);
		
	}
	
	void setupMasterPanel() {
		spaceFramePanel.setLayout(cardLayout);
		spaceFramePanel.add(selectSpaceShipScreen);
		spaceFramePanel.add(gamePlayScreen);
		this.add(spaceFramePanel);
		
	}
	

}
