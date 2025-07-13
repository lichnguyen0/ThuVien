package quanlysach;

public class Sach {
    //cac thuoc tinh cua doi tuong sach
    String masach;
    String tensach;
    String tentacgia;
    double giaban;

    // khoi tao ham contrustor
    public Sach(String masach, String tensach, String tentacgia, double giaban) {
        this.masach = masach;
        this.tensach = tensach;
        this.tentacgia = tentacgia;
        this.giaban = giaban;
    }

    // getter & setter
    public String getMasach() {
        return masach;
    }
    public void setMasach(String masach) {
        this.masach = masach;
    }

    public String getTensach() {
        return tensach;
    }
    public void setTensach(String tensach) {
        this.tensach = tensach;
    }
    public String getTentacgia() {
        return tentacgia;
    }
    public void setTentacgia(String tentacgia) {
        this.tentacgia = tentacgia;
    }

    public double getGiaban() {
        return giaban;
    }
    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }


    public void displayInfo(){
        System.out.println("Mã Sách: "+masach);
        System.out.println("Tên sách: "+tensach);
        System.out.println("Tên tác giả - "+tentacgia);
        System.out.println("Giá bán: "+ giaban);

    }



}


