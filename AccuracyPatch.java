//import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
//import com.megacrit.cardcrawl.actions.AbstractGameAction;
//import com.megacrit.cardcrawl.actions.common.GainBlockAction;
//import com.megacrit.cardcrawl.actions.common.MakeTempCardInHandAction;
//import com.megacrit.cardcrawl.cards.AbstractCard;
//import com.megacrit.cardcrawl.cards.blue.Claw;
//import com.megacrit.cardcrawl.cards.green.BladeDance;
//import com.megacrit.cardcrawl.cards.green.CloakAndDagger;
//import com.megacrit.cardcrawl.characters.AbstractPlayer;
//import com.megacrit.cardcrawl.core.AbstractCreature;
//import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
//import com.megacrit.cardcrawl.monsters.AbstractMonster;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//
//@SpirePatch(clz = CloakAndDagger.class, method = "use")
//public class AccuracyPatch {
//    public static void Replace(BladeDance __instance, AbstractPlayer p, AbstractMonster m) {
//        Logger logger = LogManager.getLogger(ModInitializer.class.getName());
//        logger.info("adding claws");
//        AbstractDungeon.actionManager.addToBottom((AbstractGameAction)new GainBlockAction((AbstractCreature)p, (AbstractCreature)p, __instance.block));
//        AbstractDungeon.actionManager.addToBottom((AbstractGameAction)new MakeTempCardInHandAction((AbstractCard)new Claw(), __instance.magicNumber));
//    }
//}