public class Main {
    public static void main(String[] args) {
        Bag normalBag= new Bag(17,17.0);
        HandHoldBag handHoldBag=new HandHoldBag(true);
        ShoppingBag shoppingBag=new ShoppingBag(10.0, false);
        Item bread=new Item("Bread",3.0);
        Item milk=new Item("Milk",7.0);
        Item juice=new Item("Juice",2.0);
        Item potatoes=new Item("Potatoes",8.0);


        normalBag.putIn(bread);
        normalBag.putIn(juice);
        normalBag.putIn(potatoes);
        System.out.println(normalBag);


        handHoldBag.putIn(juice);
        System.out.println(handHoldBag);
        System.out.println(handHoldBag.getTotalWeight());
        System.out.println(handHoldBag.getItemNo());
        System.out.println(handHoldBag.isPremiumQuality());

        shoppingBag.putIn(null);
        shoppingBag.putIn(potatoes);
        System.out.println(shoppingBag);


        System.out.println(handHoldBag.putIn(milk));
        normalBag.removeTheHeaviest();
        System.out.println(normalBag);
        normalBag.removeAll();
        System.out.println(normalBag);

        //These will cause exceptions
//        Item fakeItem=new Item("", 2.0);
//        Item fakeItem2=new Item("fakeITEM", 4545.0);
//        Bag fakeBag= new Bag(455,33.0);
//        Bag fakeBag2= new Bag(22,666.0);

    }
}
