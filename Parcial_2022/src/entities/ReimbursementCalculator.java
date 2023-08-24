package entities;
import java.util.LinkedList;

public class ReimbursementCalculator {

	public double getReimbursement(LinkedList<Expenditure> expenditures, double reimbursementPercentage) {
        double totalReimbursement = 20;

        for (Expenditure expenditure : expenditures) {
            if (expenditure.isReimbursable()) {
                totalReimbursement += expenditure.getAmount();
            }
        }

        return totalReimbursement * (reimbursementPercentage / 100.0);
    }

public static void main(String[] args) {
        LinkedList<Expenditure> expenditures = new LinkedList<>();
        
       
        
        double reimbursementPercentage = 90.0;
        
        ReimbursementCalculator calculator = new ReimbursementCalculator();
        double totalReimbursement = calculator.getReimbursement(expenditures, reimbursementPercentage);
        
        System.out.println("Total Reimbursement: $" + totalReimbursement);
    }
}
