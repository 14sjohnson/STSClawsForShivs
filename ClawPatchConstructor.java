import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.blue.Claw;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


//
//@SpirePatch(clz = Claw.class, method = "use")
//public class ClawPatch {
//    @SpireInsertPatch(rloc = 4)
//    public static void Insert(Claw __instance) {
//        AbstractDungeon.actionManager.addToBottom((AbstractGameAction)new GashAction(__instance, 10));
//    }
//}
////
////@SpirePatch(clz = Claw.class, method = )
//
//
//
//


@SpirePatch(clz = Claw.class, method = SpirePatch.CONSTRUCTOR)
public class ClawPatchConstructor {
    public static final Logger logger = LogManager.getLogger(ModInitializer.class.getName());


    public static void Postfix(Claw __instance) {
        __instance.baseDamage += ClawCountTracker.timesClawHasBeenUsed*2;
        __instance.baseMagicNumber = 1;
        __instance.magicNumber = 1;
        //__instance.rawDescription = "Deal 2 damage, increase all claw's damage by 1";
        logger.info("ClawPatch: Here"+__instance.baseDamage);
    }
}
