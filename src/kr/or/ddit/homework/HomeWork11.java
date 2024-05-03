package kr.or.ddit.homework;

import java.awt.CardLayout;
import java.util.Random;
import java.util.Scanner;

// 1. 카드 클래스 완성
// 2. 카드 toString 완성

public class HomeWork11 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork11 obj = new HomeWork11();
		obj.process();
	}

	public void process() {
		// 카드를 사고,
		Deck deck = new Deck();
		// 카드를 섞음
		deck.suffle();
//		deck.printCardList();

		// 내 카드랑 랜덤 카드를 비교해서
		// 숫자가 높다면 이김
		// 숫자가 같으면 짐
		int ranComCard = new Random().nextInt(51);

		// 랜덤값을 넣는 두가지 방법 (0~51까지의 수)
		// new Random().nextInt(52) 은 0~52미만의 수를 포함함 : 0~51
//		int ranComCard = new Random().nextInt(52);
		// (int)(Math.random()*52) 은 0.xxxx * 52로써, 52 미만의 수를 포함함 : 0~51
//		int ranEx = (int)(Math.random()*52);
//		System.out.println(ranEx);

		Card myCard = deck.getCard(0);

		// 컴퓨터 카드는 랜덤 카드

		Card comCard = deck.getCard(ranComCard);

		System.out.println("myCard : " + myCard);
		System.out.println("comCard : " + comCard);

		if (myCard.num == comCard.num) {
			System.out.println("Lose");
		} else if (myCard.num > comCard.num) {
			System.out.println("Win");
		} else if (myCard.num < comCard.num) {
			System.out.println("Lose");
		}

	}

	public void print(Card my, Card com) {
		// 결과값 출력
		// 내 카드 ♤1, 컴퓨터 ◇5
		// 숫자가 같으면 짐
		// 결과 : lose

	}

}

// 카드
class Card {
	String type;
	int num;

	// 생성자 type, num 입력할 것
	public Card(String type, int num) {
		this.type = type;
		this.num = num;
	}

	// 출력은 toString으로
	@Override
	public String toString() {
		// type "♤","♡","♧","◇"
		// num 1~13
		// 1 => a로 출력
		// 11=>J, 12=>Q, 13=>K

		String result = type + num;
		if (num == 1)
			result = type + "A";
		if (num == 11)
			result = type + "J";
		if (num == 12)
			result = type + "Q";
		if (num == 13)
			result = type + "K";
		return result;
	}

}

// 카드뭉치
// Deck이라는 클래스를 새로 생성하면 (new)52개의 카드뭉치가 새로 생김
class Deck {
	Card[] cardList;

	public Deck() {
		cardList = new Card[52];
		String[] type = { "♤", "♡", "♧", "◇" };
		int cnt = 0;

		for (String t : type) {
			for (int i = 1; i <= 13; i++) {
				// ?? = 타입 "♤","♡","♧","◇"과 넘버 1~13
				cardList[cnt++] = new Card(t, i);
			}

		}
	}

	public void suffle() {
		// 카드 섞기
		for (int i = 0; i < 100000; i++) {
			int ran0 = new Random().nextInt(cardList.length);
			Card[] temp = new Card[1];
			temp[0] = cardList[0];
			cardList[0] = cardList[ran0];
			cardList[ran0] = temp[0];
		}
	}

	// 카드 10개 출력
	public void printCardList() {

		int cnt = 0;

		for (int i = 0; i < cardList.length; i++) {
			System.out.print(cardList[i] + "\t");
			cnt++;
			if (cnt % 13 == 0 && i != 0) {
				System.out.println();
			}
		}
	}

	public Card getCard(int ran) {
		return cardList[ran];
	}

}
