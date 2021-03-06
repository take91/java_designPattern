package com.take91.dp;

public class DefaultGameConnectHelper extends AbstGameConnectHelper {

	@Override
	protected String doSecurity(String string) {
		System.out.println("강화된 알고리즘을 이용한 디코드");
		return string;
	}

	@Override
	protected boolean authentication(String id, String password) {
		System.out.println("아이디/암호 확인 과정");
		return true;
	}

	@Override
	protected int authorization(String username) {
		System.out.println("권한 확인");
		// 서버에서 유저이름으로 유저 나이를 확인한 후
		// 현재시각을 확인 한 후 현재 시각이 10시 이후인데 미성년자 일 경우
		// 접속 차단
		return 0;
	}

	@Override
	protected String connection(String info) {
		System.out.println("마지막 접속단계!");
		return info;
	}

}
