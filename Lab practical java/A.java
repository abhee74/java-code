class A
{
    int i=2;
    int j=3;
    void getData(int i, int j)
    {
         this.i=i;
         this.j=j;
    }
    void show()
    {
        System.out.println("value of i = "+i+" "+"value of j = " +j);
    }
}
class Test
{
    public static void main(String[] args)
    {
        A ob1 = new A();
        A ob2 = new A();

        ob1.show();
        ob2.show();
    }
}