package yfain.concurency.cunc1;

public class MarketNews extends Thread {
    @Override
    public void run() {
        System.out.println("The stock market is improving!");
    }
}
