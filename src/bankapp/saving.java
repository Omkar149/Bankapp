package bankapp;

public class saving extends Account {
	private int limit;
	

	public void setLimit(int limit) {
		this.limit = limit;
	}

	

	public int getLimit() {
		return limit;
	
		

	}
	


	@Override
	public String toString() {
		return  getAccno() + "\t" + getCustname() + "\t" + getBalance() +"\t" +getLimit()+"\t";
	}
	

}
