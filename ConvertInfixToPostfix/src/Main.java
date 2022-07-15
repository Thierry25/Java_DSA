import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(infixToPostfix(" ( 2 * 1 ) + 3 "));
    }

    public static String infixToPostfix(String expression){
        StringBuilder postfix = new StringBuilder();
        String[] tokens = expression.split(" ");
        Stack<Integer> operandStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();
        for(String token : tokens){
            if(token.length() == 0) continue;
            else if(token.charAt(0) == '+' ||
                    token.charAt(0) == '-' ||
                    token.charAt(0) == '*' ||
                    token.charAt(0) == '/' ){
                operatorStack.push(token.charAt(0));
            } else if(token.charAt(0) == '(') operatorStack.push('(');
            else if(token.charAt(0) == ')'){
                while(operatorStack.peek() != '('){
                    postfix.append(createString(operandStack, operatorStack));
                }
                operatorStack.pop();
            }else{
                operandStack.push(Integer.valueOf(token));
            }
        }
        while(!operandStack.isEmpty()){
            postfix.insert(0, operandStack.pop() + " ");
            while(!operatorStack.isEmpty()) {
                char c = operatorStack.pop();
                if(c != '(' || c != ')'){
                    postfix.append(c).append(" ");
                }
            }
            //postfix.append(createNewString(operandStack, operatorStack));
        }
        return postfix.toString();
    }

    public static String createString(Stack<Integer> numbers, Stack<Character> characters){
        int op1 = numbers.pop();
        int op2 = numbers.pop();
        char operator = characters.pop();
        if(operator != '(') return String.format("%d %d %c ", op2, op1, operator);
        return String.format("%d %d ", op2, op1);
    }
    
}