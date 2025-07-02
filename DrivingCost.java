package ass4;
import java.util.Scanner;
public class DrivingCost {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("km driven:");
        double kmPerDay=input.nextDouble();
        System.out.print("cost of cng/ltr:");
        double costPerLiter=input.nextDouble();
        System.out.print("avg of km/l:");
        double kmPerLiter=input.nextDouble();
        System.out.print("add parking fee:");
        double parkingFees=input.nextDouble();
        System.out.print("add toll:");
        double tolls = input.nextDouble();
        double fuelUsed=kmPerDay/kmPerLiter;
        double fuelCost=fuelUsed*costPerLiter;
        double totalCost=fuelCost+parkingFees+tolls;
        System.out.printf("total daily driving cost is: ₹%.2f%n",totalCost);
        int carpoolMembers=4;
        double costPerPerson=totalCost/carpoolMembers;
        System.out.printf("car with %d people will be:₹%.2f%n",carpoolMembers,costPerPerson);
        input.close();
    }
}