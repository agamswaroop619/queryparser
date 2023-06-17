import java.util.Scanner;

public class queryProcessor extends queryAbstractClass{

    @Override
    public String queryParser(String query) {
        System.out.println("Change the query");
        Scanner sc= new Scanner(System.in);
        query=sc.nextLine();
        return query;
    }
}
