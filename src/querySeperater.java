import java.util.Scanner;

 class querySeparator {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write the Query");
        String query = sc.nextLine();
        String[] words = query.split(" ");


    }
}
