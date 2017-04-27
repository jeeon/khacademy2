package ncs.test3;

public class TvTest {

	public static void main(String[] args) {
		Tv[] tvArray = new Tv[3];
		int c = 0, d=tvArray.length-1;
		{
			tvArray[0] = new Tv("INFINIA" , 1500000, "LED TV");
			tvArray[1] = new Tv("XCANVAS" , 1000000, "LCD TV");
			tvArray[2] = new Tv("CINEMA" , 2000000, "3D TV");
		}
		
		for(int i = 0; i <tvArray.length; i++){
			System.out.println(tvArray[i].toString());
		if(tvArray[c].getPrice()<tvArray[i].getPrice()){
			c=i;
		}
		if(tvArray[d].getPrice()>tvArray[i].getPrice()){
			d=i;
		}
		
		
		}
		
		System.out.println("가장 비싼 제품 : " + tvArray[c].getName());
		System.out.println("가장 싼 제품 : " + tvArray[d].getName());
	}

}
