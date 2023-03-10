/*
1
22
333
4444
*/

public class loop1 {
    public static void main(String[] args)
    {
        int i,j;
        i=1;
        while(i<=4)
        {
            j=1;
            while(j<=i)
            {
                System.out.print(i);
                j++;
            }
                i++;
                System.out.println();
        }
    }
}
