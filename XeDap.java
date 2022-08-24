public class XeDap {
    void run(){System.out.println("xe dang chay...");}
}
class XeMay extends XeDap {
    void run() {
        System.out.println("xe dang chay voi van toc 50km/h");
    }

    public static void main(String[] args) {
        XeDap phuonghoang = new XeMay();
        phuonghoang.run();
    }
}
