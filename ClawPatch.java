import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.cards.blue.Claw;
import com.megacrit.cardcrawl.characters.TheSilent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.pattern.AbstractStyleNameConverter;
import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.characters.TheSilent;
import javax.swing.*;


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
//        if (playerClass == AbstractPlayer.PlayerClass.THE_SILENT){
//        }
        __instance.baseDamage += ClawCountTracker.timesClawHasBeenUsed*2;
        __instance.color = AbstractCard.CardColor.GREEN;
        //__instance.baseMagicNumber = 1;
        //__instance.magicNumber = 1;
        //__instance.rawDescription = "Deal 2 damage, increase all claw's damage by 1";
        //__instance.rawDescription = "Deal 2 damage, increase all claw's damage by 1";
        //logger.info("ClawPatch: Here"+__instance.baseDamage);
    }
}
