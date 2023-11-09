public class work
{
    public static void main(String args[])
    {
        int number = 800;

        if(number < 1000)
            System.out.println("Number is less than 1000");
        else if(number == 1000)
            System.out.println("Number is equal to 1000");
        else if(number > 500 && number > 1000)
            System.out.println("Number is closs to 1000");
        else if(number < 500 && number > 1000)
            System.out.println("Number is not closs to 1000");
    }
}
