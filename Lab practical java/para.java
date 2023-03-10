class para
{
    int i;
    int j;
    para(int i, int j)
    {
         this.i=i;
         this.j=j;
    }
    void show()
    {
        System.out.println("value of i = "+i+" "+"value of j = " +j);
    }
}
class A
{
    public static void main(String[] args)
    {
        para ob1 = new para(2,3);
        para ob2 = new para(3,4);

        ob1.show();
        ob2.show();
    }
}