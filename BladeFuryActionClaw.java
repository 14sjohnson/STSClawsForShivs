import com.megacrit.cardcrawl.actions.AbstractGameAction;
import com.megacrit.cardcrawl.actions.common.DiscardAction;
import com.megacrit.cardcrawl.actions.common.MakeTempCardInHandAction;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.cards.blue.Claw;
import com.megacrit.cardcrawl.cards.tempCards.Shiv;
import com.megacrit.cardcrawl.core.AbstractCreature;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;

public class BladeFuryActionClaw extends AbstractGameAction {
    private boolean upgrade;

    public BladeFuryActionClaw(boolean upgraded) {
        this.upgrade = upgraded;
    }

    public void update() {
        int theSize = AbstractDungeon.player.hand.size();
        if (this.upgrade) {
            AbstractCard s = (new Claw()).makeCopy();
            s.upgrade();
            addToTop((AbstractGameAction)new MakeTempCardInHandAction(s, theSize));
        } else {
            addToTop((AbstractGameAction)new MakeTempCardInHandAction((AbstractCard)new Claw(), theSize));
        }
        addToTop((AbstractGameAction)new DiscardAction((AbstractCreature)AbstractDungeon.player, (AbstractCreature)AbstractDungeon.player, theSize, false));
        this.isDone = true;
    }
}
