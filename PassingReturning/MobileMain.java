package PassingReturning;

public class MobileMain {
    public static void main(String[] args) {
        Mobile m1 = MobileShop.creatMobile();
        MobileShop.showMobileDetails(m1);
        System.out.println("________________");
         Mobile m2 = MobileShop.creatMobile();
        MobileShop.showMobileDetails(m2);
        System.out.println("________________");
    }
    
}
