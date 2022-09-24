package ForLoop;

public class Student {
	public static void main(String[] args) {
		int[] mark= {92,82,97,100,96};
		int count=0;
		int total=0;
		for(int i=0;i<mark.length;i++) {
			count=count+1;
			total=total+mark[i];
		}
		System.out.println("Average = "+total/count);
		
	}

}
