import java.util.*;

public class Update
{
    public static void main (String[] args)
    {
        System.out.println("Index and Value");
        Scanner dingus = new Scanner(System.in);
        int index = dingus.nextInt();
        int value = dingus.nextInt();
        dingus.nextLine();
        int[] Array1 = {1, 2, 3, 4};
        System.out.println("Old " + Arrays.toString(Array1));
        Array1[index] = value;
        System.out.println("New " + Arrays.toString(Array1));
    }
}