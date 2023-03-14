package BT1;

import java.time.Year;
import java.util.Scanner;

public class tinh_can_chi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tuổi của người dùng: ");


        String[] can = {"Canh", "Tân", "Nhâm", "Quý", "Giáp", "Ất", "Bính", "Đinh", "Mậu", "Kỷ"};
        String[] chi = {"Thân", "Dậu", "Tuất", "Hợi", "Tý", "Sửu", "Dần", "Mão", "Thìn", "Tị", "Ngọ", "Mùi"};

        int inputAge = scanner.nextInt();
        int thisYear = Year.now().getValue();
        int birtYear = thisYear - inputAge;

        String can1 = can[birtYear % 10];
        String chi1 = chi[birtYear % 12];
        System.out.println("Can Chi cua nguoi dung la: " + can1 + " " + chi1);
    }

}



