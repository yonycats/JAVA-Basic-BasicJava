package kr.or.ddit.study07.sec02.tell.copy;

import java.util.Scanner;

public class TellMain {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		TellMain obj = new TellMain();
		obj.process();
	}

	public void process() {
		
		System.out.println("전화 상담의 분배 방식 선택");
		System.out.println("R : RoundRobn");
		System.out.println("L : LeastJob");
		System.out.println("P : PriotyAllocation");
		System.out.println("선택 >>");
		String select = sc.next();
		
		/*
		 * Schedular 클래스.
		 *  getNextCall(); 
		 *  sendCallToAgent (); 
		 *  
		 * RoundRobn, LeastJob, PriorityAllocation 클래스는 각각 
		 * Schedular 클래스를 상속 받기. 
		 *  
		 * PriorityAllocation
		 *  getNextCall 
		 *  -> 우선 순위가 높은 상담전화를 대기열에서 가져옴. 
		 *  sendCallToAgent
		 *  -> 업무 스킬이 가장 우수한 상담원에게 상담전화를 분배.
		 * 
		 * RoundRobn
		 *  getNextCall
		 *  -> 상담전화를 대기열에서 차례대로 가져옴.
		 *  sendCallToAgent
		 *  -> 차례대로 상담원에게 상담전화를 분배.
		 * 
		 * LeastJob 
		 *  getNextCall 
		 *  -> 상담전화를 대기열에서 차례대로 가져옴. 
		 *  sendCallToAgent 
		 *  -> 대기열이 가장 짧은 상담원에게 상담전화를 분배.
		 */
		
		Schedular tell = null;
		
		// 아래는 대문자만 인식 가능
//		if(select.equals("R")) tell = new RoundRobn();
//		if(select.equals("L")) tell = new LeastJob();
//		if(select.equals("P")) tell = new PriorityAllocation();
		
		// 대소문자 둘다 인식 가능하게 하는 것
		if(select.equalsIgnoreCase("R")) tell = new RoundRobn();
		if(select.equalsIgnoreCase("L")) tell = new LeastJob();
		if(select.equalsIgnoreCase("P")) tell = new PriorityAllocation();
		
		tell.getNextCall();
		tell.sendCallToAgent();
		

	}

}
