package src;
import java.util.Random;

public class Mage extends Player
{
	public Mage(String name)
	{
		super(name);
		kills = 0;
		gen = new Random();
	}
	public int getKill()
	{
		return kills;
	}
	public void addKill()
	{
		kills++;
	}
	public void move()
	{
		if(liveCheck())
		{
			addX((gen.nextInt(20) + 1) - 10);
			addY((gen.nextInt(20) + 1) - 10);
		
			if (gen.nextInt(10) == 0)
				damage(10);
			if (gen.nextInt(8) == 0)
				kills++;
		}
	}
	public String[] getStats()
	{
		String[] a = new String[4];
		a[0] = "Name: " + getName();
		a[1] = "HP: " + getHP();
		a[2] = "Location: " + getX() + ", " + getY();
		a[3] = "Kills: " + getKill();
		return a;
	}
	private Random gen;
	private int kills;
}
