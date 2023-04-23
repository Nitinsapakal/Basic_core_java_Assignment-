package info.app.org;

public class Manager extends Employee {

	private double perBonus;
	
	public Manager() {
		super();
		this.perBonus=10;
	}

	public Manager(int id, String name, int deptid, double bsal,double perBonus) {
		super(id, name, deptid, bsal);
		
		//super.bsal+perBonus;
		this.perBonus=perBonus;
	}
@Override
	public double computeNetSal() {
  	  
  	  System.out.println("Total Salary of Manager");
  	  
  	  return super.bsal+(perBonus);
    }
	
	public double getPerBonus() {
		
		return this.perBonus;
	}
	
	public String toString () {
  	  System.out.println("Manager Information created Succesfully");
  	  return super.toString()+" "+perBonus;
  	  
    }
	
	

}
