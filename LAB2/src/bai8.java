import java.util.Scanner;
 public class bai8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        double sum = 0;
        do{
        System.out.print("Nhap so phan tu cua day: n = ");
        n = scanner.nextInt();
        }while(n<0);
        double A[] = new double[n];
        System.out.print("Nhap cac phan tu cua mang: \n");
        for(int i=0; i<n; i++){
          System.out.print("Nhap phan tu thu "+i +": ");
          A[i] = scanner.nextDouble();
        }   
        for(int i=0; i<n; i++){
           sum += A[i];
        }
        double trungbinhcong = sum / n ;
    
        System.out.format("Trung binh cong cua "+n+" so nguyen da nhap = %.2f", trungbinhcong);
    }
 }
