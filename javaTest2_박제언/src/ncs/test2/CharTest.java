package ncs.test2;

import java.util.Scanner;

public class CharTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자 입력 : ");
		String liter = sc.nextLine();
		
		int count = liter.length();
		
		for(int i = count-1; i>=0; i--){
			System.out.print(liter.toUpperCase().charAt(i));
	}

	}

}
