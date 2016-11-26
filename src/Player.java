import java.util.Scanner;
public class Player 
{
	public Player(String fac, String rac)
	{
		health = 100;
		locX = 0;
		locY = 0;
		alive = true;
		
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
	private String faction;
	private Scanner in = new Scanner(System.in);
}
