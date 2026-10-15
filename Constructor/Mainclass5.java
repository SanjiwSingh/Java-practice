package Constructor;

public class Mainclass5 {
  public static void main(String[] args) {
    Container c1 = new Container(100);
    System.out.println(c1.capacity);
     Container c2 = new Container(700);
    System.out.println(c2.capacity);
     Container c3 = new Container(900);
    System.out.println(c3.capacity);

    }
}

// ? PARAMETRIZED CONSTRUCTOR

class Container {
    int capacity ;
    Container(int arg){
        capacity = arg;
    }
}
