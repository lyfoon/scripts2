package scripts.Lyminer;
import org.tribot.api.General;
import org.tribot.api2007.Login;

import org.tribot.script.Script;
import org.tribot.script.ScriptManifest;

@ScriptManifest(authors = { "Lyfoon" }, category = "Mining", name = "LyMiner")
public class LyMiner extends Script {
    public void onStart() {
        println("LyMiner Has Started!");
        println("Please Report Any Bugs/Suggestions to Lyfoon on TriBot"); }

    public void run() {
        while (true) {
        }

    }
    public void onEnd()
    {
        println("LyMiner has stopped!");
        println("Thanks for using my script, please report any bugs to Lyfoon on Tribot");
    }
}

