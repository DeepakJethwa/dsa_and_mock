import java.util.*;
public class bracketformedbalancedornot {
    static boolean bracketarebalanced(String bracket){
        Deque<Character> stack = new ArrayDeque<Character>();
        for(int i=0;i<bracket.length();i++){
            char A = bracket.charAt(i);

            if(A =='(' || A =='[' || A== '{'){
                stack.push(A);
                continue;
            }
            if(stack.isEmpty())
                return false;
            char check;
            switch(A){
                case ')': check= stack.pop();
                if(check=='{' || check=='[')
                    return false;
                break;

                case'}': check=stack.pop();
                if(check=='(' || check=='[')
                    return false;
                break;

                case']': check= stack.pop();
                if(check=='(' || check== '{')
                    return false;
                break;
            }
        }
        return (stack.isEmpty());
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String bracket = sc.next();

        if(bracketarebalanced(bracket)) {
            System.out.println("balanced");
        }else{
            System.out.println("not balanced");
        }

    }
}
