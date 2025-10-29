import java.util.Scanner;
public class largest {
    public static int largest(int number[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;

        for(int i=0;i<number.length;i++){
            if(largest<number[i]){
                largest=number[i];
            }
            if(smallest>number[i]){
                smallest=number[i];
            }
        }
        
        System.out.println(smallest);

        return largest;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int number[]={1,2,3,4,5,};

        int largest=largest(number);
        

        System.out.println(largest);
        
        
    }
}
