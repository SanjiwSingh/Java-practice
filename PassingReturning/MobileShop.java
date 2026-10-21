package PassingReturning;

import java.util.Scanner;

public class MobileShop {
    static void showMobileDetails(Mobile m ){
        if(m != null){
            System.out.println("Mobile Brand name : "+m.brand);
            System.out.println("Mobile Price : "+m.price);
        }
    }
    static Mobile creatMobile(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Mobile Brand name : ");
        String brand = scn.nextLine();
        // scn.nextLine();
        System.out.println("Mobile Price : ");
        double price = scn.nextDouble();

        Mobile m = new Mobile(brand, price);
        return m;
    }
    
}
