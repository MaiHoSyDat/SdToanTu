import java.util.Scanner;

public class SdToanTu {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập width");
        width = scanner.nextFloat();
        System.out.println("Nhập chiều rộng");
        height = scanner.nextFloat();
        float area = width * height;
        System.out.println("Area is : " + area);
        scanner.close();

    }
}
