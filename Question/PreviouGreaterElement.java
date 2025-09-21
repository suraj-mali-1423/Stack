package Question;

import java.util.Stack;

public class PreviouGreaterElement {
    public static int [] PrevGreater(int [] arr , int n ){
        Stack<Integer> st = new Stack<>();
        int [] res = new int[n];

        st.push(arr[0]);
        res[0] = -1;

        for(int i = 1; i < n ; i++){
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

        int [] ans = PrevGreater(arr, n);
        for (int x : ans ){
            System.out.print(x +"  ");
        }
    }
}
