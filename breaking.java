public class breaking 
{
    public static void main(String args[])
    {
        int forbreak;

        for (forbreak = 10; forbreak >= 0; forbreak--)
        {
            if(forbreak == 5) break;
            System.out.println(forbreak);
        }
    }
}