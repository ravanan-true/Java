package ragul;
import java.util.Scanner;
public class For_loop_Task {

	public static void main(String[] args) {
		
//		Java For and while loop tasks:
//
//			1. Write a Java program to find the factorial of a given number.

		Scanner loop = new Scanner(System.in);
		int fac = 1;
		System.out.print("Enter Number for Factorial : ");
		int no = loop.nextInt();
		for(int noo = no ; noo>0 ; noo--) {
			fac*=noo;	
		}
		System.out.println("Factorial : "+fac);
		System.out.println("---------------------------------------------");
		
		
//		2. Write a Java program to print the first 10 natural numbers using a for loop.
		
		System.out.print("First 10 Natural is : ");
		for(int natural = 1 ; natural<=10 ; ++natural) {
			System.out.print(natural+",");
			}
		System.out.println("---------------------------------------------");
		
//		3. Write a Java program to find the sum of the first 10 natural numbers.
		 
		int zero = 0;
		
		System.out.print("Sum of First 10 Natural is : ");
		for(int natural1 = 1 ; natural1<=10 ; ++natural1) {
			zero+=natural1;
			}
		System.out.println(zero);
		System.out.println("---------------------------------------------");
		
//		4. Write a Java program to print the multiplication table of a given number.
		
		System.out.print("Enter Number : ");
		int Mul = loop.nextInt();
		for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + Mul + " = " + (Mul * i));
        }
		System.out.println("---------------------------------------------");
		
//		5. Square Patten
		
		for(int i = 1; i<=5;i++) {
			for(int j = 1; j <= 5;j++) {
				System.out.print("$"+" ");
			}
			System.out.println();	
		}
		System.out.println("---------------------------------------------");
		
//		6. Hallow Square Patten
		
		for(int i = 1; i<=5;i++) {
			for(int j = 1; j <= 5;j++) {
				if(i==1 || i==5 || j == 1 || j==5) {
					System.out.print("#"+" ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();	
		}	
		System.out.println("---------------------------------------------");
		
//		7. Plus Pattern

		for(int i = 1; i<=5;i++) {
			for(int j = 1; j <= 5;j++) {
				if(i==3 ||j == 3) {
					System.out.print("+"+" ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
		System.out.println();
		}
		System.out.println("---------------------------------------------");
		
//		8. APPLE Cross Patten
		
		String s = "APPLE";
		
		
		System.out.println();
		
		for(int i = 0; i<5;i++) {
			for(int j = 0; j < 5 ;j++) {
				if(i==j || i+j==4) {
					System.out.print(s.charAt(i)+" ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();	
		}
		System.out.println("---------------------------------------------");
		
//		9. APPLE Plus Patten
		
		String s1 = "APPLE";
		
		for(int i = 0; i<5;i++) {
			for(int j = 0; j < 5;j++) {
				if(i==2 ) {
					System.out.print(s1.charAt(j)+" ");
				}else if(j == 2) {
					System.out.print(s1.charAt(i)+" ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();	
		}	
		System.out.println("---------------------------------------------");

//		10. 
		
		for(int i = 1; i<=5;i++){
			for(int j = 1; j <= i;j++) {
				System.out.print("*"+" ");
		}
			System.out.println();
		}	
		System.out.println("---------------------------------------------");
		
//		11.
		
		for(int i = 1; i<=5;i++) {
			for(int j = 5; j >= i;j--) {
				System.out.print("#"+" ");
			}
			System.out.println();	
		}			
		System.out.println("---------------------------------------------");
			
		
//		12. 
		
		for(int i = 1;i<=5;i++) {
		for(int j = 5;j>=i;j--) {
			System.out.print(" "+" ");
		}
		for(int j = 1; j <= i;j++) {
			System.out.print("*"+" ");
		}
		for(int j = 1; j <= i-1;j++) {
			System.out.print("*"+" ");
		}
		System.out.println();
	}
		System.out.println("---------------------------------------------");
		

//		13. Cross Patten
	
		
		for(int i = 1; i<=5;i++) {
			for(int j = 1; j <= 5;j++) {
				if(i==j || i+j == 6) {
					System.out.print("*"+" ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();	
		}		
		System.out.println("---------------------------------------------");
		
		





		


		
	}
}
