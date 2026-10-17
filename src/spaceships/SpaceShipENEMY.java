package spaceships;
import javax.swing.ImageIcon;
import java.awt.Image;
import javax.imageio.ImageIO;
import main.MainClass;

public class SpaceShipENEMY extends SpaceShip{
	public static Image img;
	static {
		try {
			SpaceShipENEMY.img = ImageIO.read(MainClass.class.getResource("/images/ENEMY.png"));
		}
		catch(Exception ex) {System.out.println(ex);}
	}
	public SpaceShipENEMY() {
		super("ENEMY",15);
		//name = "ENEMY";
		//speed = 15;
		x = 0;
		y = MainClass.cosmosHeight-MainClass.spaceShipHeight-MainClass.yOffSet;
		super.SpaceShipImageIcon = new ImageIcon(SpaceShipENEMY.img);
		}
	
}
