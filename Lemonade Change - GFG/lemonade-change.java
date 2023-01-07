//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Solution obj = new Solution();
            boolean ans = obj.lemonadeChange(n, a);
            System.out.println(ans ? "True" : "False");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static boolean lemonadeChange(int N, int arr[]) {
       int c5 = 0, c10 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 5) {
                c5++;
            } else if (arr[i] == 10) {
                if (c5 == 0) return false; else {
                    c5--;
                    c10++;
                }
            } else if (arr[i] == 20) {
                if (c5 >= 1 && c10 >= 1) {
                    c5--;
                    c10--;
                } else if (c5 >= 3) {
                    c5 -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }


}
