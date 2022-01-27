package com.bridgelabz.linecompare;
public class LinecompareUC3 {
	int x1=2;
	int x2=4;
	int y1=10;
	int y2=15;
	public void length() {
		double Length =Math.sqrt((x2-x1)^2+(y2-y1)^2);
		
		System.out.println(Length);
	}
	
       public void length1(){

         int L1=y1-x1;
       System.out.println(L1);
        
         int L2=y2-x2;
        System.out.println(L2);
        
      
        if (L1 == L2)
        {
      System.out.println("lengths are equal");
        }
      	
        else if (L1 > L2)
        {
        	System.out.println("length L1 is Greater than length L2");
        }
        else if (L1 < L2)
        {
        	System.out.println(" L1 is less than length L2");
        }
        
        
       }   
        public static void main(String[] args)
	{
		LinecompareUC3 object = new LinecompareUC3();
		object.length();
		object.length1();
	}
       
	
	

}



