import java.util.Scanner;
  
//currencyConverter

public class currencyConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking Input
        System.out.println("1) Rupee to Dollar");
        System.out.println();
        System.out.println("2) Dollar to Rupee");
        System.out.println();
        System.err.println("3) Rupee to Euro");
        System.out.println();
        System.out.println("4) Euro to Rupee");
        System.out.println();
        System.out.println("5) Dollar to Euro");
        System.out.println();
        System.out.println("6) Euro to Dollar");
        System.out.println();
        int exchange = sc.nextInt();
        
        // Using Switch case
        switch(exchange) {
            case 1 : {
                System.out.println("Please Enter the Number of Rupee");
                double rupee = sc.nextDouble();

                if(rupee>=0) {
                    System.out.println(rupee + " Rupee is " + (rupee*0.013) + " Dollar ");
                } else {
                    System.err.println("Please enter the Positive Numbers of Rupee");
                }
            }
            break;

            case 2 : {
                System.out.println("Please Enter the Number of Dollar");
                double dollar = sc.nextDouble();

                if(dollar>=0) {
                    System.out.println(dollar + " Dollar is " + (dollar*79.37) + " Rupee ");
                } else {
                    System.err.println("Please enter the Positive Numbers of Dollar");

                }
            }
            break;

            case 3 : {
                System.out.println("Please Enter the Number of Rupee");
                double rupees = sc.nextDouble();

                if(rupees>=0) {
                    System.out.println(rupees + " Rupees is " + (rupees*0.012) + " Euro ");
                } else {
                    System.err.println("Please enter the Positive Numbers of Euro");
                }
            }
            break;

            case 4 : {
                System.out.println("Please Enter the Number of Euro");
                double euro = sc.nextDouble();

                if(euro>=0) {
                    System.out.println(euro + " Rupees is " + (euro*80.85) + " Rupee ");
                } else {
                    System.err.println("Please enter the Positive Numbers of Rupee");
                }
            }
            break;

            case 5 : {
                System.out.println("Please Enter the Number of Dollar");
                double dollars = sc.nextDouble();

                if(dollars>=0) {
                    System.out.println(dollars + " Dollar is " + (dollars*0.908) + " Euro ");
                } else {
                    System.err.println("Please enter the Positive Numbers of Dollar");
                }
            }
            break;

            case 6 : {
                System.out.println("Please Enter the Number of Euro");
                double euros = sc.nextDouble();

                if(euros>=0) {
                    System.out.println(euros + " Euro is " + (euros*1.102) + " Dollar ");
                } else {
                    System.err.println("Please enter the Positive Numbers of Euro");
                }
            }


        }
        sc.close();
        
    }
    
}

    

