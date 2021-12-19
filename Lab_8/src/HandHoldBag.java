public class HandHoldBag extends Bag{
    private boolean premiumQuality;
    public HandHoldBag(boolean premiumQuality){
        super(5, 2.0);
        this.premiumQuality=premiumQuality;
    }

    @Override
    public String toString() {
        return "HandHoldBag{" +
                "premiumQuality=" + premiumQuality +
                '}'+ super.toString();
    }

    public boolean isPremiumQuality() {
        return premiumQuality;
    }
}
