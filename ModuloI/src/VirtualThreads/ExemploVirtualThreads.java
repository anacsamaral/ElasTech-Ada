package VirtualThreads;

import java.util.TreeMap;

public class ExemploVirtualThreads {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {

            Thread.ofVirtual().start(() -> { // define que é uma thread virtual
                try{
                    System.out.println("Executando Thread" + Thread.currentThread());
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }
}
