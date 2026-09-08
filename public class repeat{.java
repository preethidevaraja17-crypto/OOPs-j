public class repeat{
    public static void main (String args[]){
        int num=21;
        while(num!=1){
            System.out.println(num);
            if(num%2==0){
                num=num/2;
            }else{
                num=(3*num)+1;
            }
        }
        System.out.println(num);
    }
}