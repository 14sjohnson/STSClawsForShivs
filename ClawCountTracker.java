import basemod.helpers.BaseModCardTags;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.cards.CardGroup;
import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import java.util.Iterator;

public class ClawCountTracker {
    public static int timesClawHasBeenUsed = 0;

    public static void increaseClawCount(){
        timesClawHasBeenUsed+=1;
    }
}
