package day30_arrays;

import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;

public class ArrayLoopWithConditions {
    public static void main(String[] args) {
        double[] prices = {22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};

        String[] countries = {"Brazil",
                "China",
                "Cuba",
                "Sweden",
                "France",
                "Vietnam",
                "Albania",
                "Brazil",
                "Portugal",
                "China",
                "Philippines",
                "Philippines",
                "China",
                "Philippines",
                "China",
                "Armenia",
                "Philippines",
                "China",
                "Colombia",
                "Philippines",
                "Honduras",
                "Indonesia",
                "Brazil",
                "China",
                "United States",
                "Russia"};
        System.out.println("---prices less than 100---");
        for (double each : prices ){
            if (each > 100.0){
                System.out.print(each + " ");
            }
        }
        System.out.println("\n---- prices between 10 and 70 incl---");
        for (double price : prices){
            if (price >= 10 && price <= 70){
                System.out.print(price + " ");
            }
        }

        System.out.println("\n------count the prices that are more than 50");


        int count = 0;
        for (double each : prices){
            if (each > 50 ){
                count++;

            }
        }
        System.out.println("count = " + count );

        System.out.println("\n----- countries with names length more then 7 - inclisive -----");
        for (String country : countries)

        if (country.length() >= 7){
            System.out.print(country+ " " + country.length() + " ");
        }



    }
}
