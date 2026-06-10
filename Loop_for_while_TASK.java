package ragul;
import java.util.Scanner;
public class Loop_for_while_TASK {
	public static void main(String[] args) {
		
		
//		Loop (for, while) - Java Based Questions...
		
		
//		1. Write a Java program to display the factorial of a number.
		
		Scanner loop = new Scanner(System.in);
		int fac = 1;
		System.out.print("Enter Number for Factorial : ");
		int no = loop.nextInt();
		for(int noo = no ; noo>0 ; noo--) {
			fac*=noo;	
		}
		System.out.println("Factorial : "+fac);
		System.out.println("---------------------------------------------");
		
//		2. Print first 10 natural numbers using for & while loop in Java.
		
//		~~~~~~~~~~~~~~~~~For loop
		
		System.out.print("First 10 Natural is : ");
		for(int natural = 1 ; natural<=10 ; ++natural) {
			System.out.print(natural+",");
			}
		System.out.println();
		System.out.println("---------------------------------------------");
		
//		~~~~~~~~~~~~~~~~~While loop
		
		System.out.print("First 10 Natural is : ");
		int natural1 = 1;

        while(natural1 <= 10) {
            System.out.print(natural1+",");
            natural1++;
        }
        System.out.println();
        System.out.println("---------------------------------------------");
        
//    	3. Write a Java program to print sum of first 10 natural numbers.
		
        int zero = 0;
		
		System.out.print("Sum of First 10 Natural is : ");
		for(int natural2 = 1 ; natural2<=10 ; ++natural2) {
			zero+=natural2;
			}
		System.out.println(zero);
		System.out.println("---------------------------------------------");
		
//		4. Write a Java program to print multiplication table of a given number.
		
		System.out.println("     Multiplication table");
		System.out.print("Enter Number : ");
		int Mul = loop.nextInt();
		for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + Mul + " = " + (Mul * i));
        }
		System.out.println("---------------------------------------------");
		
//		5. Write a Java program to display the Fibonacci series up to n terms.
		
		System.out.println("~~~~~Fibonacci series~~~~~");
		
		int n1 = 0;
		int n2 = 1;
		for(int r = 1; r<=5; r++) {
			int n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
		System.out.println("---------------------------------------------");
		
//		6. Write a Java program to check if the given number is palindrome or not.
		
		System.out.println("     Palidrome Number");
		System.out.print("Enter Value : ");
		int x = loop.nextInt();
		int y = 0;
		int tem = x;
		while(tem>0) {
			int z = tem%10;
			y=10*y+z;
			tem=tem/10;
		}
		if(y==x) {
			System.out.println(y+" is Palidrome");
		}else {
			System.out.println(y+" is Not Palidrome");
		}
		System.out.println("---------------------------------------------");
		
//		7. Write a Java program to check if the given number is Armstrong or not.
		
		System.out.println("     Armstrong Number");
		System.out.print("Enter Value : ");
		int a = loop.nextInt();
		int b = 0;
		int count=0;
		int original = a;
		int temp = a;
		while(a>0) {
			a=a/10;
			count++;
		}
//		System.out.println(count);
		while(temp>0) {
			int d = temp%10;
			b+=Math.pow(d, count);
			temp=temp/10;
		}
		if(b==original) {
			System.out.println(b+" is Armstrong Number");
		}else {
			System.out.println(b+" is Not Armstrong Number");
		}
		System.out.println("---------------------------------------------");
		
//		8. Write a Java program to calculate HCF of two given numbers.
		
		System.out.println("     HCF");
        System.out.print("Enter first number: ");
        int l = loop.nextInt();

        System.out.print("Enter second number: ");
        int m = loop.nextInt();

        int hcf = 1;
        
        for(int n = 1; n <= l && n <= m; n++) {
            if(l % n == 0 && m % n == 0) {
                hcf = n;
            }
        }
        System.out.println("HCF = " + hcf);
        System.out.println("---------------------------------------------");
        
//      9.  Write a Java program which iterates integers from 1 to 50. For multiples 
//        of three print "hi" instead of the number and for multiples of five print
//        "hello". For numbers which are multiples of both three and
//        five print "hihello".
//		
        for(int i = 1; i <= 50; i++) {
        	if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i+"    hihello");
        	}
            else if(i % 3 == 0) {
            	System.out.println(i+"    hi");
            }
            else if(i % 5 == 0) {
                System.out.println(i+"    hello");
            }
            else {
                System.out.println(i+" --------");
            }
        }
        System.out.println("---------------------------------------------");
        
//       10. Write a Java program to check if given number is prime number or not.
        
        System.out.println("     Prime Number ");
        System.out.print("Enter No : ");
        int prime = loop.nextInt();
        int nop = 0;
        for(int i = 1; i <= prime; i++) {
            if(prime % i == 0)
                nop++;
        }

        if(nop == 2) {
            System.out.println(prime+" Prime Number");
        }
        else {
            System.out.println(prime+" Not Prime Number");
        }
        System.out.println("---------------------------------------------");
        
//       11. Write a Java program to print prime numbers between 0 to 100, and
//        print how many prime numbers there are
		
        System.out.print("Prime Number are : ");
        int countPrime = 0;

        for(int n = 2; n <= 100; n++) {

            int count1 = 0;

            for(int i = 1; i <= n; i++) {
                if(n % i == 0)
                    count1++;
            }

            if(count1 == 2) {
                System.out.print(n+",");
                countPrime++;
            }
        }
        System.out.println();
        System.out.println("Total Prime Numbers = " + countPrime);
        System.out.println("---------------------------------------------");
        
//        12. Write a Java program to find all the positive divisors of an integer.
         
        System.out.println("     Divisors of Number");
        System.out.print("Enter a number: ");
        int x1 = loop.nextInt();

        System.out.print("Divisors are : ");

        for(int i = 1; i <= x1; i++) {
            if(x1 % i == 0) {
                System.out.print(i+",");
            }
        }
        System.out.println();
        System.out.println("---------------------------------------------");
		
//        13. Write a Java program to find sum of first n odd & even numbers.
        
        System.out.print("Enter value of n: ");
        int x2 = loop.nextInt();
        int evenSum = 0;
        int oddSum = 0;
        for(int i = 1; i <= x2; i++) {

            evenSum = evenSum + (2 * i);

            oddSum = oddSum + (2 * i - 1);
        }
        System.out.println("Sum of Even Number Formula is n(n+1)");
        System.out.println("Sum of Even Numbers = " + evenSum);
        System.out.println("Sum of Odd Number Formula is n^2");
        System.out.println("Sum of Odd Numbers = " + oddSum);
        System.out.println("---------------------------------------------");
        
//      14.  Write a Java program to print perfect square of a number.
        
        System.out.println("     Perfect Square");
        System.out.print("Enter a number: ");
        int y1 = loop.nextInt();
        int square = y1 * y1;
        System.out.println("Perfect Square = " + square);
        System.out.println("---------------------------------------------");
        
//		-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-
	}
} 