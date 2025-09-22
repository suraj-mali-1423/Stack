package Question;

import java.util.Stack;

public class NumberOfVisiblePeople {
    public static int[] NGE(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0 ; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                 res[st.peek()]++;
                 st.pop();
            }
            if(!st.isEmpty()) res[st.peek()]++;
            st.push(i);
        }

        return res;
    }


    public static void main(String[] args) {
        int [] arr = {10,6,8,5,11,9};
        int n = arr.length;

        int [] ans = NGE(arr);
        for(int x : ans){
            System.out.print(x +"  ");
        }

    }
}
