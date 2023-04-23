package info.app;

import java.util.Scanner;
import info.app.org.Employee;
import info.app.org.Manager;
import info.app.org.Worker;

public class TestEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("_______Employee Testing_________");
		System.out.println();
		System.out.println("Enter Employee Array size");
		int size = sc.nextInt();

		Employee arr[] = new Employee[size];
		//System.out.println("___________________________________________________\n");
//	    System.out.println();
//	    System.out.println("Manager Information");
//	    System.out.println();
//		Manager mgr = new Manager (50,"Ram",55,80000.00,200.00);
//		
//		arr[0]=mgr;
//		System.out.println(arr[0]);
//		System.out.println(arr[0].computeNetSal());
//		
//		System.out.println("____________________________________________");
//        System.out.println();
//        System.out.println("Worker Information");
//        System.out.println();
//        Worker w = new Worker(77,"Sham",99,40000,120,4);
//        arr[1]=w;
//        System.out.println(w);
//        System.out.println(w.computeNetSal());

		System.out.println("________________________________________________________________________");
         System.out.println("Enter Manager Information");
		System.out.println("id,name,deptid,Bsal,perBonus");
		for (int i = 0; i < 1; i++) {

			arr[i] = new Manager(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextDouble(),sc.nextDouble());

		}

		System.out.println("------------------------------------------");
		  System.out.println("Enter Worker Information");
		System.out.println("id,name,deptid,Bsal,hrsRate,hrsWorked");
		for (int i = 1; i < 2; i++) {

			arr[i] = new Worker(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextDouble(),sc.nextDouble(),sc.nextInt());

		}
		
		System.out.println();
		System.out.println("OUTPUT");
		System.out.println();
		for(Employee e : arr) {
			
			System.out.println(e);
			
			if(e instanceof Manager) {
				
				System.out.println(((Manager)e).computeNetSal());
				
			}
			
            if(e instanceof Worker) {
				
				System.out.println(((Worker)e).computeNetSal());
				
			}
            System.out.println();
			System.out.println("**********************************************");
			System.out.println();
		}
		
		
		
		

	}

}
