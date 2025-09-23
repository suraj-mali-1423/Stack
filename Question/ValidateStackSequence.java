package Question;

import java.util.Stack;

public class ValidateStackSequence {
    public  static boolean Validate(int [] pushed , int [] poped){
          Stack<Integer>st = new Stack<>();
          int j = 0 ;
          for(int x : pushed){
              st.push(x);
              while (st.size() > 0 && st.peek() == poped[j]){
                    st.pop();
                    j += 1;
              }


          }

          return st.size() == 0;
    }
    public static void main(String[] args) {
        int [] Pushed = {1,2,3,4,5};
        int [] Poped = {4,3,5,1,2};

        System.out.println(Validate(Pushed , Poped));
    }
}
