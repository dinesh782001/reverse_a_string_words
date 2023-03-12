package reverse;

import java.util.Scanner;

public class Back {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the ");
		String name=scanner.next();
		char[] words=name.toCharArray();
		

		StringBuilder sb=new StringBuilder();
		for(int i=words.length -1;i>=0;i--) {
			sb.append(words[i]);
		}

		System.out.println(sb.toString());

	}

}
