import java.util.Scanner;

class Main 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int [] num = new int[100];
        for(int i=0;i<100;i++)
        {
            num[i]=i;
        }
        try 
        {
            int n = sc.nextInt();
            System.out.println("The corresponding element value is "+ num[n]);
        } 
        catch(ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Out of Bounds.");
        }
    }
}