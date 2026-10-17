package spaceships;
import javax.swing.ImageIcon;
import java.awt.Image;
import javax.imageio.ImageIO;
import main.MainClass;

public class SpaceShipBETA extends SpaceShip{
	public static Image img;
	static {
		try {
			SpaceShipBETA.img = ImageIO.read(MainClass.class.getResource("/images/BETA.png"));
		}
		catch(Exception ex) {System.out.println(ex);}
	}
	public SpaceShipBETA() {
		super("BETA",20);
		//name = "ALPHA";
		//speed = 20;
		x = 0;
		y = MainClass.cosmosHeight-MainClass.spaceShipHeight-MainClass.yOffSet;
		super.SpaceShipImageIcon = new ImageIcon(SpaceShipBETA.img);
		}
	
}
