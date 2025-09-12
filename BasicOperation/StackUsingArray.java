package BasicOperation;

class Stack{
      int top ;
      int size = 0 , idx = 0;
      int [] arr = new int[10];

      void Push(int val){
          if(size == 10){
              System.out.println("Overflow!");
              return;
          }
           arr[idx] = val;
           idx++;
           size++;
      }

      int Pop(){
          if(size < 0){
              System.out.println("Underflow!");
              return -1;
          }
          int Del = arr[idx];
          idx--;
          size--;
          return Del;
      }
      int Size(){

           return size;
      }
      int Top(){
          if(size < 0){
              System.out.println("Underflow!");
              return -1;
          }


          return arr[0];
      }
      void  display(){
          if(size < 0){
              System.out.println("Underflow!");
              return ;
          }

          for (int i =  idx-1 ; i >= 0 ; i--){
              System.out.print(arr[i]+"  ");
          }
          System.out.println();
      }
}
public class StackUsingArray {
    public static void main(String[] args) {
        Stack st = new Stack();
//        st.Push(10);
//        st.Push(20);
//        st.Push(30);
//        st.Push(40);
//        st.display();
//        st.Pop();
//        st.display();
        st.Pop();
        System.out.println("Size of the Top : "+ st.Top());
//        st.Push(50);
//        st.Push(60);
        System.out.println("Size of the stack : "+ st.Size());
        st.display();
    }
}
