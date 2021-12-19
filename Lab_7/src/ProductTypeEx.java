import javax.naming.NameNotFoundException;

public class ProductTypeEx {

//    Name : a nonempty string of characters, null value is not allowed too
//itemPrice: double value with the price of a single item of that product type, must be
//>=0 and <=200
//    comment
// priceChangeNo: int with the number of successful price modifications

    private String name;
    private double itemPrice;
    private String comment;
    private int priceChangeNo;

    String[] items;

    public ProductTypeEx(String name, double price, String comment) throws NameNotFoundException {
        if(name != null){
            this.name = name;

        }else{
            throw new NameNotFoundException();

        }
    }

    public String toString(){
        String products = "";
        for(int i=0; i < items.length){
            

        }
    }

    public String getName(){
        return null;
    }

    public double getPrice(){
        return getPrice();
    }


    //ignore not valid names and return false
    public boolean modifyName(String new_name){
        return false;
    }

    //the validity check should be the same as for the constructor
    public boolean setPrice(double price){
        return setPrice(0);
    }


    public static ProductTypeEx[] createTestDataEx(){
        return null;
    }

//    public static ProductTypeEx[] createTestData(){
//        return null;
//    }

    public static void testMe(){

    }



}
