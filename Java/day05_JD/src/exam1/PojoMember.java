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
				System.out.println("¥ﬁ∏∞¥Ÿ" + gas);
				gas -= 1;
			} else {
				System.out.println("∏ÿ√·¥Ÿ" + gas);
				return;
			}
		}
	}
	public static void main(String[] args) {
		PojoMember pm = new PojoMember();
		pm.run();
	}
		
}
