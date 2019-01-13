import org.tribot.api2007.types.RSArea;
import org.tribot.api2007.types.RSTile;

import Constants.oreTypes;

public abstract class RLocation 
{
	protected String name;
	protected RSArea area;
	protected RSTile bankPosition;
	protected OreType[] oreType;
	
	public RLocation(String name, RSArea locationArea, RSTile bankPosition, OreType[] oreType)
	{
		this.name = name;
		this.area = locationArea;
		this.bankPosition = bankPosition;
		this.oreType = oreType;
	}
	
	public int[] getOreTypeIds()
	{
		int[] ids = new int[oreType.length];
		
		for(int i = 0; i < oreType.length; i++)
		{
			ids[0] = oreType[0].getRockId();
		}
		
		return ids;
	}
}
