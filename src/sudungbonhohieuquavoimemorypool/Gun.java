package sudungbonhohieuquavoimemorypool;

import java.util.ArrayList;
import java.util.List;

public class Gun {
    private int bulletCount = 1000;

    // Bắn dùng MemoryPool để tái sử dụng đạn
    public void fireInPool() {
        BulletPool pool = new BulletPool();
        List<Bullet> plist = new ArrayList<>();

        for (int i = 0; i < bulletCount; i++) {
            Bullet p = pool.newItem();
            p.setPosition(0);
            plist.add(p);

            // Di chuyển tất cả viên đạn đang bay
            for (int j = 0; j < plist.size(); j++) {
                Bullet pp = plist.get(j);
                pp.move();
                System.out.print("-" + pp.getPosition());

                // Khi viên đạn đến vị trí 10 thì trả về pool và loại khỏi danh sách
                if (pp.getPosition() == 10) {
                    pool.freeItem(pp);
                    plist.remove(pp);
                    j--; // giảm j vì đã remove phần tử
                }
            }
            System.out.println();
        }
    }

    // Bắn không dùng Pool, tạo viên đạn mới mỗi lần bắn
    public void fire() {
        List<Bullet> plist = new ArrayList<>();

        for (int i = 0; i < bulletCount; i++) {
            Bullet p = new Bullet();
            p.setPosition(0);
            plist.add(p);

            for (int j = 0; j < plist.size(); j++) {
                Bullet pp = plist.get(j);
                pp.move();
                System.out.print("-" + pp.getPosition());

                if (pp.getPosition() == 10) {
                    plist.remove(pp);
                    j--;
                }
            }
            System.out.println();
        }
    }
}
