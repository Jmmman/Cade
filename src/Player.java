
public class Player 
{
	public Player(String nam)
	{
		health = 100;
		locX = 0;
		locY = 0;
		alive = true;
		name = nam;
	}
	public void move()
	{
		locX++;
		locY++;
	}
//	public void moveUp()
//	{
//		locY--;
//	}
//	public void moveDown()
//	{
//		locY++;
//	}
//	public void moveLeft()
//	{
//		locX--;
//	}
//	public void moveRight()
//	{
//		locX++;
//	}
	
	public int getX()
	{
		return locX;
	}
	public int getY()
	{
		return locY;
	}
	public void addX(int x)
	{
		locX += x;
	}
	public void addY(int y)
	{
		locY += y;
	}
	public int getHP()
	{
		return health;
	}
	public void damage(int hp)
	{
		health -= hp;
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
	public String getStats()
	{
		return "Name: " + name + "\n" + "HP: " + health + "\n" + "Location: " + getX() + ", " + getY() + "\n";
	}
	private int health;
	private int locY;
	private int locX;
	private boolean alive;
	private String name;
}
