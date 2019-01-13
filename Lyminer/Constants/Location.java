package scripts.Lyminer.Constants;

import org.tribot.api.DynamicClicking;
import org.tribot.api.General;
import org.tribot.api.Timing;
import org.tribot.api.types.generic.Condition;
import org.tribot.api2007.Banking;
import org.tribot.api2007.Camera;
import org.tribot.api2007.Inventory;
import org.tribot.api2007.NPCChat;
import org.tribot.api2007.NPCs;
import org.tribot.api2007.Objects;
import org.tribot.api2007.PathFinding;
import org.tribot.api2007.Player;
import org.tribot.api2007.WebWalking;
import org.tribot.api2007.types.RSArea;
import org.tribot.api2007.types.RSItem;
import org.tribot.api2007.types.RSNPC;
import org.tribot.api2007.types.RSObject;
import org.tribot.api2007.types.RSTile;
import package.Lyminer.Constants.Location;


public  enum Location {
    LUMBRIDGE_MINE	  ("Lumbridge Mine", new RSArea(new RSTile(3222, 3144, 0), new RSTile(3230, 3149, 0)),new RSTile(3209, 3220, 2) , new HashSet <Integer>(scripts.Lyminer.Constants.oreTypes.TIN,scripts.Lyminer.Constants.oreTypes.COPPER)),
    ALKHARID_MINE	  ("Al Kharid Mine", new RSArea(new RSTile(2508, 3486, 0), new RSTile(2497, 3514, 0)),new RSTile(3209, 3220, 2) , new HashSet<Integer>(scripts.Lyminer.Constants.oreTypes.TIN,scripts.Lyminer.Constants.oreTypes.COPPER,scripts.Lyminer.Constants.oreTypes.IRON,scripts.Lyminer.Constants.oreTypes.SILVER,scripts.Lyminer.Constants.oreTypes.COAL,scripts.Lyminer.Constants.oreTypes.GOLD,scripts.Lyminer.Constants.oreTypes.MITHRIL,scripts.Lyminer.Constants.oreTypes.ADAMANTITE)),

    VARROCK_EAST_MINE ("Varrock East Mine", new RSArea(new RSTile(2834, 3435, 0), new RSTile(2862, 3420, 0)), new RSTile(2809, 3441, 0), new RSTile(2843, 3432, 0), );


    private String name;
    private RSArea area;
    private RSTile bankPosition;
    private oreTypes ores;

    Location(String name, RSArea locationArea, RSTile bankPosition, oreTypes.ids)
    {
        this.name = name;
        this.area = locationArea;
        this.bankPosition = bankPosition;
        this.oreTypes = ores;
    }


    public RSArea getArea()
    {
        return this.area;
    }

    public void setArea(RSArea area)
    {
        this.area = area;
    }


    public RSTile getBankingSupported()
    {
        return this.bankPosition;
    }

    public void setBankingSupported(RSTile bankPos)
    {
        this.bankPosition = bankPos;
    }



    getoreTypes()
    {
        this.oreTypes;
    }

     setoreTypes()
    {
        this.oreTypes = ores;
    }

    public boolean isAtLocation(RSTile tile)
    {
        return area.contains(tile);
    }



    @Override
    public String toString()
    {
        return name;
    }





    public void toBank()
    {
        if(bankPosition != null)
        {
            WebWalking.walkTo(bankPosition, new Condition() {

                @Override
                public boolean active() {
                    return bankPosition.distanceTo(Player.getPosition()) <= 3;
                }
            }, General.random(3000, 4000));
        }

    }
}