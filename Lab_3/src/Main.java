public class Main {
    public static double calculatePiAccWallies(int iterNo) {
        double result = 1.0;
        double a = 0;
        double b = 1;
        double down = 0;
        double num = 0;
        double temp = 0;
        double pi = 1;

        for(int i = 0; i < iterNo; i++)
        {
            temp = b;
            b = temp + 2;
            down = temp*b;

            a += 2;
            num = a*a;
            pi *= (num/down);
            
            result = pi * 2;
        }
        return result;
    }

    public static double calculatePiAccGregory(int iterNo) {
        double result=0.0;
        double pi = 0;
        double powerMinusOne=1;

        for(int i = 0; i < iterNo; i++)
        {
            if(i % 2 == 0)
            {
                pi = pi + (1 / powerMinusOne);
            }else{
                pi = pi - (1 / powerMinusOne);
            }
            powerMinusOne = powerMinusOne + 2;
        }
        result = pi * 4;
        return result;
    }

    public static void main(String[] args) {
        double value;
        int iterNo=4;
        System.out.println("Proper value of PI: " + Math.PI);

        value=calculatePiAccWallies(iterNo);
        System.out.println("Wallies for: "+iterNo+"\t"+value);
        value=calculatePiAccGregory(iterNo);
        System.out.println("Gregory for: "+iterNo+"\t"+value);
        iterNo=20;

        value=calculatePiAccWallies(iterNo);
        System.out.println("Wallies for: "+iterNo+"\t"+value);
        value=calculatePiAccGregory(iterNo);
        System.out.println("Gregory for: "+iterNo+"\t"+value);
        value=2/(float)4 * 5/(float)10;
        System.out.println(value);
    }
}