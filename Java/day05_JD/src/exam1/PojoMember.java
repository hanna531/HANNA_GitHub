package exam1;

public class PojoMember {
	
	int gas = 5;
	
	public int getGas() {
		return gas;
	}
	public void setGas(int gas) {
		this.gas = gas;
	}
	void run() {
		while(true) {
			if (gas > 0) {
				System.out.println("�޸���" + gas);
				gas -= 1;
			} else {
				System.out.println("�����" + gas);
				return;
			}
		}
	}
	public static void main(String[] args) {
		PojoMember pm = new PojoMember();
		pm.run();
	}
		
}
