package ncs.test5;

import java.util.Scanner;

public class TestScore {

	public static void main(String[] args) {
		//Ű����� 3������ ������ �Է¹޴´�.
		Scanner sc = new Scanner(System.in);
		double[][] ss = new double[3][3];
	
		double sum = 0;
		
		
		for(int i = 0; i < ss.length; i++){
		for(int j = 0; j < ss[i].length; j++){
			System.out.println(i+"�� �л� ���� ����" +(j+1)+":");
			ss[i][j]= sc.nextInt();
		}
		}
		
		System.out.println("index\t����1\t����2\t����3\t����\t���");

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

