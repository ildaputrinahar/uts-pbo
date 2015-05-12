/**
 * Created by i on 5/12/2015.
 */

public class TestKomputer {
    public static void main(String[] args) {
        notebook asus = new Notebook(3500, 4000, 80000, 7000);
        asus.CetakSpesifikasi();
        asus.diOverclock(3000);
        asus.diOverclock(3200);
    }
}


