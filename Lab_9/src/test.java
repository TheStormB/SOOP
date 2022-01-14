public class test {
    public static int test1(int year) throws Exception {

        if(year >= 2022 || year <= 2019 ){
            throw new Exception();
        }
        return year;
    }



    public static void main(String[] args) throws Exception {
        test1(2020);
    }

}
