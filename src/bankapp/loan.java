package bankapp;

public class loan {
private double sinterest=0.07;
private double cinterest=10;

public double getSinterest() {
	return sinterest;
}
public double getCinterest() {
	return cinterest;
}
public void setSinterest(double sinterest) {
	this.sinterest = sinterest;
}
public void setCinterest(double cinterest) {
	this.cinterest = cinterest;
}



public void cinterest()
{
	System.out.println("facility not available");
}

//@Override
//public String toString() {
//	return getPamount()+"\t"+getInterest()+"\t"+getTamount();
//}


}
