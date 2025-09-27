package Question;

import java.util.Scanner;
import java.util.Stack;

public class Decode {
    public static String decodeString(String s) {
        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch != ']') {
                st.push(ch); // push until we find closing bracket
            } else {
                // get substring inside []
                StringBuilder sb = new StringBuilder();
                while (!st.isEmpty() && st.peek() != '[') {
                    sb.append(st.pop());
                }
                st.pop(); // remove '['

                // get number before '['
                int k = 0;
                int base = 1;
                while (!st.isEmpty() && Character.isDigit(st.peek())) {
                    k = (st.pop() - '0') * base + k;
                    base *= 10;
                }

                // repeat substring k times
                String sub = sb.reverse().toString();
                while (k-- > 0) {
                    for (char c : sub.toCharArray()) {
                        st.push(c);
                    }
                }
            }
        }

        // build final result
        StringBuilder result = new StringBuilder();
        while (!st.isEmpty()) {
            result.append(st.pop());
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter encoded string: ");
        String input = sc.nextLine();

        String decoded = decodeString(input);
        System.out.println("Decoded string: " + decoded);

        sc.close();
    }
}
