package entities;

public class HourlyRatedJob  extends Job{

	  private Contratist contractor;

	    @Override
	    public double calculoSubTotal() {
	        return estimatedHours * contractor.getHourlyRate() + insuranceCost;
	    }

}
