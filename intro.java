import java.util.Scanner;
public class intro {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in); // 从控制台读取

        String[] names  = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("input the firstname" + (i + 1) + ": ");
            String name = scanner1.nextLine();
            names[i]=name;
            System.out.println(" Hello I am " + names[i]+ " on Oct 4 2025");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("input the Lastname" + (i + 1) + ": ");
            String name = scanner1.nextLine();
            names[i]=names[i]+" "+name;
            System.out.println(" Hello I am " + names[i]+ " on Oct 4 2025");
        }
        int i = 0;
        while (i < 5) {
            System.out.println(" Hello I am " + names[i]+ " on Oct 4 2025");
         i++;
        }
    }
    }