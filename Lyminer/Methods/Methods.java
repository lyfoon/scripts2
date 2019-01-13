
import org.tribot.api2007.Banking;
import org.tribot.api2007.Camera;
import org.tribot.api2007.NPCs;
import org.tribot.api2007.WebWalking;
import org.tribot.api2007.types.RSNPC;

    public class Methods implements Variables{
        public void mine(){

        }
        public void bank () {
                WebWalking.walkToBank();
                RSNPC[] nearestBanker = NPCs.findNearest("Banker");

                if (nearestBanker.length > 0){
                    Camera.turnToTile(nearestBanker[0].getPosition());

                    while (!nearestBanker[0].isOnScreen()){
                        wait(100);
                    }
                }
                Banking.openBank();
                Banking.depositAllExcept(PICKAXE_ID);
                Banking.close();
        }
    }

