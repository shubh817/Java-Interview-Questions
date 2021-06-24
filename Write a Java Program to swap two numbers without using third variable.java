import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first number: ");
	int a = sc.nextInt();
	System.out.println("Enter the second number: ");
	int b = sc.nextInt();
	b=b+a;
	a=b-a;
	b=b-a;
	System.out.println(a);
	System.out.println(b);

	}
}
