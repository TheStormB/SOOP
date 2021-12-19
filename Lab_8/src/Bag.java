public class Bag {
    private int bagCapacity;
    private double maxWeight;
    private Item[] items;
    private int howManyItems;
    private double currentWeight;

    public Bag(int capacity, double maxWeight) {
        if(capacity>=1&&capacity<=50) {
            this.bagCapacity = capacity;
            this.items = new Item[bagCapacity];
        }else{
            throw new IllegalArgumentException();
        }
        if(maxWeight>0.0&&maxWeight<=20.0) {
            this.maxWeight = maxWeight;
        }else{
            throw new IllegalArgumentException();
        }
        this.howManyItems=0;
        this.currentWeight=0.0;

    }

    @Override
    public String toString() {
        String products = "";
        for(int i=0; i<items.length;i++){
            if(items[i]!=null){
                products+=items[i].toString();
            }
        }
        String myString= "Bag{" +
                "bagCapacity=" + bagCapacity +
                ", maxWeight=" + maxWeight +
                ", items=" + products +
                ", howManyItems=" + howManyItems +
                ", currentWeight=" + currentWeight +
                '}';
        return myString;
    }

    public double getTotalWeight(){
        return currentWeight;
    }
    public int getItemNo(){
        return howManyItems;
    }
    public boolean putIn(Item item){
        if(item != null){
            if(howManyItems+1<=bagCapacity&&getTotalWeight()+item.getWeight()<=maxWeight) {
                items[howManyItems]=item;
                howManyItems++;
                currentWeight=currentWeight+item.getWeight();
                return true;
            }else{
                return false;
            }
        }else{
            throw new IllegalArgumentException();
        }
    }

    public boolean isFull(){
        if(howManyItems==bagCapacity){
            return true;
        }else{
            return false;
        }
    }
    public boolean isEmpty(){
        if(howManyItems==0){
            return true;
        }else{
            return false;
        }
    }
    public int getBagCapacity() {
        return bagCapacity;
    }

    public double getMaxWeight() {
        return maxWeight;
    }
    public boolean removeTheHeaviest() {
        double prevWeight = currentWeight;
        double heavy = 0.0;
        //checkign which weight is the heaviest
        for (int i = 0; i < items.length; i++) {
            if(items[i] != null){
                if (items[i].getWeight() > heavy ) {
                    heavy = items[i].getWeight();
                }
            }
        }
        //creating temporary array of items which are not heavy
        Item[] temp = new Item[bagCapacity];
        for (int j = 0, i = 0; i < items.length; i++) {
            if (items[i] != null) {
                if (items[i].getWeight() < heavy) {
                    temp[j] = items[i];
                    j++;

                }

            }
        }
        //clearing my old array
        items = new Item[bagCapacity];
        howManyItems = 0;
        currentWeight = 0.0;
        //adding not heavy elements back to my old array
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != null) {
                items[i] = temp[i];
                currentWeight+=temp[i].getWeight();
                howManyItems+=1;
            }
        }

        if (prevWeight > currentWeight) {
            return true;
        } else {
            return false;
        }

    }


    public void removeAll(){
        items=new Item[bagCapacity];
        howManyItems=0;
        currentWeight=0.0;

    }
}
