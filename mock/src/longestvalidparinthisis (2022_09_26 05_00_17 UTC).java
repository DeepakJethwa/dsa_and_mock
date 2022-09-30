import java.util.*;
public class longestvalidparinthisis {
    public static int longestparinthisis(String s) {
        Stack<Integer> stack = new Stack<>();

        stack.push(-1);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr == '(') {
                stack.push(i);
            }else{
                    if (!stack.isEmpty() && stack.peek() >= 0 && s.charAt(stack.peek()) == '(') {
                        stack.pop();
                        int last = stack.peek();
                        result = Math.max(result, i - last);
                    } else {
                        stack.push(i);
                    }
                }
            }
            return result;
        }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(longestparinthisis(s));
    }
}
