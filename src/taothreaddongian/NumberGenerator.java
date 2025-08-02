package taothreaddongian;

public class NumberGenerator implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread: " + Thread.currentThread().getName()
                    + " | hashCode: " + this.hashCode()
                    + " | Number: " + i);
            try {
                Thread.sleep(500); // nghỉ 500ms mỗi lần in
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

