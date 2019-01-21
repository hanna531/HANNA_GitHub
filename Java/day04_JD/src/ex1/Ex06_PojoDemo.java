package ex1;
// 1. 순수한 값만을 가지는 객체
//분석 -> 설계(만들어지거나, 제작)
//2. 데이터베이스 설계시 엔티티로 바로 제작가능!
//젇ㅎㅇ욿 만들어지지만, 항상 손이 간다.
public class Ex06_PojoDemo {
	//회원의 정보를 저장
	private int num; //회원번호
	private String name,id;//회원의 정보들
	private boolean agree;//동의여부
	private int age;
	//setter/getter로 메서드를 제공한다.
	//alt + shift + s
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	//boolean은 is를 쓴다(get/set아님)
	public boolean isAgree() {
		return agree;
	}
	public void setAgree(boolean agree) {
		this.agree = agree;
	}
	//아까 단축키를 눌러 세터/게터 누르고 셀렉트 올을 눌러 자동생성 가능
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	//나이 추가
}
