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
		addX((gen.nextInt(50) + 1) - 25);
		addY((gen.nextInt(50) + 1) - 25);
		
		if (gen.nextInt(4) == 0)
			damage(10);
		if (gen.nextInt(5) == 0)
			getSteal();
	}
	public String getStats()
	{
		return super.getStats() + "Steals: " + steal;
	}
	private Random gen;
	private int steal;
}
