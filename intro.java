public class intro {
    public static void main(String[] args)
    {
        Scanner scanner1 = new Scanner(System.in); // 从控制台读取

        System.out.println("input the name1: ");
        String name1 = scanner1.nextLine();
        name1 = "Josh";
//        String name = "Susie";
        System.out.println("Hello, I am "+name1+" on Oct 4 2025");
//        System.out.println("Hello, I am "+name2+" on Aug 6 2025");
//        System.out.println("Hello, I am "+name3+" on Aug 6 2025");
//        System.out.println("Hello, I am "+name4+" on Aug 6 2025");
//        System.out.println("Hello, I am "+name5+" on Aug 6 2025");
//        System.out.println("Hello, I am "+name6+" on Aug 6 2025");
        //1. for 2.while
        //i++/i--/i**/i//
        //i = i + 1
        for(int i=0;i<5;i++){
            System.out.println("input the name"+(i+1)+": ");
            String name2 = scanner1.nextLine();
//        String name = "Susie";
            System.out.println("Hello, I am "+name2+" on Oct 4 2025");
        }
}