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

	private int id; //계좌번호
	private int pwd; //비밀번호
	private int chg; //잔액
	private boolean opt; //입출금(입금1: 출금2)
}
