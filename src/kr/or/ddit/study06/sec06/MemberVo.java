package kr.or.ddit.study06.sec06;

public class MemberVo {
	// static 변수
	static int year;
	private String id;
	private String pass;
	private String name;
	
	
	
	
	
	// 생성자 만들기 단축키 Alt+Shift+S 밑에서 2번째꺼
	public MemberVo(String id, String pass, String name) {
		super();
		this.id = id;
		this.pass = pass;
		this.name = name;
	}

	
	
	
	// toString
	@Override
	public String toString() {
		return "MemberVo [id=" + id + ", pass=" + pass + ", name=" + name + "]";
	}




	// getter, setter 메서드
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
