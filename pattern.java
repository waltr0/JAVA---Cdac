public class Pattern{
    public static void main(String args[]){
        int i,j;
        int rows=5;
        for (i=0;i<rows;i++){
            for(j=0;j<rows-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<(2*i+1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}