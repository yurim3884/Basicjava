package chapter02.exercise;

import java.util.Scanner;

public class Exercise25 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("500원짜리 동전의 갯수: ");
		//System.out.print("500원짜리 동전의 갯수: ");
		int coin500 =scanner.nextInt();
		
		System.out.println("100원짜리 동전의 갯수: ");
		//System.out.print("100원짜리 동전의 갯수: ");
		int coin100 =scanner.nextInt();
		
		System.out.println("50원짜리 동전의 갯수: ");
		//System.out.print("50원짜리 동전의 갯수: ");
		int coin50 =scanner.nextInt();
		
		System.out.println("10원짜리 동전의 갯수: ");
		//System.out.print("10원짜리 동전의 갯수: ");
		int coin10 =scanner.nextInt();
		
		int coin = coin500*500 + coin100*100 + coin50 *50 +coin10*10;
		
		System.out.println("저금통 안의 동전의 총 액수: "+coin );
		
		scanner.close();
		//스캐너를 사용하고 닫았다고 선언을 해야한다 
	}

}
