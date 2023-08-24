package entities;

public class FixedPriceJob extends Job {

	double agreedBudget;

	public double getAgreedBudget() {
		return agreedBudget;
	}

	public void setAgreedBudget(double agreedBudget) {
		this.agreedBudget = agreedBudget;
	}
	
	public double calculoSubTotal () {
        return agreedBudget + insuranceCost;
    }
}
