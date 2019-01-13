package scripts.Lyminer.Methods;
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

    public class Methods implements Variables{
        public void mine(){

        }
        public void bank () {
                WebWalking.walkToBank();
                RSNPC[] nearestBanker = NPCs.findNearest("Banker");

                if (nearestBanker.length > 0){
                    Camera.turnToTile(nearestBanker[0].getPosition());

                    while (!nearestBanker[0].isOnScreen()){
                        sleep(100);
                    }
                }
                Banking.openBank();
                Banking.depositAllExcept(PICKAXE_ID);
                Banking.close();
        }
    }

