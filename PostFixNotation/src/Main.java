import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(postFix("1 2 + 3 *"));
    }

    public static int postFix(String expression) {
        String[] tokens = expression.split(" ");
        Stack<Integer> operandStack = new Stack<>();
        for (String token : tokens) {
            if (token.length() == 0) {
            } else if (token.charAt(0) == '+' ||
                    token.charAt(0) == '-' ||
                    token.charAt(0) == '*' ||
            token.charAt(0) == '/'){
                calculate(operandStack, token.charAt(0));
            }else{
                operandStack.push(Integer.valueOf(token));
            }
        }
        return operandStack.pop();
    }

    public static void calculate(Stack<Integer> operandStack, char operator){
        int op1 = operandStack.pop();
        int op2 = operandStack.pop();
        if(operator == '+') operandStack.push(op2 + op1);
        if(operator == '-') operandStack.push(op2 - op1);
        if(operator == '*') operandStack.push(op2 * op1);
        if(operator == '/') operandStack.push(op2 / op1);
    }
}