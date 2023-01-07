
//When all External Libraries are added from the pom.xml using maven the code can be uncommented.
import basemod.helpers.BaseModCardTags;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.cards.CardGroup;
import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.characters.Ironclad;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import java.util.Iterator;

import basemod.BaseMod;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import basemod.interfaces.PostCreateStartingRelicsSubscriber;
import basemod.interfaces.PostDrawSubscriber;
import com.evacipated.cardcrawl.modthespire.lib.SpireInitializer;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.unlock.UnlockTracker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import basemod.BaseMod;
import basemod.ModPanel;
import basemod.interfaces.PostCreateStartingRelicsSubscriber;
import basemod.interfaces.PostInitializeSubscriber;
import java.util.ArrayList;

@SpirePatch(clz = Ironclad.class, method = "getStartingRelics")
public class ModInitializer {

    public static final Logger logger = LogManager.getLogger(ModInitializer.class.getName());
    public static ArrayList<String> Postfix(ArrayList<String> __result) {
        logger.info("hello2222?");
        __result.remove(0);
        __result.add("Pandora's Box");
        return __result;
    }
}
// implements PostInitializeSubscriber {
//    Logger logger = LogManager.getLogger("ExampleMod");
//
//
//
//    public ModInitializer (){
//        //Use this for when you subscribe to any hooks offered by BaseMod.
//        BaseMod.subscribe(this);
//    }
//
//    @Override
//    public void receivePostCreateStartingRelics (AbstractPlayer.PlayerClass playerClass, ArrayList<String> relicsToAdd){
//        logger.info("i am here22");
//        if (playerClass == AbstractPlayer.PlayerClass.IRONCLAD){
//            relicsToAdd.remove(0);
//            relicsToAdd.add("Black Star"); // here we simply give the player black blood in addition to their other starting relics
//        }
//    }
//    public static void initialize(){
//        Logger logger = LogManager.getLogger("ExampleMod");
//        //This creates an instance of our classes and gets our code going after BaseMod and ModTheSpire initialize.
//        ModInitializer modInitializer = new ModInitializer();
//        //Look at the BaseMod wiki for getting started. (Skip the decompiling part. It's not needed right now)
//
//    }
//
//    @Override
//    public void receivePostInitialize() {
//
//    }
//}
