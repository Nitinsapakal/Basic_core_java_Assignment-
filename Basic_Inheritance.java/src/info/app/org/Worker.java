package info.app.org;

public class Worker extends Employee {

	private int hrsWorked;
	private double hrsRate;
	
	
	
	public Worker() {
		super();
		this.hrsWorked=0;
		this.hrsRate=0;
	}

	public Worker(int id, String name, int deptid, double bsal,double hrsRate,int hrsWorked) {
		super(id, name, deptid, bsal);
		
		this.hrsRate=hrsRate;
		this.hrsWorked=hrsWorked;
	}
	@Override
	public double computeNetSal() {
	  	  
	  	  System.out.println("Total Salary of Worker");
	  	  
	  	  return super.bsal+(hrsWorked*hrsRate);
	    }
	
	@Override
	public String toString() {
		System.out.println("Worker Information created Succesfully");
		return super.toString()+" "+hrsRate+" "+hrsWorked;
	}
	

	public int getHrsWorked() {
		return hrsWorked;
	}

	public double getHrsRate() {
		return hrsRate;
	}

	
	
	
	
	
}
