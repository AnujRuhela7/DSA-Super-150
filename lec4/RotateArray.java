package lec4;

import java.util.Scanner;

public class RotateArray
{
    /*
    i) Rotate last k elements
    ii) Rotate first n-k-1 elements
    iii) Rotate all elements
     */
    public static void rotate(int[] arr, int k)
    {
        int n = arr.length;
        k = k % arr.length;

        rangeReverseArray(arr, n-k, n-1);
        rangeReverseArray(arr, 0, n-k-1);
        rangeReverseArray(arr, 0, n-1);
//        while()
//        {
//            int temp = nums[nums.length-1];
//            for(i = nums.length-1; i > 0; i--)
//            {
//                nums[i] = nums[i-1];
//            }
//            nums[i] = temp;
//            loop++;
//        }
    }
    public static void rangeReverseArray(int []arr, int i, int j)
    {
        while(i < j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of Array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Elements : ");
        for (int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Print of Rotation (k) : ");
        int k = sc.nextInt();
        rotate(arr, k);

        for (int val : arr)
        {
            System.out.println(val);
        }
    }
}
