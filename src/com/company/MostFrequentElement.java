package com.company;
import java.util.*;

public class MostFrequentElement {

    public static int mostFrequentElement(int[] arr, int n) {


        // Write code here
        // Sort the array
        Arrays.sort(arr);

        // find the max frequency using linear
        // traversal
        int max_count = 1, res = arr[0];
        int curr_count = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1])
                curr_count++;
            else {
                if (curr_count > max_count) {
                    max_count = curr_count;
                    res = arr[i - 1];
                }
                curr_count = 1;
            }
        }
        // If last element is most frequent
        if (curr_count > max_count) {
            max_count = curr_count;
            res = arr[n - 1];
        }
        return res;
    }

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        try {
            int n = 0;
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(mostFrequentElement(arr, n));

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("-1");
        }

    }
}