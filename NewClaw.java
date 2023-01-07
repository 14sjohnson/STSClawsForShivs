//import com.badlogic.gdx.graphics.Color;
//import com.megacrit.cardcrawl.actions.AbstractGameAction;
//import com.megacrit.cardcrawl.actions.animations.VFXAction;
//import com.megacrit.cardcrawl.actions.common.DamageAction;
//import com.megacrit.cardcrawl.actions.defect.GashAction;
//import com.megacrit.cardcrawl.cards.AbstractCard;
//import com.megacrit.cardcrawl.cards.DamageInfo;
//import com.megacrit.cardcrawl.characters.AbstractPlayer;
//import com.megacrit.cardcrawl.core.AbstractCreature;
//import com.megacrit.cardcrawl.core.CardCrawlGame;
//import com.megacrit.cardcrawl.localization.CardStrings;
//import com.megacrit.cardcrawl.monsters.AbstractMonster;
//import com.megacrit.cardcrawl.vfx.AbstractGameEffect;
//import com.megacrit.cardcrawl.vfx.combat.ClawEffect;
//
//class NewClaw extends AbstractCard {
//    public static final CardStrings cardStrings = CardCrawlGame.languagePack.getCardStrings("Gash");
//
//    public NewClaw() {
//        super("Gash", cardStrings.NAME, "blue/attack/claw", 0, cardStrings.DESCRIPTION, AbstractCard.CardType.ATTACK, AbstractCard.CardColor.GREEN, AbstractCard.CardRarity.COMMON, AbstractCard.CardTarget.ENEMY);
//        this.baseDamage = 3;
//        this.baseDamage += ClawCountTracker.timesClawHasBeenUsed*2;
//        this.baseMagicNumber = 2;
//        this.magicNumber = this.baseMagicNumber;
//    }
//
//    @Override
//    public void upgrade() {
//        if (!this.upgraded) {
//            upgradeName();
//            upgradeDamage(2);
//        }
//    }
//
//    @Override
//    public void use(AbstractPlayer p, AbstractMonster m) {
//        addToBot((AbstractGameAction) new VFXAction((AbstractGameEffect) new ClawEffect(m.hb.cX, m.hb.cY, Color.CYAN, Color.WHITE), 0.1F));
//        addToBot((AbstractGameAction) new DamageAction((AbstractCreature) m, new DamageInfo((AbstractCreature) p, this.damage, DamageInfo.DamageType.NORMAL), AbstractGameAction.AttackEffect.NONE));
//        addToBot((AbstractGameAction) new GashAction(this, this.magicNumber));
//    }
//
//    @Override
//    public AbstractCard makeCopy() {
//        return new NewClaw();
//    }
//
//}
