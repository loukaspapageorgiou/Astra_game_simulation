package spaceships;
import javax.swing.ImageIcon;
import java.awt.Image;
import javax.imageio.ImageIO;
import main.MainClass;

public class SpaceShipALPHA extends SpaceShip{
	public static Image img;
	static {
		try {
			SpaceShipALPHA.img = ImageIO.read(MainClass.class.getResource("/images/ALPHA.png"));
		}
		catch(Exception ex) {System.out.println(ex);}
	}
	public SpaceShipALPHA() {
		super("ALPHA",10);
		//name = "ALPHA";
		//speed = 10;
		x = 0;
		y = MainClass.cosmosHeight-MainClass.spaceShipHeight-MainClass.yOffSet;
		super.SpaceShipImageIcon = new ImageIcon(SpaceShipALPHA.img);
		}
	
}