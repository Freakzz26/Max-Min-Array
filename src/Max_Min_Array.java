import java.util.Scanner;
class Check
{
    void max_min(int array[] , int n)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(array[i]>max)
            {
                max=array[i];
            }
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(array[i]<min)
            {
                min=array[i];
            }
        }
        System.out.println("ADD: "+Math.abs(max+min));


    }
}
public class Max_Min_Array {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n=scanner.nextInt();
        int array[]=new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++)
        {
            array[i]= scanner.nextInt();
        }
        Check check=new Check();
        check.max_min(array,n);

    }
}
