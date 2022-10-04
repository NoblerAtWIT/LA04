import java.util.Scanner;

public class LA04a {
	

	public static int gcd(int a, int b) {
			
	if(b == 0) {
		return a;
	}
	return gcd(b, a % b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);

int a, b;

System.out.printf("Enter a:");
a = input.nextInt();
System.out.printf("Enter b:");
b = input.nextInt();

System.out.println("The GCD of " + a +" and " + b +" is: " + gcd(a,b));


	}

}
