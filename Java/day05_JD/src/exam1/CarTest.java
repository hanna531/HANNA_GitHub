package exam1;

public class CarTest {
	public static void main(String[] args) {
		Car c1 = new Car();		//�⺻������
		c1.setColor("White");	//setter/getter
		c1.setGearType("auto");
		c1.setDoor(4);
		
		Car c2 = new Car("Gray", "auto", 4);	//����
		
		System.out.println(c1.getColor() +c1.getGearType()+ c1.getDoor());
		System.out.println(c2.getColor() +c2.getGearType()+ c2.getDoor());
	}
}
