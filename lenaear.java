import java.util.Scanner;

public class lenaear {
    public static int linear(int number[] , int key){
        for(int i=0; i<number.length;i++){
            if(number[i]==key){
                return i;
            }
        }
        return-1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int number[]={2,4,6,8,10,12,14,16};
        
        System.out.println("enter your key");
        int key=sc.nextInt();

         int index=linear(number,key);

        if(index==-1){
            System.out.println("not found");
        }
        else{
            System.out.println("found at index" + index);
        }
    }
}
