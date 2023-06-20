import java.util.Scanner;

 class querySeparator {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write the Query");
        String query = sc.nextLine();
        String[] words = query.split(" ");
        int selectIndex=-1, fromIndex=-1;
        for(int i=0;i<words.length;i++){
            if(words[i]=="select"){
                selectIndex=i;
            }
            if(words[i]=="from"){
                fromIndex=i;
            }
        }

    }
}
