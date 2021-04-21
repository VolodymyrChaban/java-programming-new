package day24_loops;

public class YouTubeVideo {
    public static void main(String[] args) throws InterruptedException {
        int second = 0;

        while (second <= 117){
            second++;
            System.out.println("Watching YouTube video: " + second + " second");
            Thread.sleep(1000);
        }
        System.out.println("Finish");

    }
}
