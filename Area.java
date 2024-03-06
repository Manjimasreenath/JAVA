import java.io.*;
import java.util.Scanner;
public class Area{
	public static void main(String args[]){
		while(true){
		Scanner inp=new Scanner(System.in);
		System.out.println("Menu\n1.Area of circle\n2.Area of square\n3.Area of rectangle\n4.exit");
		System.out.println("Enter your choice:");
		int ch=inp.nextInt();
		switch(ch)
		{
		case 1:System.out.println("Area of circle");
		       System.out.println("Enter the radius:");
		       float r=inp.nextFloat();
		       float ac=3.14f*r*r;
		       System.out.println("area="+ac);
		       break;
		case 2:System.out.println("Area of square");
		       System.out.println("Enter the side:");
		       int s=inp.nextInt();
		       int as=s*s;
		       System.out.println("area="+as);
		       break;
		case 3:System.out.println("Area of rectangle");
		       System.out.println("Enter the length:");
		       System.out.println("Enter the breadth:");
		       int l=inp.nextInt();
		       int b=inp.nextInt();
		       int ar=l*b;
		       System.out.println("area="+ar);
		       break;
		case 4:System.exit(0);
		break;
		default:System.out.println("You Have Entered a Wrong Number.");
		break;
		}
		}
		}
		}
		  
		
		       
