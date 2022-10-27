package chapter03;

public class INcreseDecreaseOperatorExample {
	public static void main(String[] args) {
		int x=10;
		int y=10;
		int z;
		
		System.out.println("------------------------------");
		x++;
		++x;
		System.out.println("x"+x);
		
		System.out.println("------------------------------");
		y++;
		++y;
		System.out.println("y"+y);
		System.out.println("------------------------------");
		z =x++;
		//z=x가 진행된 후에 x++1 수행
		System.out.println("z"+z);
		System.out.println("x"+x);
		System.out.println("------------------------------");
		z =++x;
		System.out.println("z"+z);
		System.out.println("x"+x);
		
		System.out.println("------------------------------");
		z =++x + y++;
		System.out.println("z"+z);
		System.out.println("x"+x);
		System.out.println("y"+y);
		
		
	}

}
