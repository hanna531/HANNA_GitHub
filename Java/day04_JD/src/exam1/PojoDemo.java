package exam1;

public class PojoDemo {

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPwd() {
		return pwd;
	}
	public void setPwd(int pwd) {
		this.pwd = pwd;
	}
	public int getChg() {
		return chg;
	}
	public void setChg(int chg) {
		this.chg = chg;
	}

	public boolean isOpt() {
		return opt;
	}
	public void setOpt(boolean opt) {
		this.opt = opt;
	}

	private int id; //���¹�ȣ
	private int pwd; //��й�ȣ
	private int chg; //�ܾ�
	private boolean opt; //�����(�Ա�1: ���2)
}
