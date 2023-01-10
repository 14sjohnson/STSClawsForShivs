import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.actions.AbstractGameAction;
import com.megacrit.cardcrawl.actions.common.MakeTempCardInHandAction;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.cards.blue.Claw;
import com.megacrit.cardcrawl.cards.green.BladeDance;
import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import com.megacrit.cardcrawl.monsters.AbstractMonster;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SpirePatch(clz = BladeDance.class, method = "use")
class BladeDancePatch {
    public static void Replace(BladeDance __instance, AbstractPlayer p, AbstractMonster m) {
        AbstractDungeon.actionManager.addToBottom((AbstractGameAction)new MakeTempCardInHandAction((AbstractCard)new Claw(), __instance.magicNumber));
    }
}

@SpirePatch(clz = BladeDance.class, method = SpirePatch.CONSTRUCTOR)
class BladeDanceConPatch {
    public static void Postfix(BladeDance __instance) {
        __instance.cardsToPreview = (AbstractCard)new Claw();
        __instance.rawDescription = "Add !M! *Claws into your hand.";
    }
}
