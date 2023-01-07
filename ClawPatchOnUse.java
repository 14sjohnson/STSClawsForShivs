import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.blue.Claw;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@SpirePatch(clz = Claw.class, method = "use")
public class ClawPatchOnUse {
    public static final Logger logger = LogManager.getLogger(ModInitializer.class.getName());


    public static void Postfix(Claw __instance) {
        //ClawCountTracker.increaseClawCount();
    }
}
