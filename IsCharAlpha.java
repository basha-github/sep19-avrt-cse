import java.util.Scanner;

public class IsCharAlpha {

	public static void main(String[] args) {
		//Write a program to check whether a character 
		//is alphabet or not
		char ch = ' ';
		// 65
		// 65+25--90
		// 97+25--122
		//z-122
		System.out.println((int)ch);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter char");
		String str = sc.next();
		ch = str.charAt(0);
		
		if( (ch>=65 && ch <=90)|| (ch>=97 && ch <=122)) {
			System.out.println("Alphabet");
		}
		else {
			System.out.println("Not");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
