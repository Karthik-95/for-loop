package ForLoop;

public class RollNumber {
	public static void main(String[] args) {
		int[] rollNumber=new int[5];
		rollNumber[0]=110;
		rollNumber[1]=121;
		rollNumber[2]=112;
		rollNumber[3]=114;
		rollNumber[4]=118;
		for(int i=rollNumber.length-1;i>=0;i--) {
			System.out.println(rollNumber[i]);
		}
	}

}
