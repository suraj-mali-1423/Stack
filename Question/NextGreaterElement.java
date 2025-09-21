package Question;

import java.util.Stack;

public class NextGreaterElement {
    public static int [] NextGreater(int [] arr , int n ){
        Stack<Integer> st = new Stack<>();
        int [] res = new int[n];

        st.push(arr[n-1]);
        res[n-1] = -1;

        for(int i = n - 2; i >= 0 ; i--){
              while(st.size() > 0 && arr[i] > st.peek()){
                   st.pop();
              }
              if(st.size() == 0) res[i] = -1;

              else res[i] = st.peek();

              st.push(arr[i]);
        }

        return res;
    }
    public static void main(String[] args) {
        int [] arr = {1 , 10 , 2 , 8 , 6 , 3 , 4};
        int n = arr.length;

        int [] ans = NextGreater(arr, n);
        for (int x : ans ){
            System.out.print(x +"  ");
        }

    }
}
