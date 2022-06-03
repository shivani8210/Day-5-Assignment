package com.shi.q1;

public class Employee {
		
	private int employeeId;
		
	private String employeeName;
		
	private double salary;
		
	private double netSalary;
		
	public void setEmployeeId(int employeeId) {
			 
		this.employeeId=employeeId;
		        
	}
		 
	public void setEmployeeName(String employeeName) {
		    	
		this.employeeName=employeeName;
		        
	}
		    
	public void setSalary(double salary) {
		    	
		this.salary=salary;
		        
	}
		    
	public void setNetSalary(double netSalary) {
		    	
		this.netSalary=netSalary;
		        
	}
		    
	public int getEmployeeId() {
		    	
		return employeeId;
		        
	}
		 
	public String getEmployeeName() {
			 
		return employeeName;
		        
	}
		 
	public double getSalary() {
			 
		return salary;
		    
	}
		 
	public double getNetSalary() {
			 
		return netSalary;
		    
	}
		 
	public void calculateNetSalary(double pfpercentage) {

		double pfamount=salary * (pfpercentage / 100);
		    
		netSalary=salary - pfamount;
		    
	}
	
	@Override
	public String toString() {
		
		String output = new StringBuffer()
				
				.append("Id: ").append(employeeId)
				
	            .append(System.lineSeparator()).append("Name: ").append(employeeName)
	            
	            .append(System.lineSeparator()).append("Salary: ").append(salary)
	            
	            .append(System.lineSeparator()).append("Net Salary: ").append(netSalary).toString();
		
	    return output;
	    
	}

}

