package Homework_1;

import java.util.Random;
import java.util.Scanner;

public class  lake {
	
	public static void main(String[] args) {
		
		// 호수[5][5] 
		// 스캔 1,2,3,4
		//  
		int [][]a = new int[5][5];
		int tempx;
		int tempy;
		int count = 0;
		angler angler = new angler();
		
		Scanner scanner = new Scanner(System.in);
		Random rd = new Random();
		
		for(int i =0; i<3; i++) {
			tempx = rd.nextInt(5);
			tempy = rd.nextInt(5);
			if(a[tempx][tempy] == 1) {
				i--;
			}
			a[tempx][tempy] = 1;
		}
		
//		for(int i = 0; i < 5; i++) {
//			System.out.print(a[i][0]);
//			System.out.print(a[i][1]);
//			System.out.print(a[i][2]);
//			System.out.print(a[i][3]);
//			System.out.println(a[i][4]);
//		}
		while(true) {
			
			System.out.print("던지실 가로 위치를 입력해주세요 (0~4) : ");	angler.setA(scanner.nextInt());
			System.out.print("던지실 세로 위치를 입력해주세요 (0~4) : ");	angler.setB(scanner.nextInt());
			
			if(((angler.getA() < 5) && (angler.getA() >= 0 )) && ((angler.getB() < 5) && (angler.getB() >= 0 ))) {
				break;
			}
			System.out.println("다시 캐스팅해주세요.");
		}
		
		while(true) {
			
			if(a[angler.getA()][angler.getB()] == 1) {
				a[angler.getA()][angler.getB()] = 0;
				count++;
				if(count == 3) {
					System.out.println("물고기를 모두 잡았습니다 게임을 종료합니다.");
					break;
				}
				else System.out.println("물고기를 잡았습니다!");
			}
			
			System.out.println("방향을 입력해주세요 1.위  2.아래  3.왼쪽  4.오른쪽 : ");
			switch(scanner.nextInt()) {
				case 1: if(angler.getA() > 0) angler.up(); 		else System.out.println("더이상 위로 이동이 불가능합니다.");		break; 
				case 2: if(angler.getA() < 4) angler.down(); 	else System.out.println("더이상 아래로 이동이 불가능합니다.");		break;
				case 3: if(angler.getB() > 0) angler.left(); 	else System.out.println("더이상 왼쪽으로 이동이 불가능합니다.");		break;
				case 4: if(angler.getB() < 4) angler.right();	else System.out.println("더이상 오른쪽으로 이동이 불가능합니다.");	break;
			}
			System.out.println("현재좌표 : ( X : " + angler.getA() + " Y : " + angler.getB() + ")" );
	
		}
		
	}
	
}
