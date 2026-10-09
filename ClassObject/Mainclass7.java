package ClassObject;

public class Mainclass7 {
    public static void main(String[] args) {
        Message m1 = new Message();

        m1.sender = "Rahul";
        m1.receiver = "Amit";
        m1.text = "Hello Amit!";

        m1.sendMessage();
        m1.receiveMessage();
    }
    
}
class Message {
    String sender;
    String receiver;
    String text;

    void sendMessage() {
        System.out.println("Message sent successfully");
    }

    void receiveMessage() {
        System.out.println("Message received from " + sender);
        System.out.println("Message: " + text);
    }
}
