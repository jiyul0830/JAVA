package com.mc.g_coffeemanager;

import java.util.Scanner;

public class I_coffemanager {

	public static void main(String[] args) {

		int balance = 100000; // 잔고 100000
		int salesPrice = 0; // 매출
		int expences = 0; // 지출
		
		// Coffee() : 생성자
		// Coffee 타입의 인스턴스를 생성할 때 사용하는 특수한 매서드
		// Coffee에 다른거 넣어도 OK
		Coffee americano = new Coffee(); // 인스턴스화 : 앞의 결과로 만들어지는 뉴 커피가 인스턴스
		americano.name = "아메리카노"; // name : 객체의 속성 
		americano.price = 3000;
		americano.cost = 2000;
		americano.stock = 10;
		americano.safetyStock = 3;
		americano.safetyStock = 0;
		
		Coffee moca = new Coffee("moca", 4000, 3000, 10, 3, 0);
		Coffee latte = new Coffee("라떼", 5000, 4000, 10, 3, 0);
		
		Coffee[] drinks = {americano, moca, latte};
		

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\n=========Menu=========");
			System.out.println("판매등록(1)");
			System.out.println("현황(2)");
			System.out.println("종료(3)");
			System.out.print("입력 : ");

			int inputMenu = sc.nextInt();

			if (inputMenu == 1) {
				// 음료 메뉴판
				for (int i = 0; i < drinks.length; i++) {
					System.out.println(drinks[i].name + "(" + i + ")");
				}

				System.out.print("\n * 판매한 커피코드 : ");
				int inputCode = sc.nextInt();
				System.out.print(" * 판매량 : ");
				int orderCnt = sc.nextInt();

				if (inputCode < 0 || inputCode >= drinks.length) {
					System.out.println("정확한 상품번호를 선택해 주세요.");
					continue;
				}

				if (orderCnt > drinks[inputCode].stock) {
					// 주문량이 재고보다 많으면 주문을 취소한다.
					System.out.println("재고가 부족해 주문을 취소합니다.");
					continue;
				}

				drinks[inputCode].stock -= orderCnt;
				balance += drinks[inputCode].price * orderCnt;
				// 매출등록
				salesPrice += drinks[inputCode].price * orderCnt;
				drinks[inputCode].salesCnt += orderCnt;

				// 커피 재고가 안전재고 미만이 되면 안전재고의 두 배 만큼 매입한다.
				if (drinks[inputCode].stock < drinks[inputCode].safetyStock) {

					if (balance > drinks[inputCode].safetyStock * 2 * drinks[inputCode].cost) {
						drinks[inputCode].stock += drinks[inputCode].safetyStock * 2;
						balance -= drinks[inputCode].safetyStock * 2 * drinks[inputCode].cost;
						// 지출등록
						expences += drinks[inputCode].safetyStock * 2 * drinks[inputCode].cost;
						System.out.println("[system:log] 안전재고를 확보하였습니다.");
					} else {
						// 잔고가 부족해 매입이 불가능하면 안전재고 매입을 취소한다.
						System.out.println("[system:log] 잔고가 부족해 안전재고 확보에 실패하였습니다.");

					}
				}

				System.out.println("\n제품명 : 아메리카노");
				System.out.println("판매가 : " + drinks[inputCode].price);
				System.out.println("판매수량 : " + orderCnt);
				System.out.println("결제금액 : " + drinks[inputCode].price * orderCnt);
				System.out.println("남은 재고 : " + drinks[inputCode].stock);

			} else if (inputMenu == 2) {

				for (int i = 0; i < drinks.length; i++) {
					System.out.println(drinks[i].name + "| 재고 : " + drinks[i].stock + "| 판매량 : " + drinks[i].salesCnt);
				}

				System.out.println("\n=========================");
				System.out.println();
				System.out.println("잔고 : " + balance + " | 매출 : " + salesPrice + " | 지출 : " + expences);

			} else if (inputMenu == 3) {

				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("알맞은 번호를 입력하세요.");

			}

		}

	}

}
