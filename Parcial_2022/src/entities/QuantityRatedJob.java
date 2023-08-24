package entities;

public class QuantityRatedJob extends Job {

double quantity;

public double getQuantity() {
	return quantity;
}

public void setQuantity(double quantity) {
	this.quantity = quantity;
}


private WorkType workType;

@Override
public double calculateBudget() {
    return quantity * workType.getQuantityRate() + insuranceCost;
}


}
