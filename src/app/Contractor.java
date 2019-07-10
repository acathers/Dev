package app;

public class Contractor implements Payable{

    private String companyName;
    private double fee;
    boolean jobDone = false;

    public Contractor(String companyName, double fee){
        this.companyName = companyName;
        this.fee = fee;
    }

    

    public double calculatePay(){
        if(jobDone){
            return fee;
        }
        return 0;
    }

    public boolean isJobDone() { // boolean if job is done
        return jobDone;
    }

    public void setJobDone(boolean jobDone) {
        this.jobDone = jobDone;
    }


}