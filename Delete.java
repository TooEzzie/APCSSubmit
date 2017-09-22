import java.util.*;

public class Delete
{
    public static void main(String[] args)
    {
        System.out.println("input stuff");
        Scanner dingus = new Scanner(System.in);
        int index = dingus.nextInt();
        dingus.nextLine();
        int[] Array1 = {1, 2, 3, 4};
        int[] Array2 = new int[Array1.length - 1];
        int count = 0;
        for(int i = 0; i < Array2.length; i++)
        {
            if (i != index)
            {
                Array2[count] = Array1[i];
                count++;
            }
        }
        System.out.println("Old " + Arrays.toString(Array1));
        System.out.println("New " + Arrays.toString(Array2));
    }
}