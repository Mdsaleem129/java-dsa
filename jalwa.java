public class jalwa {
    public static void bubble(int arr[]){
        for(int i=0;i<=arr.length;i++){
            for(int j=0;j<=arr.length-2;j++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;

            }
        }

        }
    }

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        bubble(arr);
        print(arr);
    }
}
