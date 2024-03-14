import java.util.Scanner;
public class slide16chuong3 {
    class hinhTron{
        final float PI = 3.14f;
        float r;
        float cv;
        float dt;
        void nhapBanKinh() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ban kinh hinh tron = ");
            r = sc.nextFloat();
            sc.close();
        }
        void tinhChuVi() {
            cv = 2*PI*r;
        }
        void tinhDienTich() {
            dt = PI*r*r;
        }
        void inChuVi() {
            System.out.println("Chu vi hinh tron la: " + cv);
        }
        void inDienTich() {
            System.out.println("Dien tich hinh tron la: " + dt);
        }
    }
    public static void main(String[] args) {
        hinhTron abc = new slide16chuong3().new hinhTron();
        abc.nhapBanKinh();
        abc.tinhChuVi();
        abc.tinhDienTich();
        abc.inChuVi();
        abc.inDienTich();
    }
}