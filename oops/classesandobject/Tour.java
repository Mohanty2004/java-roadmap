public class Tour {
    public static void main(String args[]) {
        Tour tour = new Tour();
        tour.EnterTour();
        tour.ShowTour();
    }

    String TCode;
    int NoofAdults;
    int NoofKids;
    int Kilometers;
    float TotalFare;

    Tour() {
        TCode = null;
        NoofAdults = 0;
        NoofKids = 0;
        Kilometers = 0;
        TotalFare = 0.0f;
    }

    void AssignFare() {
        if (Kilometers >= 1000) {
            TotalFare = NoofAdults * 500 + NoofKids * 250;
        }
        if (Kilometers >= 500 && Kilometers < 1000) {
            TotalFare = NoofAdults * 300 + NoofKids * 150;
        }
        if (Kilometers < 500) {
            TotalFare = NoofAdults * 200 + NoofKids * 100;
        }
    }

    void EnterTour() {

        System.out.println("Enter Travel Code : ");
        TCode = System.console().readLine();
        System.out.println("Enter Number of Adults : ");
        NoofAdults = Integer.parseInt(System.console().readLine());
        System.out.println("Enter Number of Kids : ");
        NoofKids = Integer.parseInt(System.console().readLine());
        System.out.println("Enter Distance in Kilometers : ");
        Kilometers = Integer.parseInt(System.console().readLine());
        AssignFare();
    }

    void ShowTour() {
        System.out.println("Travel Code   : " + TCode);
        System.out.println("No of Adults  : " + NoofAdults);
        System.out.println("No of Kids    : " + NoofKids);
        System.out.println("Dist in Kms   : " + Kilometers);
        System.out.println("Total Fare    : " + TotalFare);
    }

}
