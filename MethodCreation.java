package javabasicprgs;

public class MethodCreation {
	
	public void multi() {
		int a=10;
		int b=20;
		int c=a*b;
		System.out.println(c);
		
	}
	
	public static void main(String[] args) {
		MethodCreation mc = new MethodCreation();
		mc.multi();
	}

}
