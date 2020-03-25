package bankapp;

public class current extends Account {
	private String companyname;



	public String getCompanyname() {
		return companyname;
	}

	
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}


	@Override
	public String toString() {
		System.out.println("hiiiiiiiiiiiii");
		return  getAccno() + "\t" + getCustname() + "\t" + getBalance() + "\t" + getCompanyname();
		}

	
	

}
