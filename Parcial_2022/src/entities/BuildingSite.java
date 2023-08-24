package entities;
import java.util.ArrayList;
public class BuildingSite {

int id ;
String address ;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

private ArrayList<Job> jobs;



public ArrayList<Job> getJobs() {
	return jobs;
}
public void setJobs(ArrayList<Job> jobs) {
	this.jobs = jobs;
}
public void addJob(Job job) {
    jobs.add(job);
}

public double getOverallBudget() {
    double overallBudget = 0;
    for (Job job : jobs) {
        overallBudget += job.calculoSubTotal();
    }
    return overallBudget;
}

}
