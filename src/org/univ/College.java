package org.univ;

public class College extends University {
	
	 @Override
	public void ug() {
		 System.out.println("ug is undergraduate");
		
	}

	@Override
	public void pg() {
		 System.out.println("pg is post graduate");
		 System.out.println("pg is post graduate");
		
		
	}
    public static void main(String[] args) {
		College c=new College();
		c.ug();
		c.pg();
    	
    	
    	
	}
	
	
	
}
