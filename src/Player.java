import java.util.Scanner;
public class Player 
{
	public Player(String nam)
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
	public String getName()
	{
		return name;
	}
	public boolean liveCheck()
	{
		if (health <= 0)
			alive = false;
		return alive;
	}
	private int health;
	private int locY;
	private int locX;
	private boolean alive;
	private String name;
	private Scanner in = new Scanner(System.in);
}
