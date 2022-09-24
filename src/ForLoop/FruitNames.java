package ForLoop;

public class FruitNames {
	public static void main(String[] args) {
		String temp="";
		String[] fruit= {"Apple","Banana","Cherry","Dragon fruit"};
		/*for(int i=0;i<fruit.length;i++) {
			System.out.println(fruit[i]);
		}
		for(int i=fruit.length-1;i>=0;i--) {
			System.out.println(fruit[i]);
		}
		for(int i=(fruit.length-1)/2;i>=0;i--) {
			System.out.println(fruit[i]);
		}
		for(int i=fruit.length-1;i>=fruit.length/2;i--) {
			System.out.println(fruit[i]);
		}
		for(int i=0;i<fruit.length;i++) {
		System.out.println(fruit[i].charAt(0));
			
		}
		for(int i=0;i<fruit.length;i++) {
			System.out.println(fruit[i].charAt(i));
		}*/
		for(int i=0;i<fruit.length;i++) {
			System.out.println(fruit[i].charAt(fruit[i].length()-1));
		}
	}

}
