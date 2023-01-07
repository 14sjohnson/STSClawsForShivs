import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.actions.AbstractGameAction;
import com.megacrit.cardcrawl.actions.common.MakeTempCardInHandAction;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.cards.blue.Claw;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import com.megacrit.cardcrawl.powers.InfiniteBladesPower;

@SpirePatch(clz = InfiniteBladesPower.class, method = "atStartOfTurn")
public class ModifyInfiniteBlades {
    public static void Replace(InfiniteBladesPower __instance) {
        if (!AbstractDungeon.getMonsters().areMonstersBasicallyDead()) {
            __instance.flash();
            AbstractDungeon.actionManager.addToBottom((AbstractGameAction)new MakeTempCardInHandAction((AbstractCard)new Claw(), __instance.amount, false));
        }
    }
}
