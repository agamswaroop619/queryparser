import java.util.Arrays;
import java.util.Scanner;

class QuerySeparator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your SQL query:");

        String sqlQuery = sc.nextLine();
        sc.close();
        System.out.println("Given Query is " + sqlQuery);
        String fullQuery = sqlQuery.trim();
        int selectIndex = fullQuery.toUpperCase().indexOf("SELECT");
        int fromIndex = fullQuery.toUpperCase().indexOf("FROM");
        int whereIndex = fullQuery.toUpperCase().indexOf("WHERE");
        int havingIndex = fullQuery.toUpperCase().indexOf("HAVING");
        int groupByIndex = fullQuery.toUpperCase().indexOf("GROUP BY");
        int orderByIndex = fullQuery.toUpperCase().indexOf("ORDER BY");

        String selectBlock = fullQuery.substring(selectIndex + "SELECT".length(), fromIndex).trim();
        String fromBlock = fullQuery.substring(fromIndex + "FROM".length(), whereIndex).trim();
        String whereBlock = fullQuery.substring(whereIndex + "WHERE".length()).trim();
        String havingBlock = "";
        String groupByBlock = "";
        String orderByBlock = "";

        if (havingIndex != -1) {
            havingBlock = fullQuery.substring(havingIndex + "HAVING".length(), groupByIndex).trim();
        }

        if (groupByIndex != -1) {
            groupByBlock = fullQuery.substring(groupByIndex + "GROUP BY".length(), orderByIndex).trim();
        }

        if (orderByIndex != -1) {
            orderByBlock = fullQuery.substring(orderByIndex + "ORDER BY".length()).trim();
        }

        // Printing the separated blocks
        System.out.println("Set of columns in SELECT block: " + selectBlock);
        System.out.println("Table in FROM block: " + fromBlock);
        System.out.println("Condition for WHERE block: " + whereBlock);
        System.out.println("Condition for HAVING block: " + havingBlock);
        System.out.println("Columns in GROUP BY block: " + groupByBlock);
        System.out.println("Columns in ORDER BY block: " + orderByBlock);


        String[] select = selectBlock.split(", ");
        System.out.println("Array of SELECT block: " + Arrays.toString(select));

        String[] from = fromBlock.split(" ");
        System.out.println("Array of FROM block: " + Arrays.toString(from));

        String[] where = whereBlock.split(" ");
        System.out.println("Array of WHERE block: " + Arrays.toString(where));

        String[] having = havingBlock.split(" ");
        System.out.println("Array of HAVING block: " + Arrays.toString(having));

        String[] groupBy = groupByBlock.split(", ");
        System.out.println("Array of GROUP BY block: " + Arrays.toString(groupBy));

        String[] orderBy = orderByBlock.split(", ");
        System.out.println("Array of ORDER BY block: " + Arrays.toString(orderBy));
    }
}
