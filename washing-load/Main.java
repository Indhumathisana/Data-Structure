//washing machine:


import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	if(0<n &&  n<2000){
	    System.out.println("Time Estimated:25minutes");
	}
	else if(2000<n &&  n<4000){
	    System.out.println("Time Estimated:35minutes");
	}
	else if(4000<n &&  n<7000){
	    System.out.println("Time Estimated:45minutes");
	}
	
	
		else if(n>7000){
	    System.out.println("Overload");
	}
	else{
	    System.out.println("Invalid Input");
	}
	
}
}