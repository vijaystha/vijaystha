
public class Operatorspractice {

	public static void main(String[] args) {
		int total = addition(-25, -5);
		System.out.println(total);

		int sub = substraction(25, 89805);
		System.out.println(sub);

		int mul = multiplication(2890, 9895);
		System.out.println(mul);

		double div = division(2, 5); // ctrl+ shift +f - beautify program
		System.out.println(div);
	}

	public static int addition(int num1, int num2) {
		return num1 + num2;

	}

	public static int substraction(int num1, int num2) {
		return num1 - num2;
	}

	public static int multiplication(int num1, int num2) {
		return num1 * num2;
	}

	public static double division(double num1, double num2) {
		return num1 / num2;

	}

}
/*
 * //four different methods: +, - ,*, / int num1, num2, addition,subtraction,
 * multiplication, division; num1 = 6; num2= 2; int sum = num1 + num2; int
 * subtract = num1 - num2; int multiply = num1 * num2; int divide = num1/num2;
 * System.out.println(sum); System.out.println(subtract);
 * System.out.println(multiply); System.out.println(divide); //program is not
 * correct
 */
