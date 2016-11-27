package src;
import java.util.Random;

public class Mage extends Player
{
	public Mage(String name)
	{
		super(name);
		kills = 0;
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
				getKill();
		}
	}
	public String getStats()
	{
		return super.getStats() + "Kills: " + kills;
	}
	private Random gen;
	private int kills;
}
