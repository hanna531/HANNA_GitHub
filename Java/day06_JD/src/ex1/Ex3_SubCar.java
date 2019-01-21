package ex1;
/*
 * 
 */
public class Ex3_SubCar extends Ex3_SuperCar{
	//	자식클래스에 메서드를 추가
	public void testsub() {
		System.out.println("자식 클래스의 메서드 호출!");
	}

	@Override	
	//	실행 가능한 주석
	public void carColor() {
		//	super 부모클래스의 주소!
		//	super.carColor();
		System.out.println("자식의 스포카: 황금색");
	}
	
	public static void main(String[] args) {
		Ex3_SubCar ref = new Ex3_SubCar();
		System.out.println(ref instanceof Ex3_SubCar);
		ref.carColor();
		ref.testSuper();
		//ref.testsub(); 참조 자료형이 부모클래스 이기 때문에 참조 할 수 없다. (but 생성은 되었지만.....)
	}
}
