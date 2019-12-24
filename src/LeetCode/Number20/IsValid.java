package LeetCode.Number20;

import java.util.Stack;

//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
//
//有效字符串需满足：
//
//左括号必须用相同类型的右括号闭合。
//左括号必须以正确的顺序闭合。
public class IsValid {
    public static void main(String[] args) {
        String s="{{[}](})";
        System.out.println(isValid(s));
    }
    private static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (isLeft(ch)){
                stack.push(ch);
            }else {
                if (!isPairs(stack.peek(), ch)) {
                    stack.pop();
                }else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean isPairs(char c1,char c2){
        return c1 == '(' && c2 == ')' || c1 == '{' && c2 == '}' || c1 =='[' && c2 ==']';
    }

    private static boolean isLeft(char c){
        return c == '{' || c == '[' || c == '(';
    }
}
