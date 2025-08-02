package racingcars;

import java.util.Random;

public class Car implements Runnable {
    private static final int DISTANCE = 100; // Quãng đường cần đua (KM)
    private static final int STEP = 1;       // Bước chia đường đua để vẽ tiến trình

    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        int runDistance = 0;
        long startTime = System.currentTimeMillis();

        while (runDistance < DISTANCE) {
            try {
                // Tạo tốc độ ngẫu nhiên mỗi giây
                int speed = (new Random()).nextInt(20); // Tốc độ ngẫu nhiên từ 0 đến 19
                runDistance += speed;

                // Vẽ đường đua
                String log = "|";
                int percentTravel = (runDistance * 100) / DISTANCE;
                for (int i = 0; i < 100; i += STEP) {
                    if (percentTravel >= i + STEP) {
                        log += "=";
                    } else if (percentTravel >= i && percentTravel < i + STEP) {
                        log += "o";
                    } else {
                        log += "-";
                    }
                }
                log += "|";

                // In thông tin tiến độ
                System.out.println("Car " + this.name + ": " + log + " " + Math.min(DISTANCE, runDistance) + "KM");

                // Nghỉ 1 giây
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Car " + this.name + " bị hỏng...");
                break;
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Car " + this.name + " về đích sau " + (endTime - startTime) / 1000 + " giây.");
    }
}
