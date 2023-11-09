public class assignment
 {
    public static void main(String args[]) {
        int grades = 60;

        switch (grades) {
            case 80:
                System.out.println("Excellent!");
                break;
            case 60:
                System.out.println("Great!");
                break;
            case 50:
                System.out.println("Good!");
                break;
            case 40:
                System.out.println("Not bad!");
                break;
            case 20:
                System.out.println("Bad!");
                break;
            default:
                System.out.println("To bad");
                break;
        }
    }
}