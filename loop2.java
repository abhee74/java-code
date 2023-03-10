/*
   1
  21
 321
4321
*/

public class loop2 {
    public static void main(String[] args)
    {
        int i,j,s;
        for(i=1;i<=4;i++)
        {
            for(s=4;s>i;s--)
            System.out.print(" ");
            for(j=i;j>=1;j--)
            System.out.print(j);
            System.out.println();
        }
    }
}
