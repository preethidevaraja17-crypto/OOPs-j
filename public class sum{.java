public class sum{
    public static void main(String args[]){
        int num =1234;
        int sum=0;
        sum=sum=num%10;
        num=num/10;
        sum=sum+num%10;
        num=num/10;
        sum=sum+num%10;
        num=num/10;
        sum=sum+num%10;
        System.out.println("Sum of digits: " + sum);
    }
}