package ForLoop;

public class Bike4 {
	public static void main(String[] args) {
		int count=0;
		int[] cc= {250,200,100,125,150,160,180,220,390,690,900};
		for(int i=cc.length-1;i>=cc.length/2;i--) {
			count=count+1;
			System.out.println(cc[i]);
			
		}
		System.out.println("count="+count);
	}

}
