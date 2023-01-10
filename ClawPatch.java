import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.blue.Claw;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@SpirePatch(clz = Claw.class, method = "use")
class ClawPatch {
    public static final Logger logger = LogManager.getLogger(ModInitializer.class.getName());


    public static void Postfix(Claw __instance) {
        ClawCountTracker.increaseClawCount();
    }
}

@SpirePatch(clz = Claw.class, method = SpirePatch.CONSTRUCTOR)
class ClawPatchCon {
    public static final Logger logger = LogManager.getLogger(ModInitializer.class.getName());


    public static void Postfix(Claw __instance) {
        __instance.baseDamage += ClawCountTracker.timesClawHasBeenUsed*2;
        //__instance.baseMagicNumber = 1;
        //__instance.magicNumber = 1;
        //__instance.rawDescription = "Deal 2 damage, increase all claw's damage by 1";
        //logger.info("ClawPatch: Here"+__instance.baseDamage);
    }
}
