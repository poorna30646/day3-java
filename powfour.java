class bitwise
{
    public static void main(String args[])
    {
        int a=16;
        if((a&(a-2))==0)
        {
            System.out.println("a is power of 4");
        }
        else
        {
            System.out.println("a is not power of 4");

        }
    }

}
