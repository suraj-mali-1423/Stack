package Question;

import BasicOperation.StackUsingLinkedList;

import java.util.Stack;

public class BalanceBracket {
    public static boolean Balanace(String Str){
        Stack<Character> St = new Stack<>();

        for( char ch : Str.toCharArray()){
             if( ch == '(' || ch == '{' || ch == '['){
                 St.push(ch);
             }
//             If the ) this
             else if (ch == ')' || ch == '}' || ch == ']'){
                 if(St.size() == 0) return false;
                 char Top = St.peek();

                 if((Top == '(' && ch == ')') || (Top == '{' && ch == '}') || (Top == '[' && ch == ']') ){
                      St.pop();
                 }
                 else{
                      return false;
                 }
             }
        }
        return St.isEmpty();
    }
    public static void main(String[] args) {
         String Str = "([)]";
        System.out.println(Balanace(Str));
    }
}
