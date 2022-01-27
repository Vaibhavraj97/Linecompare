package com.bridgelabz.linecompare;
import java.lang.Math;

public class LinecompareUC2 {
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
         
       }   
        public static void main(String[] args)
	{
		LinecompareUC2 object = new LinecompareUC2();
		object.length();
		object.length1();
	}
	
	
}
