package scripts.Lyminer.Constants;


import org.tribot.api2007.Skills;
import java.util.HashSet;

public enum oreTypes
{
    CLAY(6705, 434,1),
    COPPER(4645, 436,1),
    TIN(53, 438,1),
    IRON(2576, 440,15),
    SILVER(7366, 442,20),
    COAL(7580, 453,30),
    GOLD(8885, 444,40),
    MITHRIL(-22239, 447,55),
    ADAMANTITE(21662, 449,70),
    RUNITE(-31437, 451,85);

    private int color;
    private int itemId;
    private int requiredLevel;
    public HashSet<Integer> ids = new HashSet<Integer>();
    //The ids hashset contains all of the found object ids for target rocks

    oreTypes(int color, int itemId, int requiredLevel)
    {
        this.color = color;
        this.itemId = itemId;
        this.requiredLevel = requiredLevel;
    }

    public int getRequiredLevel()
    {
        return requiredLevel;
    }

    public int getColor()
    {
        return color;
    }

    public int getRockId()
    {
        return itemId;
    }

    public HashSet<Integer> getIds()
    {
        return ids;
    }




     int currentLvl() {
        int current = Skills.getCurrentLevel(Skills.SKILLS.MINING);
        return current;
    }


        }


