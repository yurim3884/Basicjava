package chapter05;

import java.util.Arrays;
import java.util.Currency;

public class ArrayExample {
	public static void main(String[] args) {
		/*
		 * 배열 Array 참조 타입 [하나의 데이터에 여러개의 데이터를 저장하는 공간] [] : 인덱싱(자바에서는 0), 배열 만들 때 등 여러가지
		 * 상황에 쓰임
		 * 
		 * --------------------- 사용형식 타입 [변수] ex)int[] intArray;
		 * 
		 * 타입 변수[] ex)int intArray[];
		 * 
		 * 참조할 배열 객체가 없는 경우 타입 [] 변수 = null ---------------------
		 * 
		 * =>Collection Framework(13장) 자바에서 배열보다 더 많이 사용
		 * 
		 * 1차 배열 확장 =>2차 3차(X)
		 * 
		 *  리터럴 형식으로 표현 {} 사용
		 *  파이썬등 대부분의 언어 nums = [1,2,3,]
		 *  자바  int[] nums = {1,2,3, };
		 *  
		 *  Currency[] cArr = new Currency[10];	
		 *  Arrays[] myArrays =new Arrays[5];	 
		 *  
		 *  */

		// 25개가 들어가는 name 변수 선언
		String[] name = new String[25];
		name[0] = "권나영";
		name[1] = "김성준";
		name[2] = "김용익";
		name[24] = "허자연";

		for (int i = 0; i <= 25; i++) {
			// System.out.println( name + i); - 오류
			System.out.println(name[i]);
			
			Currency[] cArr = new Currency[10];
			Arrays[] myArrays =new Arrays[5];
	
		}

	}

}
