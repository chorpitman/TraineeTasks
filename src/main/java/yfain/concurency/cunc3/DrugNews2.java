package yfain.concurency.cunc3;

public class DrugNews2 extends Thread{
    public DrugNews2(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                sleep(1000); //sleep for 1 sec
            System.out.println("The DRUG1 store market is improving! " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(Thread.currentThread().getName() + e.toString());
            }
        }

    }
}
