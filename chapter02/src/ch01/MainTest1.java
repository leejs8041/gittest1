package ch01;

public class MainTest1 {

	// main 함수(코드의 시작)
	public static void main(String[] args) {

		Order order1 = new Order();
		// 멤버 변수의 특성.
		// 1.order1 값을 넣어주세요

		order1.orderId = "coffee";
		order1.buyerId = "jj";
		order1.productId = 123;
		order1.sellerId = "Master";
		order1.orderDate = "2021-10-21";

		System.out.println(order1.orderId);
		System.out.println(order1.buyerId);
		System.out.println(order1.sellerId);
		System.out.println(order1.productId);
		System.out.println(order1.orderDate);

		System.out.println("====================");

		// 2. userInfo1 값 넣고 화면에 출력

		UserInfo userInfo1 = new UserInfo();

		userInfo1.phoneNumber = "010-1234-5678";
		userInfo1.userAddress = "xxxxxx";
		userInfo1.userId = "1q2w3e4r";
		userInfo1.userName = "이름어렵네";
		userInfo1.userPassWord = "*******";

		System.out.println(userInfo1.phoneNumber);
		System.out.println(userInfo1.userAddress);
		System.out.println(userInfo1.userId);
		System.out.println(userInfo1.userName);
		System.out.println(userInfo1.userPassWord);

	}// end of main

}// end of class
