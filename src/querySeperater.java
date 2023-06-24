import java.util.Arrays;
import java.util.Scanner;

 class querySeparator {

     public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter your SQL query:");

         String sqlQuery = sc.nextLine();
         sc.close();
         System.out.println("Given Query is " + sqlQuery);
         String fullQuery = sqlQuery.trim();

         // Splitting the SQL query into multiple blocks
         int selectIndex = fullQuery.toUpperCase().indexOf("SELECT");
         int fromIndex = fullQuery.toUpperCase().indexOf("FROM");
         int whereIndex = fullQuery.toUpperCase().indexOf("WHERE");

         String selectBlock = fullQuery.substring(selectIndex + "SELECT".length(), fromIndex).trim();
         String fromBlock = fullQuery.substring(fromIndex + "FROM".length(), whereIndex).trim();
         String whereBlock = fullQuery.substring(whereIndex + "WHERE".length()).trim();

         // printing the separated blocks
         System.out.println("Set of column's contain Select Block is : " + selectBlock);
         System.out.println("Table in From Block is : " + fromBlock);
         System.out.println("Condition for Where Block is : " + whereBlock);
         //Now converting into respective array's
         String[] select = selectBlock.split(", ");
         System.out.println("Array of Select block is " + Arrays.toString(select));
         //System.out.println(select[1]);

         //Array for From block
         String[] from = fromBlock.split(" ");
         System.out.println("Array of From block is " + Arrays.toString(from));

         //Array for Where Block
         String[] where = whereBlock.split(" ");
         System.out.println("Array of Where block is " + Arrays.toString(where));
     }
 }