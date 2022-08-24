// Tao parent class
class PhuongTienDiLai{
    // xac dinh method cho parent class
    void run(){System.out.println("Phuong tien dang chay");}
}
// Tao child class
class XeMay extends PhuongTienDiLai{
    // khai bao method giong voi parent class
    void run(){System.out.println("Xe may dang chay");}
    public static void main(String[] args){
        XeMay yamaha = new XeMay();
        yamaha.run();
    }
}
