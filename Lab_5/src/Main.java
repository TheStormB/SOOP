public class Main {
    //The factorial for a given number;
    public static int R_factorial(int x) {
        if(x <= 2){
            return x;
        }else
            return x * R_factorial(x - 1);
    }

    public static int factorial(int x) {
        // ask is it correct or not
        //is iteration works like that ???
        int result = 1;
        for(int i = 1; i <= x; i++){
            result *= i;
        }
        return result;
    }

    //The sum number of values from x to y inclusive.
    public static int sumXY(int x, int y) {
        int result = 0;
        for(int i = x; i <= y; i++){
            result += i;
        }
        return result;
    }

    public static int R_sumXY(int x, int y) {
        if(x == y){
            return x;
        }else
            return x + R_sumXY((x+1),y);
    }

    //The number of occurrences of a digit in an integer value; it should work for all values of x >0
    //For numberDigit(12322,2) should return 3
    public static int numberDigit(int x, int digit) {
        String my_digit = String.valueOf(digit);
        String my_number = String.valueOf(x);
        int count = 0;

        for(int i = 0; i < my_digit.length(); i++){
            char c = my_digit.charAt(i);
            if(c == my_number.charAt(0)){
                 count ++;
             }
        }
        return count;
    }

    // check how its working
    public static int R_numberDigit(int x, int digit) {
        if(digit == 0){
            return 0;
        }
        int test = digit % 10;
        if(test == x){
            return 1 + R_numberDigit(x , digit/ 10);
        }else
            return R_numberDigit(x , digit/ 10);
    }

    //The number of digits in an integer value; it should work for all values of x>0
    public static int numberLenght(int x) {
        String my_digit = String.valueOf(x);
        int count = 0;
        for(int i = 0; i < my_digit.length(); i++){
            count++;
        }
        return count;
    }

    public static int R_numberLength(int x){
        if(x < 10){
            return 1;
        }else
            return 1 + R_numberLength(x/10);
    }

    public static void main(String[]args){
        System.out.println("Factorial: "+ factorial(5));
        System.out.println("(Recursive) Factorial: "+ R_factorial(5));

        System.out.println("Sum: " + sumXY(1,5));
        System.out.println("(Recursive) Sum: " + R_sumXY(1,5));

        System.out.println("Number is " + numberDigit(3,6336) + " times in the digit");
        System.out.println("(Recursive) Number is " + R_numberDigit(3,6336) + " times in the digit");

        System.out.println(numberLenght(555555) + " times");
        System.out.println(R_numberLength(555555) + " times (Recursive)");





    }
}
