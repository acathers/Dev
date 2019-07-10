package app;

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
       Hourly fred = new Hourly("Fred", 75, 11.50);
       Salaried george = new Salaried("George", 40000);

       System.out.println(fred.calculatePay());
       System.out.println(george.calculatePay());

       Payable otherFred = new Hourly("Fred", 75, 11.50); // polymorphism
       Employee otherGeorge = new Salaried("George", 40000); 

       System.out.println(otherFred.calculatePay());
       System.out.println(otherGeorge.calculatePay());

       System.out.println(fred.getName());

       Payable[] payablePeople = new Payable[6]; 

       payablePeople[0] = fred;
       payablePeople[1] = george;
       payablePeople[2] = otherFred;
       payablePeople[3] = otherGeorge;
       payablePeople[4] = new Contractor("Microsoft", 4000);
       Contractor nvidia = new Contractor("NVidia", 8000);
       nvidia.setJobDone(true);
       payablePeople[5] = nvidia;
    
       System.out.println("-----in array----");
       for(Payable payable: payablePeople){ // int i = 0; i < payable.length; i++)
           System.out.println(payable.calculatePay());
       }

    
       

        



       


    }
}