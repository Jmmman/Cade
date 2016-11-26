import java.util.Scanner;
public class Player 
{
	public Player(boolean fac, String rac, String nam)
	{
		health = 100;
		locX = 0;
		locY = 0;
		alive = true;
		faction = fac;
	}
	
	public void moveUp()
	{
		locY--;
	}
	public void moveDown()
	{
		locY++;
	}
	public void moveLeft()
	{
		locX--;
	}
	public void moveRight()
	{
		locX++;
	}
	
	public int getX()
	{
		return locX;
	}
	public int getY()
	{
		return locY;
	}
	public int getHP()
	{
		return health;
	}
	private int health;
	private int locY;
	private int locX;
	private boolean alive;
	private String race;
	private String name;
	private boolean faction;
	private Scanner in = new Scanner(System.in);
}
