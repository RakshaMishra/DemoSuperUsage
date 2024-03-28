package com.kodnest.superusage;

public class Child extends Parent {
	int a=20;
	  void display()
	   {   int a=30;
		   System.out.println(this.a);
		   System.out.println(super.a);
		   System.out.println(a);
		   super.display();
	   }

}
