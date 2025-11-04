package game;

import java.util.Scanner;

public class GuessNum {
	public void start() {
		Scanner scanner = new Scanner(System.in);
		// 반복문
		while (true) {
			System.out.println("1~100까지 숫자를 입력해주세요");
			int user = 0;
			int com = (int) Math.floor(Math.random() * 100 + 1);
			int cnt = 0;
			String restart = "";
			while (true) {
				user = scanner.nextInt();
				// 0이면 종료
				if (user == 0) {
					System.out.println("프로그램 종료");
					break;
				}
				// 1~3이 아니면 다시 입력
				cnt++;
				if (user > com) {

					System.out.println("난수보다 큽니다");
					System.out.println("시도횟수: " + cnt);
				} else if (user < com) {

					System.out.println("난수보다 작습니다");
					System.out.println("시도횟수: " + cnt);
				} else if (user == com) {

					System.out.println("정답입니다");
					System.out.println("시도횟수: " + cnt);
					break;
				} else {
					System.out.println("범위안의 숫자를 입력해주세요");
				}
			}
			restart = scanner.nextLine();
			System.out.println("다시 시작하시겠습니까? Y/N");
			if (restart == "Y") {
				continue;
			} else if (restart == "N") {
				break;
			}
		}
	}

}
