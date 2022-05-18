public class Main {
    public static void main(String[] args) {
//        GenericStack<String> stack = new GenericStack<>();
//        stack.push("London");
//        stack.push("Paris");
//        stack.push("Taipei");
//        System.out.println(stack.pop());
//        System.out.println(stack.getSize());
//        System.out.println(stack.isEmpty());

        GenericStack<Integer> stack1 = new GenericStack<>();
        System.out.println(stack1.isEmpty());
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);

        System.out.println("The max number is " + max(stack1));
    }

    public static double max(GenericStack<? extends Number> stack){
        double max = stack.pop().doubleValue();
        while(!stack.isEmpty()){
            double value = stack.pop().doubleValue();
            max = Math.max(max, value);
        }
        return max;
    }
}