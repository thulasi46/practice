package com.thulasi;

import java.util.*;

class Main {
    public static void main(String[] args) {
        /*int arr[] = new int[]{1, 4, 3, 6, 7, 0};
        int m = arr.length;
        Main mC = new Main();
        mC.largestMultiples(arr, m);*/

        String s1 = "VIJEY";
        String s2 = "YEJIV";
        System.out.println("Result : "+reverseString(s1));

    }

    /*void largestMultiples(int[] arr, int n) {
        if (n < 2) {
            System.out.println("Invalid Input");
        }
        int x = arr[0], y = arr[1];
        for (int i = 0; i < n; i++)
            for (int j = i + 1; i < n; j++)
                if (arr[i] * arr[j] > x * y) {
                    x = arr[i];
                    y = arr[j];
                }
        System.out.println("Max product pair is {" +
                x + ", " + y + "}");
    }*/

    public static String reverseString(String s) {
        if (s.length() <= 1) {
            return s;
        }
        return reverseString(s.substring(1,s.length())) + s.charAt(0);
    }

    public static boolean compareString(String s1, String s2){
        int l1 = s1.length();
        int l2 = s2.length();
        if(l1!=l2)
            System.out.println("NOOOOO");
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        String s3 = new String(c1);
        String s4 = new String(c2);
        if(s3.equals(s4))
            return true;
        return false;


    }


    /*static class GFG {

        // Function to find maximum product pair
        // in arr[0..n-1]
        static void maxProduct(int arr[], int n) {
            if (n < 2) {
                System.out.println("No pairs exists");
                return;
            }

            // Initialize max product pair
            int a = arr[0], b = arr[1];

            // Traverse through every possible pair
            // and keep track of max product
            for (int i = 0; i < n; i++)
                for (int j = i + 1; j < n; j++)
                    if (arr[i] * arr[j] > a * b) {
                        a = arr[i];
                        b = arr[j];
                    }

            System.out.println("Max product pair is {" +
                    a + ", " + b + "}");
        }

        *//* Driver program to test above function *//*
        public static void main(String[] args) {
            int arr[] = {1, 4, 3, 6, 7, 0};
            int n = arr.length;
            maxProduct(arr, n);

        }
    }*/
}