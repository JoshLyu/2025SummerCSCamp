import java.util.Scanner;
public class intro {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in); // 从控制台读取



        for (int i = 0; i < 5; i++) {
            System.out.println("input the name" + (i + 1) + ": ");
            String name = scanner1.nextLine();
            System.out.println(" I am " + name + " on Oct 4 2025");

            if (i == 2) {
                System.out.println("Hello, I am " + name + " on Oct 4 2025");
            }


        }
    }
    }