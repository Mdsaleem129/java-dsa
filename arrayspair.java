public class arrayspair {
    public static void pair(int number[]){
        for(int i=0;i<number.length;i++){
            int pair=number[i];
            for(int j=i+1; j<number.length ;j++){
                System.out.print("(" + pair + "," + number[j] + ")");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {git
        int number[]={1,-2,6,-1,3};
        

        pair(number);

    }
}
