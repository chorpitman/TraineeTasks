package yfain.concurency.cunc2;

public class TestNews1 {
    public static void main(String[] args) {
        MarketNews1 marketNews = new MarketNews1();
        Thread thread = new Thread(marketNews, "FirstNAh");
        thread.run();

        DrugNews1 drugNews1 = new DrugNews1();
        Thread thread1 = new Thread(drugNews1, "Second Nah");
        thread1.run();

        System.out.println("Main1 is finished");
    }
}
