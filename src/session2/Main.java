package session2;

public class Main {
    public static void main(String args[]){
        HinhChuNhat hinhchunhat = new HinhChuNhat();
        hinhchunhat.NhapCacCanh();
        System.out.println("Chu vi: "+hinhchunhat.TinhChuVi());
        System.out.println("Dien tich: "+hinhchunhat.TinhDienTich());
    }
}
