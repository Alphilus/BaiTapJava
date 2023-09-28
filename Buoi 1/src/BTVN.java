import java.util.Scanner;

public class BTVN {
    public static void main(String[] args){
        Scanner goods= new Scanner(System.in);  
        System.out.print("Mời bạn nhập tên hàng nhập kho: ");  
        String a= goods.nextLine();  
        System.out.print("Mời bạn nhập ngày tháng năm sinh (yyyy/MM/dd): ");  
        String b= goods.nextLine();  
        System.out.print("Mời bạn nhập thời gian nhập hàng (yyyy/MM/dd HH:mm:ss): ");  
        String c= goods.nextLine();  
        System.out.print("Mời bạn nhập thời gian (HH:mm:ss): ");  
        String d= goods.nextLine();  
        System.out.println("Tên hàng nhập kho: " +a);
        System.out.println("Ngày tháng năm sinh (yyyy/MM/dd): " +b);  
        System.out.println("Thời gian nhập hàng (yyyy/MM/dd HH:mm:ss): " +c);  
        System.out.println("Thời gian (HH:mm:ss): " +d);  
    }
}
