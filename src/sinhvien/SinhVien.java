package sinhvien;

public class SinhVien {
    // thuộc tính các thuộc tính của đối tượng sinh viên (private - đóng gói)
    private String id;
    private String hoten;
    private int tuoi;
    private String lop;

    //hàm khởi tạo contrustor
 public SinhVien(String id, String hoten, int tuoi, String lop) {
     this.id = id;
     this.hoten = hoten;
     this.tuoi = tuoi;
     this.lop = lop;
 }

 //Getter
    public String getID(){
     return id;
    }
    public String getHoTen(){
     return hoten;
    }

    public int getTuoi(){
     return tuoi;
    }

    public String getLop(){
     return lop;
    }

    //setter
    public void setID(String id){
     this.id = id;
    }
    public void setHoTen(String hoten){
     this.hoten = hoten;
    }

    public void setTuoi(int tuoi){
     this.tuoi = tuoi;
    }

    public void setLop(String lop){
     this.lop = lop;
    }

 //phuong thức hiển thị thông tin
    public void displayInfo(){
        System.out.println("Id: "+id);
        System.out.println("Họ Tên: "+hoten);
        System.out.println("Tuổi: "+tuoi);
        System.out.println("Lớp: "+lop);

    }

}
