package yfain.concurency.cunc3;

public class TestNews2 {
    public static void main(String[] args) {
        MarketNews2 marketNews = new MarketNews2("MarketThread");
        DrugNews2 drugNews1 = new DrugNews2("DrugThread");
        drugNews1.start();
        marketNews.start();
        System.out.println("Main1 is finished");
    }
}
