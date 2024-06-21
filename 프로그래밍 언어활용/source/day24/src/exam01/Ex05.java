package exam01;

import java.util.TreeSet;

public class Ex05 {
    private static boolean autosave = false;
    public static void main(String[] args) {
        Thread th = new Thread(() -> {
           while (true) {
               if(autosave) {
                   System.out.println("저장!");
               }

               try {
                   Thread.sleep(3000); //3초
               } catch (InterruptedException e) {}

           }
        });
th.setDaemon(true); // 현재 작업중인 쓰레드 (메인) 가 종료되면 th 도 함께 종료
        th.start();

        for (int i = 1; i <= 10; i++){
            Thread th2 = Thread.currentThread();
            System.out.println(th2.getName()+"-" + i);

            try {
                Thread.sleep(1000);
            }catch (InterruptedException e) {}

            if (i == 3) autosave = true;
        }

    }
}
