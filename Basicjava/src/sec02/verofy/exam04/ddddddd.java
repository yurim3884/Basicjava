package sec02.verofy.exam04;

public class ddddddd {

	boolean login(String id, String password) {
		if (id.equals("hong") && password.equals("12345")) {
			return true;
		} else {
			return false;
		}
	}

	void logout(String id) {
		System.out.println("로그아웃 되었습니다");
	}
}