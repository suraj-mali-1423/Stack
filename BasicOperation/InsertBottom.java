package BasicOperation;

import java.awt.im.spi.InputMethod;
import java.util.Stack;

public class InsertBottom {
    public static  void printStack(Stack<Integer>st){
         Stack<Integer>rt = new Stack<>();

         while(st.size() > 0 ){
              rt.push(st.pop());
         }

        while(rt.size() > 0 ){
            System.out.print(rt.peek()+"  ");
            st.push(rt.pop());
        }
        System.out.println();
    }
    public  static void  printRecursive(Stack<Integer>st){
         if(st.size() == 0 ) return;
          int X = st.pop();
          printRecursive(st);
          System.out.print(X+"  ");

          st.push(X);
    }
    public  static  void RemoveAtBottom(Stack<Integer>St){
        Stack<Integer> rt = new Stack<>();
        while(St.size() > 1 ){
             rt.push(St.pop());
        }
         St.pop();

        while(rt.size() > 0 ){
             St.push(rt.pop());
        }
     }
    public static  void Insert(Stack<Integer>st , int X ){
           Stack<Integer> rt = new Stack<>();

           while (st.size() > 0 ){
                 rt.push(st.pop());
           }

           st.push(X);

           while (rt.size() > 0 ){
                  st.push(rt.pop());
           }


    }
    public static void ReverseStack(Stack<Integer> St){
         Stack<Integer> rt = new Stack<>();
         Stack<Integer>at = new Stack<>();

         while(St.size() > 0 ){
              rt.push(St.pop());
         }

         while (rt.size() > 0 ){
              at.push(rt.pop());
         }

         while(at.size() > 0 ){
              St.push(at.pop());
         }
    }
    public static  void  ReverseRecursive(Stack <Integer> St ){
          if(St.size() == 1)return;
          int top = St.pop();
          ReverseStack(St);
          Insert(St , top);
    }
    public static void main(String[] args) {
        Stack<Integer> St = new Stack<>();

        St.push(10);
        St.push(20);
        St.push(30);
        St.push(40);
        St.push(50);
        St.push(60);

         printStack(St);
        ReverseRecursive(St);
         printStack(St);
    }
}
