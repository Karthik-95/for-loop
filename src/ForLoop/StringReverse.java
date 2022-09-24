package ForLoop;

public class StringReverse {
	public static void main(String[] args) {
		String word="onesoft";
		String temp="";
		char[] name=word.toCharArray();
		for(int i=name.length-1;i>=0;i--) {
			temp=temp+name[i];
			System.out.println(temp);
		}
		/*
		System.out.println(temp);
	
	 */
	}
}
