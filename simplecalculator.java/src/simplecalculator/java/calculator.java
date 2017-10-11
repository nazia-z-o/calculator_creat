package simplecalculator.java;
import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner input = new Scanner(System.in);

			    calculation operation = new calculation();

			    double answer = 0;
			    double inputA, inputB;
			    char operator;
			    int i=1;

			     while (i!=0) {
			        System.out.print("Please enter your operands and operation for calculation: ");

			        inputA = input.nextDouble();
			        operator = input.next().charAt(0);
			        inputB = input.nextDouble();        

			        switch (operator) {
			            case '+': answer = operation.add(inputA, inputB);
			                      break;
			            case '-': answer = operation.subtract(inputA, inputB);
			                      break;
			            case '*': answer = operation.multiply(inputA, inputB);
			                      break;
			            case '/': answer = operation.divide(inputA, inputB);
			                      break;
			            case '^': answer = operation.power(inputA, inputB);
			                      break;
			            case '%': answer = operation.modulus(inputA, inputB);
			                      break;
			        }

			            System.out.println(answer);     
			            System.out.println("Enter 0 to stop and 1 for continue: ");
			            i = input.nextInt();
			    }  
			     input.close();

			}
}

		

	


