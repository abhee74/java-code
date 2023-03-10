/*
4444
333
22
1
*/

public class loop {
    public static void main(String[] args)
    {
        int i,j;
        i=4;
        while(i>=1)
        {
            j=1;
            while(j<=i)
            {
                System.out.print(i);
                j++;
            }
                i--;
                System.out.println();
        }
    }
}
