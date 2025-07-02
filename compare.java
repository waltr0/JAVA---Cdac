public class compare{
	public static void main(String args[]){
        int a=5;
        int b=3;
        int c=1;
        if (a>=b && a>=c){
            System.out.println("Biggest number:"+a);
        }
        else if(b>=a && b>=c){
            System.out.println("Biggest number:"+b);
        } 
        else{
            System.out.println("Biggest number:"+c);
        }
    }
}