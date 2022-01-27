public class Main {
    public static void main(String[] args) {
        ProductType product1=new ProductType("Bread",1.5,"my new bread");

        ProductType product2=new ProductType();

        ProductType product3=new ProductType("Cola",4.5,"a drink");

        ProductType product4=new ProductType("maple leaves",0.5,"like in canada");

        ProductType product5=new ProductType("Ham",201,"thats an expensive ham");


        ProductType [] array=new ProductType[5];
        array[0]=product1;
        array[1]=product2;
        array[2]=product3;
        array[3]=product4;
        array[4]=product5;
        for(int i=0;i<array.length;i++){
            System.out.println(array[i].toString());
        }

//        System.out.println(product1.setPrice(6));
//        System.out.println(product1.setPrice(2));
//        System.out.println(product1.getPriceChangeNo());
    }
}

