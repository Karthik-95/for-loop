package ForLoop;

public class StringREverse1 {
	public static void main(String[] args) {
		String word="onesoft";
		String temp="";
		char[] name=word.toCharArray();
		for(int i=name.length-1;i>=0;i--) {
			System.out.println(name[i]);
		}
	}
}
