package Monster.model;

public class MarshmallowMonster 
{
	
	//Declaration Section
	private String name;
	private double numberOfLegs; //2
	private double hairCount; //3
	private int eyeCount; //5
	private int noseCount; //1
	private int armCount; //3
	private boolean hasBellyButton;
	
	public MarshmallowMonster()
	{
		
	}
	
	public MarshmallowMonster(String name, double numberOfLegs, double hairCount, int eyeCount, int noseCount, int armCount, boolean hasBellyButton)
	{
		this.name = name;
		this.numberOfLegs = numberOfLegs;
		this.hairCount = hairCount;
		this.eyeCount = eyeCount;
		this.noseCount = noseCount;
		this.armCount = armCount;
		this.hasBellyButton = hasBellyButton;
				
		
				
	}
	
	public String getName()
	{
		return name;
	}
	public double getNumberOfLegs()
	{
		return numberOfLegs;
	}
	public double gethairCount()
	{
		return hairCount;
	}
	public int geteyeCount()
	{
		return eyeCount;
	}
	public int getnoseCount()
	{
		return noseCount;
	}
	public int getarmCount()
	{
		return armCount;
	}
	public boolean gethasBellyButton()
	{
		return hasBellyButton;
	}
}

