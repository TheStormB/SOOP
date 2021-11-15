import java.util.ArrayList;
import java.util.Scanner;

public class ArrayPack {
    private static Scanner scKeyboard = new Scanner(System.in);
    public static int ConvertToInt (Scanner scKeyboard) {
        boolean notInt = true;
        int result = 0;
        while (notInt)
        {
            if (scKeyboard.hasNext())
            {
                String elem = scKeyboard.next();
                try
                {
                    result = Integer.parseInt(elem);
                    notInt = false;
                }catch(Exception ex){}
            }else{
                result = 0;
                break;
            }
        }
        return result;
    }

    public static int[] readArray(int size) {
        System.out.println("Input elements to array");
        int[] array = new int[size];
        for(int i=0;i<size;i++)
        {
            array[i]= ConvertToInt(scKeyboard);
        }
        return array;
    }

    public static int[] appendArrays(int [] a1, int [] a2) {
        int [] newArray=new int[a1.length+a2.length];
        for (int i=0;i< a1.length;i++)
        {
            newArray[i]=a1[i];
        }
        for (int j=a1.length,i=0;i< a2.length;i++,j++)
        {
            newArray[j]=a2[i];
        }
        return newArray;
    }

    public int getMinimalElement(int[] inArr) {
        int minimal;
        minimal=inArr[0];
        for (int numb:inArr)  // numb:ınArr ? how does it work
        {
            if(numb<minimal)
            {
                minimal=numb;
            }
        }
        return minimal;
    }

//    // resulting array should contain all elements have the minimal value

//    public int[] getMinimalElements(int [] inArr) {

//    }

//    // resulting array should contain elements that are >= limit

    public int[] getGreaterThan(int[] inArr, int limit) {
        int size=0;
        for (int numb:inArr)
        {
            if(numb>limit)
            {
                size++;
            }
        }
        int[] resultArray=new int[size];
        for (int i=0,j=0;i<inArr.length;i++)
        {
            if(inArr[i]>limit)
            {
                resultArray[j]=inArr[i];
                j++;
            }
        }
        return resultArray;
    }

    // resulting array should contain elements that are >= lowerLimit and <=upperLimit
    public int[] getRange(int[] inArr, int lowerLimit, int upperLimit) {
        int size=0;
        for (int numb:inArr)
        {
            if(numb>=lowerLimit&&numb<=upperLimit)
            {
                size++;
            }
        }
        int[] resultArray=new int[size];
        for (int i=0,j=0;i<inArr.length;i++)
        {
            if(inArr[i]>=lowerLimit&&inArr[i]<=upperLimit)
            {
                resultArray[j]=inArr[i];
                j++;
            }
        }
        return resultArray;
    }

    public int elementCount(int[] inArr, int what2Look4) {
        int counter=0;
        for (int i=0; i<inArr.length;i++)
        {
            if(inArr[i]==what2Look4)
            {
                counter++;
            }
        }
        return counter;
    }

    // resulting array contains elements that are in exactly one array
    public static int[] uniqueElements(int [] a1, int [] a2) {
        //while using array we cannot allocate size dynamically. Thats why i needed to interate though array twice
        // first to get the size of final array, and than to actually rewrite the values
        ArrayPack testPack=new ArrayPack();
        int size=0;
        int[] combinedArray=appendArrays(a1,a2);
        for(int i=0;i< combinedArray.length;i++) {
            if(testPack.elementCount(combinedArray,combinedArray[i])==1){
                size++;
            }
        }
        int [] finalResultArray=new int[size];
        for(int i=0,j=0;i< combinedArray.length;i++) {
            if(testPack.elementCount(combinedArray,combinedArray[i])==1){
                finalResultArray[j]=combinedArray[i];
                j++;
            }
        }
        return finalResultArray;
    }

    // resulting array should contain elements that are in both arrays
    public static int[] commonElements(int [] a1, int [] a2) {
        //while using array we cannot allocate size dynamically. For dynamic size we use
        //Array List, that's why first I've added elements to ArrayList, because I didn't know how much of them I will get
        ArrayList arrayList=new ArrayList(10);
        for (int elemA1:a1)
        {
            for (int elemA2:a2)
            {
                if(elemA1==elemA2)
                {
                    if(!arrayList.contains(elemA1))
                    {
                        arrayList.add(elemA1);
                    }
                }
            }
        }
        int[] resultArray= new int[arrayList.size()];
        for (int i=0;i<arrayList.size();i++)
        {
            resultArray[i]= (int) arrayList.get(i);
        }
        return resultArray;
    }

    public static void reverseMe(int[] inOutArr) {
// input your code here, modify the input array
        int i, temp;
        for (i = 0; i < inOutArr.length / 2; i++)
        {
            temp = inOutArr[i];
            inOutArr[i] = inOutArr[inOutArr.length - i - 1];
            inOutArr[inOutArr.length - i - 1] = temp;
        }
        printArray(inOutArr);
    }

    // return an array with elements in reversed order
    public static int[] returnReversed(int[] inArr) {
        int[] resultArray=new int[inArr.length];
        for(int i=0; i<inArr.length;i++)
        {
            resultArray[resultArray.length-i-1]=inArr[i];
        }
        return resultArray;
    }

    public static void showArr(int [] arrIn, int numberOfColumns) {
// I understand that the number of columns means how we want to present the array(in how many columns)
        int count=0;
        for (int i=0; i<arrIn.length; i++)
        {
            if(count<numberOfColumns-1){
                System.out.print(arrIn[i]+"   ");
                count++;
            }else {
                System.out.println(arrIn[i]);
                count = 0;
            }
        }
    }


    public static void printArray(int [] arr){
        for (int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayPack myPack=new ArrayPack();
        int[] firstArray=new int[]{1,2,31,3,1,64,21,2};
        int[] secondArray=new int[]{4,5,6,-500,21,2};

        //for calling non-static methods we need to create an instance of the class
        //printArray(readArray(10));

        System.out.println("Appended arrays");
        printArray(myPack.appendArrays(firstArray,secondArray));

        System.out.println("Minimal elem");
        System.out.println(myPack.getMinimalElement(secondArray));

        System.out.println("Array in the range");
        printArray(myPack.getRange(firstArray,3,32));

        System.out.println("Array above the limit");
        printArray(myPack.getGreaterThan(secondArray,6));

        System.out.println("Common elements");
        printArray(ArrayPack.commonElements(firstArray,secondArray));

        System.out.println("Unique elements");
        printArray(ArrayPack.uniqueElements(firstArray,secondArray));

        System.out.println("Reversed array using temporary array");
        printArray(returnReversed(firstArray));

        System.out.println("Reversed array modifying original one");
        reverseMe(firstArray);

        System.out.println("Array divided to columns");
        showArr(firstArray,3);

// Test calls to all above methods
//
// Except for the readArray method use initialized arrays for testing.
//
// input your code here, modify the input array
    }
}