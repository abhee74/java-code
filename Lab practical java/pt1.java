/*
123456789
1234 6789
123   789
12     89
1       1

*/
public class pt1 
{
    public static void main(String[] args)
    {
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=9;j++)
            {
                if(j>=1 && j<=6-i)||(j>=4+i && j<=9)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }    
}
