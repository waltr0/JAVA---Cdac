
public class Fabonacci{
	public static void main(String args[]){
        int x=0,y=1,z;
        System.out.print(x+" "+y+" ");
        for (int i=0;i<10;i++){
            z=x+y;
            System.out.print(z+" ");
            x=y;
            y=z;
        }
    }
}