import java.util.Scanner;

public class LA04b {

	public LA04b() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);

int x, m, b, x1, x2, y1, y2,  r, inp;

System.out.printf("Enter the Number for which Equation Would You Like. %n");
System.out.printf("1.)Slope Intercept of a Straight Line %n");
System.out.printf("2.)Slope of Two Points %n");
System.out.printf("3.)Area of a Sphere %n");
inp = input.nextInt();

if (inp == 1) {
	System.out.printf("Enter m: %n");
	m = input.nextInt();
	System.out.printf("Enter x: %n");
	x = input.nextInt();
	System.out.printf("Enter b: %n");
	b = input.nextInt();
 
int y = ((m*x)+b);

System.out.printf("Answer to the Equation: %.2f%n" , y);
}
else if (inp == 2) {
	System.out.printf("Enter y1 and y2: ");
	y1 = input.nextInt();
	y2 = input.nextInt();
	System.out.printf("Enter x1 and x2: ");
	x1 = input.nextInt();
	x2 = input.nextInt();
	
int m2 = ((y2-y1)/(x2-x1));

System.out.printf("Answer to the Equation: %.2f%n" , m2);
}
else if (inp == 3) {
	System.out.printf("Enter r: ");
	r = input.nextInt();
	
double A = (4*Math.PI*(r*r));

	System.out.printf("Answer to the Equation: %.2f%n", A);
}
	}

}
