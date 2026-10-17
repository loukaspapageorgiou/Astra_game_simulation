package spaceships;
import javax.swing.ImageIcon;
import java.awt.Image;
import javax.imageio.ImageIO;
import main.MainClass;

public class SpaceShipGAMA extends SpaceShip{
	public static Image img;
	static {
		try {
			SpaceShipGAMA.img = ImageIO.read(MainClass.class.getResource("/images/GAMA.png"));
		}
		catch(Exception ex) {System.out.println(ex);}
	}
	public SpaceShipGAMA() {
		super("GAMA",30);
		//name = "GAMA";
		//speed = 30;
		x = 0;
		y = MainClass.cosmosHeight-MainClass.spaceShipHeight-MainClass.yOffSet;
		super.SpaceShipImageIcon = new ImageIcon(SpaceShipGAMA.img);
		}
	
}
