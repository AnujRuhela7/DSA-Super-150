package lec4;

public class ReverseArray
{
    public static void reverseArray(int []arr) /* Reversal of Array by two pointer method */
    {
        // Function to Reverse Full Array
        int j = arr.length-1;
        int i = 0;
        while (i < j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int value : arr) {
            System.out.print(value + "\t");
        }
    }

    public static void reverseArray(int []arr, int begin, int end) /* Reversal of Array by two pointer method */
    {
        // Function to Reverse Array Elements in a range
        int j = end;
        int i = begin;
        while (i < j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int value : arr) {
            System.out.print(value + "\t");
        }
    }

    public static void main(String[] args)
    {
        int []arr = {4,-23,7,6,-7,10,2,9};
        System.out.print("Reverse of Array : ");
        reverseArray(arr);
    }
}
