import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String expression = "(1+3*3-2) * (12 / 6 * 5)";
        System.out.println(evaluateExpression(expression));
//        if (args.length != 1) {
//            System.out.println("Usage: java Main ...");
//            System.exit(1);
//        }
//
//        try {
//            System.out.println(evaluateExpression(args[0]));
//        } catch (Exception e) {
//            System.out.println("Wrong expression " + args[0]);
//        }
    }

    public static int evaluateExpression(String expression) {
        Stack<Integer> operandStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();

        expression = insertBlanks(expression);

        String[] tokens = expression.split(" ");
        for (String token : tokens) {
            if (token.length() == 0) {
            } else if (token.charAt(0) == '+' || token.charAt(0) == '-') {
                while (!operatorStack.isEmpty() &&
                        (operatorStack.peek() == '+' ||
                                operatorStack.peek() == '-' ||
                                operatorStack.peek() == '*' ||
                                operatorStack.peek() == '/')) {
                    processAnOperation(operandStack, operatorStack);
                }
                operatorStack.push(token.charAt(0));
            } else if (token.charAt(0) == '*' || token.charAt(0) == '/') {
                while (!operatorStack.isEmpty() &&
                        (operatorStack.peek() == '*' ||
                                operatorStack.peek() == '/')) {
                    processAnOperation(operandStack, operatorStack);
                }
                operatorStack.push(token.charAt(0));
            }else if(token.charAt(0) == '(') operatorStack.push('(');
            else if(token.charAt(0) == ')'){
                while(operatorStack.peek() != '('){
                    processAnOperation(operandStack, operatorStack);
                }
                operatorStack.pop();
            }else{
                operandStack.push(Integer.valueOf(token));
            }
        }
        while(!operatorStack.isEmpty()){
            processAnOperation(operandStack, operatorStack);
        }
        return operandStack.pop();
    }

    public static void processAnOperation(Stack<Integer> operandStack, Stack<Character> operatorStack){
        char operator = operatorStack.pop();
        int op1 = operandStack.pop();
        int op2 = operandStack.pop();
        if(operator == '+') operandStack.push(op2 + op1);
        if(operator == '-') operandStack.push(op2 - op1);
        if(operator == '*') operandStack.push(op2 * op1);
        if(operator == '/') operandStack.push(op2 / op1);
    }

    public static String insertBlanks(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == ')' ||
                    s.charAt(i) == '+' || s.charAt(i) == '-' ||
                    s.charAt(i) == '*' || s.charAt(i) == '/') result += " " + s.charAt(i) + " ";
            else
                result += s.charAt(i);
        }
        return result;
    }
}