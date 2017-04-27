package ncs.test6;



public class Calculate{

	
	int b=0;
	
public Calculate(){}

public int sum(int a, int b){
	int sum = (a + b);
	System.out.println("합 : " + sum);
	return sum;
}
public int subtract(int a, int b){
	int subtract = (a-b);
	System.out.println("차 : " + subtract);
	return subtract;
}
public int multiply(int a, int b){
	int multiply = (a*b);
	System.out.println("곱 : " + multiply);
	return multiply;
}
public int divide(int a, int b){
	int divide= (a/b);
	if(b == 0 || b < 0){
		
	}
	System.out.println("나누기 : " + divide);
	
	return a;
	
	
	}
	
}



