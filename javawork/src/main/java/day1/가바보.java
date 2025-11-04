package day1;

import java.util.Scanner;

public class 가바보 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int user = 0;
		int win = 0;
		int draw = 0;
		int lose = 0;
//반복문
		while (true) {
			int com = (int) Math.floor(Math.random() * 3 + 1);
			System.out.println("1.가위 2.바위 3.보 0.종료");

			// 사용자 값을 입력
			user = scanner.nextInt();
			// 0이면 종료
			if (user == 0) {
				System.out.println("최종 전적: " + win + "승 " + draw + "무 " + lose + "패");
				System.out.println("프로그램 종료");
				break;
			}
			// 1~3이 아니면 다시 입력
			if (user > 3) {
				System.out.println("0~3 사이 숫자를 입력해주세요");
				continue;
			}

			switch (user) {
			case 1:
				if (com == 1) {
					System.out.println("user: 가위 | com: 가위 | 결과: 무승부");
					draw++;
					System.out.println("현재 전적: " + win + "승 " + draw + "무 " + lose + "패");
					break;
				} else if (com == 2) {
					System.out.println("user: 가위 | com: 바위 | 결과: 패배");
					lose++;
					System.out.println("현재 전적: " + win + "승 " + draw + "무 " + lose + "패");
					break;
				} else {
					System.out.println("user: 가위 | com: 바위 | 결과: 보 승리");
					win++;
					System.out.println("현재 전적: " + win + "승 " + draw + "무 " + lose + "패");
					break;
				}
			case 2:

				if (com == 1) {
					System.out.println("user: 바위 | com: 가위 | 결과: 승리");
					win++;
					System.out.println("현재 전적: " + win + "승 " + draw + "무 " + lose + "패");
					break;
				} else if (com == 2) {
					System.out.println("user: 바위 | com: 바위 | 결과: 무승부");
					draw++;
					System.out.println("현재 전적: " + win + "승 " + draw + "무 " + lose + "패");
					break;
				} else {
					System.out.println("user: 바위 | com: 보 | 결과: 패배");
					lose++;
					System.out.println("현재 전적: " + win + "승 " + draw + "무 " + lose + "패");
					break;
				}
			case 3:
				if (com == 1) {
					System.out.println("user: 보 | com: 가위 | 결과: 패배");
					lose++;
					System.out.println("현재 전적: " + win + "승 " + draw + "무 " + lose + "패");
					break;
				} else if (com == 2) {
					System.out.println("user: 보 | com: 바위 | 결과: 승리");
					win++;
					System.out.println("현재 전적: " + win + "승 " + draw + "무 " + lose + "패");
					break;
				} else {
					System.out.println("user: 보 | com: 보 | 결과: 무승부");
					draw++;
					System.out.println("현재 전적: " + win + "승 " + draw + "무 " + lose + "패");
					break;
				}

			}// end switch
		} // end while

		int ranNum = (int) Math.floor(Math.random() * 100 + 1);

	}
}
