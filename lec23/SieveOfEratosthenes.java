package lec23;

public class SieveOfEratosthenes
{
    public static void main(String[] args)
    {
        int n = 100;
        primeSieve(n);
    }

    public static void primeSieve(int n)
    {
        // kisi index pr false set h toh us index ko prime no mana jaayega
        // kisi index pr true set h toh us index ko non prime consider krna hai
        boolean[] arr = new boolean[n+1];
        arr[0] = true;
        arr[1] = true;
        for (int i = 2; i < arr.length; i++)
        {
            if(arr[i] == false)
            {
                for (int j = 2; i*j <= n; j++)
                {
                    arr[i*j] = true;      // not prime set kr rhe h
                }
            }
        }

        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] == false)
            {
                System.out.println(i + " ");
            }
        }
    }
}

