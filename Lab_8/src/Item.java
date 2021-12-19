public class Item {

    private String name;
    private double  weight=0.0;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public double getWeight() {
        return weight;
    }

    public Item(String name, double weight) {
        if(name!=null&&!name.isEmpty()) {
            this.name = name;
        }else {
            throw new IllegalArgumentException();
        }
        if(weight>0.0&&weight<10.0) {
            this.weight = weight;
        }else{
            throw new IllegalArgumentException();
        }
    }
}
