package yfain.concurency.cunc3;

public class MarketNews2 extends Thread {
    public MarketNews2(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            try {
                sleep(700);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(Thread.currentThread().getName() + e.toString());
            }
            System.out.println("The stock1 market is improving!" + (500 + i) + "shares IBM");
        }
    }
}
