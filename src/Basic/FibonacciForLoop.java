//Program to print fibonacii series in java using for loop
package Basic;

public class FibonacciForLoop 
{
    public static void main(String[] args) 
	{
        int num1=0, num2=1,num3,i,count=10;
        System.out.println("1 = "+  num1+"\n"+"2 = "+num2);
        for(i=2;i<count;++i)
        {
            num3=num1+num2;
            System.out.println(i+1 +" =" +" "+num3);
            num1=num2;
            num2=num3;
        }
		
	}

    
}
