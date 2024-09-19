import java.util.Scanner;

public class NumberOfNotes {

	public static void main(String[] args) {
		//Write a program to count total number of notes
		//in given amount
		// 68
		// 20 --1
		// 5---1
		// 2---1
		// 1--1
		// 9384720293
		
		int money=51, notes20 =0,notes10=0,
				notes5=0,notes2=0,notes1=0,
						notes50=0;
		String totalValue = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter money");
		money = sc.nextInt();
		
		
		
		
		if(money >= 50) {
			notes50 = money/50;
			money = money - (notes50 * 50);
			totalValue = totalValue + "50Notes--->"+notes50+"\n";
		}
		if(money >= 20) {
			notes20 = money/20;
			money = money - (notes20 * 20);
			totalValue = totalValue +"20Notes--->"+notes20+"\n";
		}
		if(money >= 10) {
			notes10 = money/10;
			money = money - (notes10 * 10);
			totalValue = totalValue +"10Notes--->"+notes10+"\n";
		}
		if(money >= 5) {
			notes5 = money/5;
			money = money - (notes5 * 5);
			totalValue = totalValue +"5Notes--->"+notes5+"\n";
		}
		if(money >= 2) {
			notes2 = money/2;
			money = money - (notes2 * 2);
			totalValue = totalValue +"2 Coins--->"+notes2+"\n";
		}
		if(money ==1) {
			notes1 = money;
			money = money - notes1 ;
			totalValue = totalValue +"1 Coin--->"+notes1;
		}
		
		System.out.println(totalValue);
		
		
		
		
		
	}
	

}
