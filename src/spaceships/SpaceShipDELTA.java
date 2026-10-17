package spaceships;
import javax.swing.ImageIcon;
import java.awt.Image;
import javax.imageio.ImageIO;

import main.MainClass;

public class SpaceShipDELTA extends SpaceShip{
	public static Image img;
	static {
		try {
			SpaceShipDELTA.img = ImageIO.read(MainClass.class.getResource("/images/DELTA.png"));
		}
		catch(Exception ex) {System.out.println(ex);}
	}
	public SpaceShipDELTA() {
		super("DELTA",40);
		//name = "DELTA";
		//speed = 40;
		x = 0;
		y = MainClass.cosmosHeight-MainClass.spaceShipHeight-MainClass.yOffSet;
		super.SpaceShipImageIcon = new ImageIcon(SpaceShipDELTA.img);
	}

}
