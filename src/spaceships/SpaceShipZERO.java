package spaceships;
import javax.swing.ImageIcon;
import java.awt.Image;
import javax.imageio.ImageIO;
import main.MainClass;

public class SpaceShipZERO extends SpaceShip{
	public static Image img;
	static {
		try {
			SpaceShipZERO.img = ImageIO.read(MainClass.class.getResource("/images/ZERO.png"));
		}
		catch(Exception ex) {System.out.println(ex);}
	}
	public SpaceShipZERO() {
		super("ZERO",5);
		//name = "ZERO";
		//speed = 5;
		x = 0;
		y = MainClass.cosmosHeight-MainClass.spaceShipHeight-MainClass.yOffSet;
		super.SpaceShipImageIcon = new ImageIcon(SpaceShipZERO.img);
		}
	
}
