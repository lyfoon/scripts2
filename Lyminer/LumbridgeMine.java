import org.tribot.api2007.types.RSArea;
import org.tribot.api2007.types.RSTile;

public class LumbridgeMine extends RLocation 
{
	private static final String NAME = "Lumbridge Mine";
	private static final RSArea AREA = new RSArea(new RSTile(3222, 3144, 0), new RSTile(3230, 3149, 0));
	private static final RSTile BANK = new RSTile(3209, 3220, 2);
	
	private static final OreType[] oreType = { OreType.TIN, OreType.COPPER};
	
	public LumbridgeMine()
	{
		super(NAME, AREA, BANK, oreType);
	}
}

