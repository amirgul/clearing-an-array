import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        int[] anArray = {0,1,3,2,3,0,3,1};
        remove(anArray, 3);


    }

    public static void remove(int[] anArray, int n)
    {
        int counter  = 0;
        Scanner keyboard = new Scanner(System.in);
        for(int i = 0; i<anArray.length; i++)
        {
            if(anArray[i] == n)
            {
                anArray[i] = 0;
            }
            else
            {
                anArray[counter] = anArray[i];
                counter++;
            }


        }
        for(int i = 0; i<counter; i++)
        {
            System.out.print(anArray[i]+ " ");
        }
    }
}
