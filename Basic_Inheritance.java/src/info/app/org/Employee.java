package info.app.org;

public class Employee {
	
      private int id;
      private String name;
      private int deptid;
      protected double bsal;
      
      public Employee() {
    	  
    	  this.id=100;
    	  this.name="default";
    	  this.deptid=101;
    	  this.bsal=2000.00;
    	  
    	  
      }
      
      public Employee(int id,String name,int deptid,double bsal){
    	  
    	  this.id=id;
    	  this.name=name;
    	  this.deptid=deptid;
    	  this.bsal=bsal;
    	  
    	  
      }
      public String toString () {
    	  
    	  return id+" "+name+" "+deptid+" "+bsal;
    	  
      }
      
      public double computeNetSal() {
    	  
    	  System.out.println("Inside computeNetSal Emp");
    	  return 0;
      }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public double getBsal() {
		return bsal;
	}
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
}
