public class ProductType {

    private String name;
    private double itemPrice;
    private String comment;
    private int priceChangeNo;
    private boolean valid;

    //default constructor allows us to create object just with default parameters
    public ProductType(){
        this.name="not_known";
        this.itemPrice=0.0;
        this.comment="none";
        this.priceChangeNo=0;
        this.valid=false;

    }

    public ProductType(String name, double price, String comment){
        //cheching validity f the name, if its more or equals 3 characters, less than 15 characters, and the first letter is big letter
        if(name.length() >= 3 && name.length()<= 15 && Character.isUpperCase(name.charAt(0))) {
            this.name = name;
        }else{
            this.name="not_known";
        }

        if(comment.length() >=5 && comment.length() <= 200){
            this.comment = comment;
        }else{
            this.comment="none";
        }

        if (price >= 0 && price <= 200) {
            this.itemPrice = price;
        } else {
            this.itemPrice = 0.0;
        }
        this.priceChangeNo = 0;   //on the begginning no changes, so each object will start with 0 in here

        if ((this.name).equals("not_known") || (this.comment).equals("none") || (this.itemPrice) == 0.0) {
            this.valid = false;
        } else {
            this.valid = true;
        }
    }

    @Override
    public String toString(){
        return "ProductType{" +
                "name: " + name +
                ", item price: " + itemPrice +
                ", comment: " + comment +
                ", Price Change No: " + priceChangeNo +
                ", Validity: " + valid + "}";
    }

    public String getName() {
        return name;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public int getPriceChangeNo() {
        return priceChangeNo;
    }

    public boolean isValid() {
        return valid;
    }

    public String getComment() {
        return comment;
    }



    //ignore not valid names and return false
    public boolean modifyName(String new_name){
        if(new_name.length()>= 3 && new_name.length()<=15 && Character.isUpperCase(new_name.charAt(0))) {
            this.name = new_name;
            return true;
        }else{
            this.name=name;
            this.valid=false;
            return false;
        }
    }

    //the validity check should be the same as for the constructor
    public boolean setPrice(double price){
        if (price >= 0 && price <= 200) {
            this.priceChangeNo++;
            this.itemPrice = price;
            return true;
        } else {
            this.itemPrice = 0.0;
            this.valid=false;
            return false;
        }
    }
}