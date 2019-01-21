package exam1;

public class DogDemoMain {

	public static void main(String[] args) {
		DogDemo dog = new DogDemo();
		dog.dname = "dust";
		dog.dage = 3;
		
		System.out.println("강아지 이름은: " + dog.dname);
		System.out.println("강아지 나이는: " + dog.dage);

		System.out.println(dog.Calculator(10, 20));
	}

}
