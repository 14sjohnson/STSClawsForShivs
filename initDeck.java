//import basemod.helpers.BaseModCardTags;
//import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
//import com.megacrit.cardcrawl.cards.AbstractCard;
//import com.megacrit.cardcrawl.cards.CardGroup;
//import com.megacrit.cardcrawl.characters.AbstractPlayer;
//import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
//import java.util.Iterator;
//
//@SpirePatch(clz = AbstractPlayer.class, method = "initializeStarterDeck")
//public class initDeck {
//    public static void Postfix(AbstractPlayer __instance) {
//        int count = 0;
//        for (Iterator<AbstractCard> i = AbstractDungeon.player.masterDeck.group.iterator(); i.hasNext(); ) {
//            AbstractCard e = i.next();
//            if (e.hasTag(BaseModCardTags.BASIC_STRIKE) || e.hasTag(BaseModCardTags.BASIC_DEFEND)) {
//                i.remove();
//                count++;
//            }
//        }
//        if (count > 0) {
//            CardGroup group = new CardGroup(CardGroup.CardGroupType.UNSPECIFIED);
//            for (int j = 0; j < count; j++) {
//                __instance.masterDeck.addToTop(AbstractDungeon.returnRandomCard().makeCopy());
//                AbstractCard card = AbstractDungeon.returnTrulyRandomCard().makeCopy();
//                group.addToBottom(card);
//            }
//        }
//    }
//}