package day24_loops;

public class WhileCountReverse {
    public static void main(String[] args) throws InterruptedException {
        int count = 5;
        while (count >= 0){
            System.out.println(count);
            count--;
            //Thread.sleep(1000);
        }
        System.out.println("Finish count");


        int unreadSMS = 10;
        while (unreadSMS >  0){
            System.out.println("I have total unread - " + unreadSMS);
            unreadSMS--;
            //Thread.sleep(1000);
        }
        System.out.println("Read all massages");
    }
}
