package apps;

//import stacks.LinkedListStack;
//import stacks.StackInterface;
//import stacks.StackUnderflowException;
//import stacks.*;

import stacks.LinkedListStack;
import stacks.StackInterface;
import stacks.StackUnderflowException;

import java.util.Scanner;

public class PostfixOperationApp {
    public static void main (String[] args) throws StackUnderflowException {
        String expression = "5 7 + 6 2 - *";
        Scanner in = new Scanner(expression);
        StackInterface<Integer> operands = new LinkedListStack<>();
        while(in.hasNext()){
            if (in.hasNextInt()){
                // it's an operand
                operands.push(in.nextInt());
            }
            else {
                // it's an operation
                System.out.println("Operation");
                Integer operand2 = null;
                try {
                    operand2 = operands.top();
                    System.out.println(operand2);

                } catch (StackUnderflowException e) {
//                    e.printStackTrace();
                    System.out.println("Not enough operands");
                }
                operands.pop();
                Integer operand1 = null;
                try {
                    operand1 = operands.top();
                    System.out.println(operand1);
                } catch (StackUnderflowException e) {
//                    e.printStackTrace();
                    System.out.println("Not enough operands");
                }

                operands.pop();
                Integer result = null;
                String operation = in.next();
//                System.out.println(operation);
                if(operation.equals("+")){
                    result = operand1 + operand2;
                    System.out.println("+" + result);
                }
                if(operation.equals("-")){
                    result = operand1 - operand2;
                    System.out.println("-" + result);

                }
                if(operation.equals("*")){
                    result = operand1 * operand2;
                    System.out.println("*" + result);

                }
                if(operation.equals("/")){
                    result = operand1 / operand2;
                    System.out.println("/" + result);

                }
                System.out.println(result);
                operands.push(result);
            }
        }
        System.out.println(operands.top());
    }
}
