public class test {
    public static void faktoriyel(int x){
        int toplam = 1;
        for(int i = 1; i <= x; i++){
            toplam *= i;
            System.out.println("Sıra: "+ i +"Sonuç: " + toplam);
        }
    }

    public static int SayılarınToplamı(int x, int y){
        int result = 0;
        for(int i = x; i <= y; i++){
            result += i;
        }
        return result;
    }



    public static void main(String[] args) {
//        faktoriyel(10);
        System.out.println(SayılarınToplamı(1, 10));
    }
}
