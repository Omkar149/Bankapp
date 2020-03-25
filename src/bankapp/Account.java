package bankapp;

public class Account {
	private int accno;
	private String custname;
	private int balance;

	public int getAccno() {
		return accno;
	}
	public String getCustname() {
		return custname;
	}
	public int getBalance() {
		return balance;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
/*	
	@Override
	public String toString() {
		return  getAccno() + "\t" + getCustname() + "\t" + getBalance() ;
	}
	
	*/
	

}
