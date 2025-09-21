package Question;

import java.util.Stack;

public class LargestReactangle {
    public static int[] PSE(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            res[i] = st.isEmpty() ? -1 : st.peek();  // store index, not value
            st.push(i);
        }

        return res;
    }

    public static int[] NSE(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            res[i] = st.isEmpty() ? n : st.peek(); // store index, not value
            st.push(i);
        }

        return res;
    }


    public static int heistogram ( int [] arr ){
         int [] P = PSE(arr);
         int [] N = NSE(arr);
         int Max_Area = 0;
         for(int i = 0 ; i < arr.length ; i++){
             int width = N[i] - P[i] - 1;
             int Area = arr[i] * width;
              Max_Area = Math.max(Max_Area , Area);
         }

         return Max_Area;
    }
    public static void main(String[] args) {
        int [] arr = {2 , 1 , 5 , 6 ,2 ,3};
        int n = arr.length;

        int x  = heistogram(arr);
        System.out.println(x);
    }
}
