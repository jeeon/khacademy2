package ncs.test4;

import java.util.Random;

public class TestSort {

	public static void main(String[] args) {
		//select sort
		Random ran = new Random();
		int[] sc = new int[10];
		
		for(int i = 1; i < 11; i++){
		System.out.println(randomRange(51, 100));
		
		for(int k = 0; k < sc.length; k++){
			for(int e = k+1; e < sc.length; e++){
				if(sc[k] > sc[e]){
					int temp = sc[e];
					sc[k] = sc[e];
					sc[k] = temp;
				}
			}
			System.out.print(sc[k]+", ");
		
		}
		
		}
		
	
	
	}

	private static int randomRange(int i, int j) {
		return (int)(Math.random()*(i-j+1))+j;
	}
	
	
}
