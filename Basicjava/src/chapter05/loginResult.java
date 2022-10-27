package chapter05;

public class loginResult {
	public static void main(String[] args) {
		
		LoginResult1 result =LoginResult1.FAIL_PASSWORD;
		
		if(result ==LoginResult1.SUCCESS) {
			System.out.println("로그인 성공");
		}else if(result ==LoginResult1.FAIL_ID){
			System.out.println("로그인 성공");
		}else if(result ==LoginResult1.FAIL_PASSWORD){
			System.out.println("로그인 성공");
		}else System.out.println("로그인 실패");
	}

}
