package src;
import java.util.Random;

public class Rogue extends Player
{
	public Rogue(String name)
	{
		super(name);
		steal = 0;
		gen = new Random();
		
	}
	public int getSteal()
	{
		return steal;
	}
	public void addSteal()
	{
		steal++;
	}
	public void move()
	{
		if (liveCheck())
		{
			addX((gen.nextInt(50) + 1) - 25);
			addY((gen.nextInt(50) + 1) - 25);
		
			if (gen.nextInt(4) == 0)
				damage(10);
			if (gen.nextInt(5) == 0)
				steal++;
		}
	}
	public String[] getStats()
	{
		String[] a = new String[4];
		a[0] = "Name: " + getName();
		a[1] = "HP: " + getHP();
		a[2] = "Location: " + getX() + ", " + getY();
		a[3] = "Steals: " + getSteal();
		return a;
	}
	private Random gen;
	private int steal;
}
