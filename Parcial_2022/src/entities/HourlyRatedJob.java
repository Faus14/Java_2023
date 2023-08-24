package entities;

public class HourlyRatedJob  extends Job{

	  private Contratist contractor;

	    @Override
	    public double calculateBudget() {
	        return estimatedHours * contractor.getHourlyRate() + insuranceCost;
	    }

}
