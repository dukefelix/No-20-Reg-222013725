public class nestedloop {
public static void main(String[] aStrings){
    int in, out;

    for(in = 0; in < 8; in++)
    {
        for(out = 0; out < in; out++)
        System.out.print("(@)");
        System.out.println();
    }

    }
}
