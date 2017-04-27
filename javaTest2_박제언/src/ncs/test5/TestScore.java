package ncs.test5;

import java.util.Scanner;

public class TestScore {

	public static void main(String[] args) {
		//키보드로 3과목의 점수를 입력받는다.
		Scanner sc = new Scanner(System.in);
		double[][] ss = new double[3][3];
	
		double sum = 0;
		
		
		for(int i = 0; i < ss.length; i++){
		for(int j = 0; j < ss[i].length; j++){
			System.out.println(i+"번 학생 점수 과목" +(j+1)+":");
			ss[i][j]= sc.nextInt();
		}
		}
		
		System.out.println("index\t과목1\t과목2\t과목3\t총점\t평균");

		for (int i = 0; i < ss.length; i++) {
			System.out.print(i);

			for (int j = 0; j < ss[i].length; j++) {
				System.out.print("\t" + ss[i][j]);
				sum += ss[i][j];
			}

			System.out.print("\t"+sum+"\t");
			System.out.printf("%.1f",(sum/3));
			System.out.println();
			sum=0;
		
		
	}
	}}

