package kr.or.ddit.study13.map;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExample02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		MapExample02 obj = new MapExample02();
		obj.process();
	}

	public void process() {
		// 1. DB 데이터를 [컬렉션]-List와 Map으로 넣어보기
		List<Map<String, Object>> empList = inputData();
		
		// 2. 회원정보 중, 급여의 최댓값 구하기
		int max = getMaxSalary(empList);
		System.out.println("월급 최댓값은 : "+max);
		
		// 3. 회원정보 중, 급여의 최솟값 구하기
		int min = getMinSalary(empList);
		System.out.println("월급 최솟값은 : "+min);
		
		// 4. 회원정보 출력하기
		printAll(empList);
		
		// 5. 부서번호에 따른 급여 합계 구하기 
		addDepsal(empList);
		
		// 6. 영업부의 월급을 10%씩 올리기
		increseDept(empList);
	}
	
	
	
	// 6. 영업부의 월급을 10%씩 올리기
	public void increseDept(List<Map<String, Object>> empList) {
		// Map 전체 출력하기
		printAll(empList);
		
		System.out.println("인상할 부서 번호를 입력하세요.");
		int deptno = sc.nextInt();
		
		// 선택받은 부서는 월급 10% 인상
		for (Map<String, Object> map : empList) {
			int deptno2 = (int) map.get("DEPTNO");

			// 선택한 부서가 아니라면 continue
			if (deptno != deptno2) {
				continue;
			}
			else {
				int sal = (int) map.get("SAL");
				sal = (int)(sal*1.1);

				map.put("SAL", sal);
			}
		}
		
		printAll(empList);
	}
	
	
	
	// 5. 부서번호에 따른 급여 합계 구하기 
	public void addDepsal(List<Map<String, Object>> empList) {
		Map<Integer, Integer> resultMap = new HashMap<Integer, Integer>();
		
		for (Map<String, Object> map : empList) {
			int sal = (int)map.get("SAL");
			int deptno = (int)map.get("DEPTNO");
		
			// 값이 이미 들어가있을 경우는 (deptno에 30이 들어가 있는데, 30이 또 나올 경우),
			// sal의 기존값에 +를 함
			if(resultMap.containsKey(deptno)) {
				sal+=resultMap.get(deptno);
			}
		resultMap.put(deptno, sal);
		
		}
		System.out.println(resultMap);
		
	}
	
	
	
	// 4. 회원정보 출력하기
	public void printAll(List<Map<String, Object>> empList) {
		
		System.out.println("empno\tename\tjob\tsal\tdeptno");
		
		for (Map<String, Object> map : empList) {
// 			EMPNO,  ENAME,  JOB,    SAL, DEPTNO
			String empno = (String) map.get("EMPNO");
			String ename = (String) map.get("ENAME");
			String job = (String) map.get("JOB");
			int sal = (int) map.get("SAL");
			int deptno = (int) map.get("DEPTNO");
			
			System.out.println(empno+"\t"+ename+"\t"+job+"\t"+sal+"\t"+deptno);
		}
		
	}

	
	
	// 3. 회원정보 중, 급여의 최솟값 구하기
	public int getMinSalary(List<Map<String, Object>> empList) {
		
//		int min = 0;
		// 다른 방법, 최솟값을 비교할 때 0을 넣는 것은 위험함, int의 최댓값
		// int의 최댓값을 넣어놓으면, if에서 sal에 최솟값을 넣을 때, 매번 초기화되기 때문에 사용함
		// empList에서 최솟값을 꺼내오기 번거로울 때 사용하면 좋음
		int min = Integer.MAX_VALUE;
		
		for (Map<String, Object> map : empList) {
			int sal = (int)map.get("SAL");
			if(min>sal) min = sal;
		}
		
		return min;
	}

	
	
	// 2. 회원정보 중, 급여의 최댓값 구하기
	public int getMaxSalary(List<Map<String, Object>> empList) {
		// 직원 중에 최대 월급을 찾아서 리턴하시오.

		int max = 0;

		for (Map<String, Object> map : empList) {
			// map 타입은 기본적으로 Object 타입임, 그래서 그냥쓰면 오류, 형 변환이 필요함
			int sal = (int) map.get("SAL");
			if (max < sal)
				max = sal;
		}

		return max;
	}

	
	
	// 1. DB 데이터를 [컬렉션]-List와 Map으로 넣어보기
	
	// 가로줄은 세트로 Map으로 한줄을 통째로 넣고 (1차원 배열)
	// 세로줄, 열을 만들기 위해 List에 넣음 (2차원 배열)
	// 사람 1명에 대한 정보 : Map,
	// 테이블 전체에 대한 타입 : List
	public List<Map<String, Object>> inputData() {
//		EMPNO,  ENAME,  JOB,    SAL, DEPTNO
//		7369	장길동	프로그래머	600	50
//		7499	고영우	시장조사	550	20
//		7521	구기현	영업사원	250	30
//		7566	김동혁	관리자	375	40
//		7654	김민욱	영업사원	350	30

		// 키 = 컬럼 이름 은 String을 사용
		// 값 = 값은 타입이 섞여있기 때문에 다양한 타입의 사용성을 위해 Object를 사용함
		
		// Object 타입은 int로 바로 형변환을 하는 것이 불가능함
		// Rapper 클래스로(Integer) 먼저 들어간 다음, int 타입으로 바뀌는 것임 (언박싱 과정) <=> 반대는 박싱
		
		// 실제로 Integer으로 값을 넣으려면
		// map1.put("EMPNO", new Integer(90));
		// 이런 식으로 넣어야함, 하지만  현재는 int형으로 값을 넣고, Integer로 다시 변환이 됨.
		// 사용의 편의성을 위해 IDE가 언박싱과 박싱 기능을 제공하는 것
		
		Map<String, Object> map1 = new HashMap();
		map1.put("EMPNO", "7369");
		map1.put("ENAME", "장길동");
		map1.put("JOB", "프로그래머");
		map1.put("SAL", 600);
		map1.put("DEPTNO", 50);

		Map<String, Object> map2 = new HashMap();
		map2.put("EMPNO", "7499");
		map2.put("ENAME", "고영우");
		map2.put("JOB", "시장조사");
		map2.put("SAL", 550);
		map2.put("DEPTNO", 20);

		Map<String, Object> map3 = new HashMap();
		map3.put("EMPNO", "7521");
		map3.put("ENAME", "구기현");
		map3.put("JOB", "영업사원");
		map3.put("SAL", 250);
		map3.put("DEPTNO", 30);

		Map<String, Object> map4 = new HashMap();
		map4.put("EMPNO", "7566");
		map4.put("ENAME", "김동혁");
		map4.put("JOB", "관리자");
		map4.put("SAL", 375);
		map4.put("DEPTNO", 40);

		Map<String, Object> map5 = new HashMap();
		map5.put("EMPNO", "7654");
		map5.put("ENAME", "김민욱");
		map5.put("JOB", "영업사원");
		map5.put("SAL", 350);
		map5.put("DEPTNO", 30);

		// List에 Map의 형식은 테이블을 넣을 것이기 때문에 타입은 Map으로 정의
		// DB 테이블을 담을 수 있는 형식이 완성됨
		List<Map<String, Object>> list = new ArrayList();
		list.add(map1);
		list.add(map2);
		list.add(map3);
		list.add(map4);
		list.add(map5);

		return list;
	}

	
	
}
