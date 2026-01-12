package Stack;

import java.util.ArrayDeque;

public class ValidParenthesis {
    public static void main(String[] args) {

        String exp = "{({{[]}})}";
        System.out.println(validParenthesis(exp));

    }

    static boolean validParenthesis(String s){
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for(int i=0; i<s.length(); i++){
            char current = s.charAt(i);

            if(current == '(' || current == '{' || current == '['){
                stack.push(current);
            }
            else {
                if (stack.isEmpty()) return false;
                char opening = stack.pop();
                if((opening == '(' && current == ')') || (opening == '{' && current == '}') || (opening == '[' && current == ']')){
                    continue;
                }else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
