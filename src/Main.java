import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int dem=0;
        int snt=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap n");
        n= scanner.nextInt();
        for (int i=2;i<=n;i++){
           for (int j=1;j<=i;j++){
               if (i%j==0){
                   dem++;
               }
           }
            if (dem==2){
                System.out.println("cac so nguyen to nho hon n la: "+i);
                dem=0;
            }
            else{
                dem=0;
            }
        }
    }
}