package ex1;

public class Ex2_SubCar extends Ex3_SuperCar {
	public void carColor() {
		System.out.println("자식의 스포카: 황금색");
	}

	public void testsub() {
		System.out.println("자식 클래스의 메서드 호출!");
	}

	public static void main(String[] args) {
		// 부모를 참조 자료형으로 자식 클래스를 객체로 생성
		// 부모의 자원만 참조가 간으하고
		// 자식객체인 Ex3_SubCar() 자원은 참조가 불가능하다.
		Ex3_SuperCar ref = new Ex2_SubCar();
		System.out.println(ref instanceof Ex2_SubCar);
		ref.carColor(); // 자식의 메서드가 실행 (오버라이딩)
		ref.testSuper();
		// ref.testsub(); //--> 참조자료형이 부모클래스이기 때문에
		// 참조할 수 없다. (but 생성은 되었지만..)
	}
}