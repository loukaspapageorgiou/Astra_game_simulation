package spaceships;
import main.MainClass;
import javax.swing.ImageIcon;

public abstract class SpaceShip implements Navigation {
	protected ImageIcon SpaceShipImageIcon;
	public int getX() {return x;}
	public int getY() {return y;}
	
	public int x;
	public int y;
	public int speed;
	public String name;
	
	public SpaceShip(String name,int speed) {//constructor
		this.name = name;
		this.speed = speed;
		this.x=0;
		this.y = MainClass.cosmosHeight-MainClass.spaceShipHeight; //wste arxika na brisketai katw aristera
		
	}
	@Override
	public int moveUP() {
		if(y-speed>=0) {
			y-=speed;
			
		}
		return y;
		
	}
	
	@Override
	public int moveDOWN() {
		if(y+speed<=MainClass.cosmosHeight-MainClass.spaceShipHeight) {
			y+=speed;
		}
		return y;
	}
	
	@Override
	public int moveRIGHT() {
		if(x+speed<=MainClass.cosmosWidth-MainClass.spaceShipWidth) {
			x+=speed;
		}
		return x;
		
	}
	
	public int moveLEFT() {
		if(x-speed>=0) {
			x-=speed;
		}
		return x;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPosition() {
		return"(" + x + "," + y + ")";
	}
	public void printCoords() {
		System.out.println(name + " -> (" +x+","+y+ ")");
	}
	
	public ImageIcon getIcon() {
		return SpaceShipImageIcon;
	}

}
