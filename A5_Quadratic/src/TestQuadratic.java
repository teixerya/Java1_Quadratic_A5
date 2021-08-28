package A_5V2;/*

Tester class for Quadratic

Write a client i.e. a tester class that prompts the user iteratively to enter
values for a, b, and c and displays
the result based on the discriminant. The program should end if the user enters
0 for a.
Tester class should also try-catch the exceptions

*/

//Import Scanner in the java.util package
import A_5V2.Quadratic;



class TestQuadratic{

	public static void main(String[] args){

		Quadratic q1 = new Quadratic();// Object
		System.out.println(q1);

		// test mutator for A (see note below)
		//Quadratic q2 = new Quadratic(0, -2, -2);

		// test 2-param constructor, accessors/mutators
		Quadratic q3 = new Quadratic(2, 2);//Object
		System.out.println(q3);
		q3.setA(-2);
		System.out.println(q3);
		q3.setB(-2);
		System.out.println(q3);
		q3.setC(-2);
		System.out.println(q3);
		System.out.printf("%.2f %.2f %.2f\n", q3.getA(), q3.getB(), q3.getC());

		// test solutions

		// no solutions
		Quadratic q4 = new Quadratic(3, 2, 7);//object
		System.out.println(q4);
		System.out.printf("#solns: %d\n", q4.numSolutions());
		System.out.printf("Dis: %.2f\n", q4.discriminant());

		// 1 solution
		Quadratic q5 = new Quadratic(1, -5, -4);
		System.out.println(q5);
		System.out.printf("#solns: %d\n", q5.numSolutions());
		System.out.printf("Dis: %.2f\n", q5.discriminant());

		// 2 solutions
		Quadratic q6 = new Quadratic(9, 12, 4);
		System.out.println(q6);
		System.out.printf("#solns: %d\n", q6.numSolutions());
		System.out.printf("Dis: %.2f\n", q6.discriminant());

		System.out.println("[ solutions() bonus code ]");
		double[] solns4 = q4.solutions();
		System.out.println(solns4);
		double[] solns5 = q5.solutions();
		for (double s : solns5)
			System.out.printf("%.2f ", s);
		System.out.println();
		double[] solns6 = q6.solutions();
		for (double s : solns6)
			System.out.printf("%.2f ", s);
		System.out.println();

	}
}
