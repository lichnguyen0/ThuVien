package tinhchuvihinhchunhat;

public class HinhChuNhat {
    // cac thuoc tinh cua doi tuong hinh chu nhat
    private double chieudai;
    private double chieurong;

    //khơi tao ham contrustor
    public HinhChuNhat(double chieudai, double chieurong) {
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }


    //getter & setter

    public double getChieuDai() {
        return chieudai;
    }

    public void setChieuDai(double chieudai) {
        this.chieudai = chieudai;
    }

    public double getChieuRong() {
        return chieurong;
    }

    public void setChieuRong(double chieurong) {
        this.chieurong = chieurong;
    }

    // Tính diện tích
    public double tinhDienTich() {
        return chieudai * chieurong;
    }

    //Tinh chu vi
    public double tinhChuVi(){
        return 2* (chieudai +chieurong);
    }


    //hiển thị thông tin
    public void displayInfo(){
        System.out.println("Chieu dai: "+ chieudai);
        System.out.println("Chieu Rong: "+ chieurong);
        System.out.println("Tinh Chu Vi: "+tinhChuVi() );
        System.out.println("Tinh Dien Tich: "+ tinhDienTich());
    }


}
