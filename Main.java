import java.util.Scanner;

public class Main {
    //quiz on methods

    public static void main(String[] args) {
	// write your code here
        Scanner c= new Scanner(System.in);
        int miny= 1440*365;
        int mintimeshour=24*60;
        int min= 60;
        double moontrammel= 9;
        double moonfelluca=14;


        System.out.println("enter world time");
        double next= c.nextDouble();

        int totyear= (int)(next/miny)+1;

        double remainder= (int)next%miny;

        int day= (int) (remainder/mintimeshour)+1;

        int days= (int) (next/1440);

        double reaminder2= (int)(remainder%mintimeshour);

        int hour = (int)reaminder2/min;

        int minutes= (int)reaminder2%60;

        int moon1= (int) (days%moontrammel)+1;

        int moon2= (int)(days%moonfelluca)+1;


        System.out.println("it is "+ hour +":"+minutes+" on day "+day+" of the year "+ totyear);
        System.out.println("trammel is in day " + moon1 + " of its 9 day phase.");
        System.out.println("felluca is in day " + moon2 + " of its 14 day phase");

        System.out.println("enter world time");
        double Anext= c.nextDouble();

        int Atotyear= (int)(Anext/miny)+1;

        double Aremainder= (int)Anext%miny;

        int Aday= (int) (Aremainder/mintimeshour)+1;

        int Adays= (int) (Anext/1440);

        double Areaminder2= (int)(Aremainder%mintimeshour);

        int Ahour = (int)Areaminder2/min;

        int Aminutes= (int)Areaminder2%60;


        int Amoon1= (int) (Adays%moontrammel)+1;

        int Amoon2= (int)(Adays%moonfelluca)+1;


        System.out.println("it is "+ Ahour +":"+Aminutes+" on day "+Aday+" of the year "+ Atotyear);
        System.out.println("trammel is in day " + Amoon1 + " of its 9 day phase.");
        System.out.println("felluca is in day " + Amoon2 + " of its 14 day phase");

        System.out.println("enter world time");
        double Bnext= c.nextDouble();

        int Btotyear= (int)(Bnext/miny)+1;

        double Bremainder= (int)Bnext%miny;

        int Bday= (int) (Bremainder/mintimeshour)+1;

        int Bdays= (int) (Bnext/1440);

        double Breaminder2= (int)(Bremainder%mintimeshour);

        int Bhour = (int)Breaminder2/min;

        int Bminutes= (int)Breaminder2%60;



        int Bmoon1= (int) (Bdays%moontrammel)+1;

        int Bmoon2= (int)(Bdays%moonfelluca)+1;


        System.out.println("it is "+ Bhour +":"+Bminutes+" on day "+Bday+" of the year "+ Btotyear);
        System.out.println("trammel is in day " + Bmoon1 + " of its 9 day phase.");
        System.out.println("felluca is in day " + Bmoon2 + " of its 14 day phase");
    }
}
