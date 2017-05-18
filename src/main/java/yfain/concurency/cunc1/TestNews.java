package yfain.concurency.cunc1;

public class TestNews {
    public static void main(String[] args) {
        MarketNews marketNews = new MarketNews();
        marketNews.run();
        DrugNews drugNews = new DrugNews();
        drugNews.run();
    }
}
