public class Task_1 {
    // calculate the number of occurrences of a given value in an array
    public static int calcOccurenceNumber(int arr[], int value) {
        int count = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == value)
            {
                count++;
            }
        }
        System.out.println("The given number counted: " + count);
        return count;
    }

    // find the maximal value of an array
    public static int findMax(int arr[]) {
        int max = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        System.out.println("Maximum value of array is: " + max);
        return max;
    }

    // calculate the number of occurrences of the maximal value
    public static int calcMaxOccurenceNumber(int arr[]) {
        int min = arr[0];

        for(int i = 0; i < arr.length; i++)
        {
            int curr = arr[i];
            if(curr < min)
            {
                min = curr;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] testArray = {12, 12, 234, 2, 777, 12, 777};
//        System.out.println("calculated maximal value is: "+
//                findMax(testArray)+" should be 777");
//        System.out.println("calculated number of occurences is: "+
//                calcOccurenceNumber(testArray, 12)+" should be 3");
        System.out.println("calculated max number of occurences is: "+
                calcMaxOccurenceNumber(testArray)+" should be 2");
    }
}
