import java.util.Scanner;
public class matrix {

    public static void max(int matrix[][]){
        int max=Integer.MIN_VALUE;
         for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]>max){
                    max=matrix[i][j];
                }
            }
        }
        System.out.println("largest number in array"+max);
    }
    public static boolean search(int matrix[][],int key){
         for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
               
                if(matrix[i][j]==key){
                    System.out.println("key fount at" +"("+ i + "," + j+")" ) ;
                    return true;
                }
            }
        }
        System.out.println("key not found");
        return false;

    }
    public static void main(String[] args) {
        int matrix[][]= new int[3][3];

        int n=matrix.length , m=matrix[0].length;
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]= sc.nextInt();
            }
        }
               
        int sum=0;
        int j;
       
         for(int i=0;i<n;i++){
            for( j=0;j<m;j++){
                 sum=sum+matrix[i][j];
                 System.out.print(matrix[i][j]);
                
                
            }
            System.out.println();
                        
        }
        System.out.println(sum);
      
        search(matrix, 5);
        max(matrix);
    }
}
