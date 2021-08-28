package A_5V2;
/*Name: Ryan Teixeira
Assignment:  Assignment 5
Program: Information systems engineering
/*

An object oriented class called Quadratic that models a
standard quadratic equation.

The member a represents the quadratic coefficient, and can't be 0
(it can be greater than or less than 0, but not equal to 0).
 The default value is 1.

The member b represents the linear coefficient and can be any value,
so no validation is necessary. The default value is 1.

The member c represents the constant and can be any value,
so no validation is necessary. The default value is 0.

numSolutions() returns the number of solutions the equation has.
Recall that if the discriminant is greater than 0,
there are 2 solutions; if the discriminant is less than 0,
there are no solutions; if the discriminant is equal to 0,
there is one solution.

numSolutions(discriminant : double) receives the discriminant
and returns the number of solutions the equation has.

discriminant() returns the discriminant value of the equation.

 */

public class Quadratic {
	
	private double a = 1;
	private double b = 1;
	private double c = 0;
	
	
	public Quadratic( ){ };
	
	public Quadratic(double a, double b) {
		setA(a);
		setB(b);
	}
	
	public Quadratic(double a, double b, double c) {
		setA(a);
		setB(b);
		setC(c);
	}
	
	public void setA(double a)  {

		if (a == 0) {
			throw new IllegalArgumentException("Quadratic coefficient" +
					" can't be 0.");
		}  else {
			this.a = a;
		}
	}
	
	public double getA( ) {
		
		return  a;
		
	}
	
	public void setB(double b) {
		
			this.b = b;
		
	}
	
	public double getB( ) {
		
		return  b;
		
	}
	
	public void setC(double c) {
		
			this.c = c;
			
	}
	
	public double getC( ) {
		
		return  c;
		
	}
	
	public double discriminant( ) {

		return Math.pow( b, 2) - 4 * a * c;
	}
	
	public int numSolutions( ) {
		double discriminant = discriminant();

		if  (discriminant < 0)
			return 0;
		else  if (discriminant == 0)
			return 1;
		else
			return 2;
	}
	
	public int numSolutions( double discriminant ) {
		if  (discriminant < 0)
			return 0;
		else  if (discriminant == 0)
			return 1;
		else
			return 2;
	}
	
	public double[ ] solutions( ){

		double r1 = 0;
		double r2 = 0;


		
		if  (discriminant( ) < 0) {
			return null;
		}

		else if (discriminant( ) == 0) {
			r1 = ( (-b) + Math.sqrt(discriminant( ) ) ) / (2 * a);
			double discriminantArray[ ]= new double[1];
			discriminantArray[0] = r1;
			return discriminantArray;
		} else {
			r1 = ( (-b) + Math.sqrt(discriminant( ) ) ) / (2 * a);
			r2 = ( (-b) - Math.sqrt(discriminant( ) ) ) /(2 * a);
			double discriminantArray[ ]= new double[2];

			discriminantArray[0] = r1;
			discriminantArray[1] = r2;
			return discriminantArray;
		}

	}

	public String toString( ) {
		if (a == 1 && b == 1 && c == 0) {
			return String.format("x^2 + x = 0");
		} else if (c == 0){
			return String.format("%.1fx^2 + %.1fx = 0"
					, a, b );
		} else {

			String str = "%.1fx^2 + %.1fx + %.1f = 0";

			double tempb = b;
			double tempc = c;
			if (b<0) {

				tempb = -b;
				if (a==1 )  {
					if (b==-1){
						if  (c==0)
							return String.format("x^2  - x ");
					}else {
						if  (c<0) {
							tempc = -c;
							return String.format("x^2  -  %.1fx  - %.1f =  0", tempb, tempc );
						} else
							return String.format("x^2  -  %.1fx  + %.1f =  0", tempb, c);
					}

				}

				str  = "%.1fx^2 - %.1fx + %.1f = 0";
			}


			if (c<0){
				str  = "%.1fx^2 - %.1fx - %.1f = 0";
				tempc = -c;
			}

			return String.format(str, a, tempb, tempc);
		}


	}    //end of toString() method

			
} // end of Quadratic class