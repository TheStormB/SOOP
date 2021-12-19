public class ShoppingBag extends Bag{
    private boolean extremelyRobust;
    public ShoppingBag( double maxWeight,boolean extremelyRobust) {
        super(30, maxWeight);
        this.extremelyRobust=extremelyRobust;
    }

    public boolean isExtremelyRobust() {
        return extremelyRobust;
    }

    @Override
    public String toString() {
        return "ShoppingBag{" +
                "extremelyRobust=" + extremelyRobust +
                super.toString();
    }
}
