public class fileforswitch {
    public static void main(String args[])
    {
        
        int marks = 50;

        switch(marks){
            case 50:
                System.out.println("Great work");
                break;
            case 80:
                System.out.println("Well done");
                break;
            case 90:
                System.out.println("You did great");
                break;
            case 100:
                System.out.println("All good");
                break;
            default:
                System.out.println("Not marks meet the requirement");
        }

    }
}