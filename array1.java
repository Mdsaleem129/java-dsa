import java.util.Scanner;
public class array1 {

    public static void update(int marks[] , int nonchangeable){
        nonchangeable=10;
     for(int i=0;i<marks.length;i++){
        marks[i]=marks[i]+1;
     }
    }
    public static void main(String[] args) {
    // Scanner sc=new Scanner (System.in);

    int marks[]={97,98,99};
    int nonchangeable = 5;

    update(marks,nonchangeable);
    System.out.println(nonchangeable);


    for(int i=0;i<marks.length;i++){
        System.out.println(marks[i]+"");
    }
   
   
      
    //    sc.close();
    }
}
