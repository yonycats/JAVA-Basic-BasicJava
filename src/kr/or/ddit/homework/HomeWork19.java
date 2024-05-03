package kr.or.ddit.homework;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HomeWork19 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HomeWork19 obj = new HomeWork19();
		obj.process();
	}

	public void process() {
		List<Map<String, Object>> parkList = inputData();
		
//		printAll(parkList);
		
		parkTime(parkList);
		parkPay(parkTime(parkList));
		
		// 주차비 최종 출력값
		Map<String, Object> parkPayResult = parkPay(parkTime(parkList));
		
		Set<String> keySet = parkPayResult.keySet();
		Iterator<String> it = keySet.iterator();
		
		
		
		while(it.hasNext()) {
			String key = it.next();
			
			DecimalFormat df = new DecimalFormat("###,###,###");
			String money = df.format(parkPayResult.get(key));

			System.out.println("차량번호 : "+key+" 주차비 : "+money+"원");
		}
			
	}
	
	
	
	// 0. 출력하기
	public Map<String, Object> printAll(List<Map<String, Object>> parkList) {
		
		for (Map<String, Object> map : parkList) {
			System.out.println("시각 : "+(String)map.get("시각")+", 차량번호 : "+map.get("차량번호")+", 내역 : "+map.get("내역"));
		} System.out.println();
		
		return null;
	}
	
	
	
	// 3. 요금 계산하기
	public Map<String, Object> parkPay(Map<String, Object> parkList) {
//		기본 시간(분)	기본 요금(원)	  단위 시간(분)	   단위 요금(원)
//		180			5000			10			600		
		// 차량번호=머무른 시간 {0148=670, 0000=275, 5961=146}
		
		Map<String, Object> resultTime = parkList;
		Map<String, Object> resultFinal = new HashMap();		
		
		Set<String> keySet = resultTime.keySet();
		Iterator<String> it = keySet.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			int resultMin = (Integer)resultTime.get(key)-180;
			int cost = 5000;
			
			if(resultMin<=0) {
				cost = 5000;
			} else if (resultMin>0) {
				cost = resultMin/10*600;
				if(resultMin%10!=0) {
					cost += 600;
				}
			}
			resultFinal.put(key, cost);
		}
		
		return resultFinal;
	}
	
	
	
	// 2. 차량별 주차 시간 구하기
	public Map<String, Object> parkTime(List<Map<String, Object>> parkList) {
		// 입차한 시간과 출차한 시간 빼기 = 주차 시간
		// getMin 메서드 호출해서 사용
		
		Map<String, Object> comeTime = new HashMap();
		Map<String, Object> outTime = new HashMap();
		Map<String, Object> resultTime = new HashMap();
		
		// NullPointerException 해결용
		for (Map<String, Object> map : parkList) {
			comeTime.put((String) map.get("차량번호"), 0);
			outTime.put((String) map.get("차량번호"), 0);
		}
		
		// 차량번호별 입차 시간의 합과 출차 시간의 합 모으기
		for (Map<String, Object> map : parkList) {
			String carNumber = (String) map.get("차량번호");
	        String content = (String) map.get("내역");
	        int min = getMin((String) map.get("시각"));
	        
	        if(content.equals("입차")) {
	        	comeTime.put(carNumber, min+(Integer)comeTime.get(carNumber));
	        } else if (content.equals("출차")) {
	        	outTime.put(carNumber, min+(Integer)outTime.get(carNumber));
	        }
		} 

		// resultTime 구하기 = 출차시간의 합 - 입차시간의 합
		for (String carCome : comeTime.keySet()) {
			for (String carOut : outTime.keySet()) {
				int resultMin = (Integer)outTime.get(carOut)-(Integer)comeTime.get(carCome);
				if (carCome.equals(carOut)) {
					resultTime.put(carCome, resultMin);
				}
			}
		}
		
		// getMin 메서드 환산 시간 확인용
//		for (Map<String, Object> map : parkList) {
//			System.out.println("차량번호 : "+map.get("차량번호")+", "+map.get("내역")+", 환산시간 : "+getMin((String)map.get("시각")));
//		}
		
		return resultTime;
	}
	
	
	
	// 시간을 int로 바꿔서 분 단위로 반환하는 메서드
	public int getMin(String time) {
		String[] tokens = time.split(":");
		int hour = Integer.parseInt(tokens[0]);
		int min = Integer.parseInt(tokens[1]);
		
		return hour*60+min;
	}
	
	
	
	// 1. 데이터 넣기
	public List<Map<String, Object>> inputData() {
//		시각	        차량번호     내역		
//      05:34   5961   입차
//      06:00   0000   입차
//      06:34   0000   출차
//      07:59   5961   출차
//      07:59   0148   입차
//      18:59   0000   입차
//      19:09   0148   출차
//      22:59   5961   입차
//      23:00   5961   출차
//		23:00	0000       출차
		
		Map<String, Object> parkList1 = new HashMap();
		parkList1.put("시각", "05:34");
		parkList1.put("차량번호", "5961");
		parkList1.put("내역", "입차");

		Map<String, Object> parkList2 = new HashMap();
		parkList2.put("시각", "06:00");
		parkList2.put("차량번호", "0000");
		parkList2.put("내역", "입차");

		Map<String, Object> parkList3 = new HashMap();
		parkList3.put("시각", "06:34");
		parkList3.put("차량번호", "0000");
		parkList3.put("내역", "출차");

		Map<String, Object> parkList4 = new HashMap();
		parkList4.put("시각", "07:59");
		parkList4.put("차량번호", "5961");
		parkList4.put("내역", "출차");

		Map<String, Object> parkList5 = new HashMap();
		parkList5.put("시각", "07:59");
		parkList5.put("차량번호", "0148");
		parkList5.put("내역", "입차");

		Map<String, Object> parkList6 = new HashMap();
		parkList6.put("시각", "18:59");
		parkList6.put("차량번호", "0000");
		parkList6.put("내역", "입차");

		Map<String, Object> parkList7 = new HashMap();
		parkList7.put("시각", "19:09");
		parkList7.put("차량번호", "0148");
		parkList7.put("내역", "출차");

		Map<String, Object> parkList8 = new HashMap();
		parkList8.put("시각", "22:59");
		parkList8.put("차량번호", "5961");
		parkList8.put("내역", "입차");

		Map<String, Object> parkList9 = new HashMap();
		parkList9.put("시각", "23:00");
		parkList9.put("차량번호", "5961");
		parkList9.put("내역", "출차");

		Map<String, Object> parkList10 = new HashMap();
		parkList10.put("시각", "23:00");
		parkList10.put("차량번호", "0000");
		parkList10.put("내역", "출차");

		List<Map<String, Object>> list = new ArrayList();
		list.add(parkList1);
		list.add(parkList2);
		list.add(parkList3);
		list.add(parkList4);
		list.add(parkList5);
		list.add(parkList6);
		list.add(parkList7);
		list.add(parkList8);
		list.add(parkList9);
		list.add(parkList10);

		return list;
	}
	
	
	
}
