package sec02.verofy.exam04;


public class Exam05 {
	public static void main(String[] args) {

		int[][] array = { 
							{ 95, 86 }, //array[0].length
							{ 83, 92, 96 }, //array[1].length
							{ 78, 83, 93, 87, 88 } }; //array[2].length

		int sum = 0;
		double avg = 0.0;
		int count =0;
		
		for (int i = 0; i < array.length; i++) { //array의 세로방향으로 이동
			for (int j = 0; j < array[i].length; j++) { //array의 가로방향으로 이동
				sum+=array[i][j];
				count++;
			}
		}
		
		avg=(double)sum/ count;
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}

}
