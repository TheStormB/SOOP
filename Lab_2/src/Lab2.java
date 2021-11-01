import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Lab2 {
    static void printMaxValue(int [] arr) {
//        int max = 0;
//        for(int i = 0; i < arr.length; i++)
//        {
//            if(arr[i] > max)
//            {
//                max = arr[i];
//            }
//        }
//        System.out.println("Maximum value of array is: " + max);

        //stream
        int max = Arrays.stream(arr).min().getAsInt();
        System.out.println("Max Value is: " + max);
    }

    static void printMaxValue(int [][] arr) {
        int maxValue = arr[0][0];
        for (int j = 0; j < arr.length; j++)
        {
            for (int i = 0; i < arr[j].length; i++)
            {
                if (arr[j][i] < maxValue)
                {
                    maxValue = arr[j][i];
                }
            }
        }
        System.out.println("Max value of the two dimension array " + maxValue);
    }


    static void printMaxValueStream(int [][] arr){
        IntStream stream = Arrays.stream(arr).flatMapToInt(x -> Arrays.stream(x));
        OptionalInt max = stream.max();

        if(max.isPresent()) {
            System.out.println(max.getAsInt());
        }
    }

    static int getOccurenceNumber (int[] arr, int value2Check) {
        int count = 0;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == value2Check)
            {
                count++;
            }
        }
        System.out.println("The given number counted: " + count);
        return value2Check;

        //stream
//        return (int)Arrays.stream(arr)
//                .filter(number -> number == value2Check)
//                .count();
    }

    static void printMostCommonDigit(int[] arr) {
        int count = 1, tempCount;
        int popular = arr[0];
        int temp = 0;
        for (int i = 0; i < (arr.length - 1); i++)
        {
            temp = arr[i];
            tempCount = 0;
            for (int j = 1; j < arr.length; j++)
            {
                if (temp == arr[j])
                    tempCount++;
            }
            if (tempCount > count)
            {
                popular = temp;
                count = tempCount;
            }
        }
        System.out.println("Most common digit is: " + popular);
    }

    static void printMostCommonDigit(int[][] arr) {
        int count, element = arr[0][0], numberRepeats = 0;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                count = 0;
                for (int j2 = i; j2 < arr.length; j2++)
                {
                    for (int k = 0; k < arr[j2].length; k++)
                    {
                        if (arr[i][j] == arr[j2][k])
                        {
                            count++;
                        }
                    }
                    if (count > numberRepeats)
                    {
                        element = arr[i][j];
                        numberRepeats = count;
                    }
                }
            }
        }
        System.out.println(element + " : " + numberRepeats);

//        Map<Integer, Integer> elementsCounts = new HashMap<>();
//        for (int i = 0; i < arr.length; i++)
//        {
//            for (int j = 0; j < arr[i].length; j++)
//            {
//                Integer count = elementsCounts.get(arr[i][j]);
//                if(count == null)
//                {
//                    count = 0;
//                }
//                elementsCounts.put(arr[i][j], count+1);
//            }
//        }
//        System.out.println(elementsCounts);
    }

    static void printSorted(int [] arr) {
        //bubbleSort
        int i = 0;
        BubbleSort(arr, arr.length);
        System.out.println("Sorted Array: ");
        for(i = 0; i < arr.length; i++)
            System.out.print(arr[i]  + " ");

        //Stream
//        Arrays.stream(arr).sorted().forEach(System.out::println);
    }

    public static void BubbleSort(int a[], int n) {
        int i, j,t=0;
        for(i = 0; i < n; i++)
        {
            for(j = 1; j < (n-i); j++)
            {
                if(a[j-1] > a[j])
                {
                    t = a[j-1];
                    a[j-1]=a[j];
                    a[j]=t;
                }
            }
        }
    }

    public static void main(String[] args) {
        int oneDim[]= {10,1, 10, 23, 87, 14, 1, 6, 177, 71,};
        int twoDim[][] = {{1, 2, 12, 2}, {87}, {7, 12,14}, {1,8, 9, 8,}};
//        printMaxValue(oneDim);
//        printMaxValue(twoDim);
//        printMostCommonDigit(oneDim);
//        printMostCommonDigit(twoDim);
//        //streams Occurence Number
        System.out.println(getOccurenceNumber(oneDim,1));
//        printSorted(oneDim);

//        //bubble sort
//        getOccurenceNumber(oneDim, 1);
//        printMaxValueStream(twoDim);


    }
}