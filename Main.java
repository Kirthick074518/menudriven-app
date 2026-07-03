package menudriven;
import java.io.*;
import java.util.*;
class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        while(true) {
        System.out.println("Menu-driven Program");
        System.out.println("1.Add");
        System.out.println("2.Subtract");
        System.out.println("3.Multiply");
        System.out.println("4.Divide");
        System.out.println("5.Exit");
        System.out.println("Enter the choice");
        int c=sc.nextInt();
        switch(c) {
        case 1:
        	System.out.println("Enter the two numbers");
        	int a=sc.nextInt();int b=sc.nextInt();
        	Addition ad=new Addition();
        	System.out.println(ad.add(a, b));
        	break;
        case 2:
        	System.out.println("Enter the two numbers");
        	a=sc.nextInt();b=sc.nextInt();
        	Subtraction su=new Subtraction();
        	System.out.println(su.sub(a, b));
        	break;
        case 3:
        	System.out.println("Enter the two numbers");
        	a=sc.nextInt();b=sc.nextInt();
        	Multiplication mu=new Multiplication();
        	System.out.println(mu.mul(a, b));
        	break;
        case 4:
        	System.out.println("Enter the two numbers");
        	a=sc.nextInt();b=sc.nextInt();
        	Division di=new Division();
        	System.out.println(di.div(a, b));
        	break;
        default:
        	System.exit(0);
        }
        }
	}

}
