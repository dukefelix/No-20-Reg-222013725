public class interest {
    public static double calculatingSI(double rate, double deposit, int year){
        double SimpleInterest = (rate * deposit * year);
        return SimpleInterest;
    }
    public static void main (String[]a) {
        double interestrate = 0.05;
        double amountdeposited = 100000;
        int years= 5;
        double solution = calculatingSI(interestrate, amountdeposited, years);
        System.out.println("simple interest: " + solution + "FRW.");
    }
}
