package chapter04;

import java.util.Scanner;

public class sddddd {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("점수를 입력하세요");
		System.out.print("프로그래밍 기초 : ");
		int pro = scanner.nextInt();
		System.out.print("데이터베이스 : ");
		int db = scanner.nextInt();
		System.out.print("화면 구현 : ");
		int scr = scanner.nextInt();
		System.out.print("애플리케이션 구현 : ");
		int app = scanner.nextInt();
		System.out.print("머신러닝 : ");
		int mac = scanner.nextInt();

		int total = pro + db + scr + app + mac;
		double ave = total / 5.0;

		System.out.println("총점: " + total);
		System.out.printf("평균: %.2f\n", ave);

//		switch ((int) ave / 10) {
//
//		case 9:
//		case 10:
//			System.out.println("학점: A");
//			break;
//		case 8:
//			System.out.println("학점: B");
//			break;
//		case 7:
//			System.out.println("학점: C");
//			break;
//		case 6:
//			System.out.println("학점: D");
//			break;
//
//		default:
//			System.out.println("학점: F");
//			break;
//		}
		
		switch ((int) (ave-(ave % 10))) {
		case 100:
		case 90:
			System.out.println("학점: A");
			break;
		case 80:
			System.out.println("학점: B");
			break;
		case 70:
			System.out.println("학점: C");
			break;
		case 60:
			System.out.println("학점: D");
			break;

		default:
			System.out.println("학점: F");
			break;
		}
		scanner.close();
		
		}
	
	}


