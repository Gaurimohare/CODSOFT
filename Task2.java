import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Enter the text:");
        Scanner scanner = new Scanner(System.in);
        String user=scanner.nextLine() ;
        scanner.close();
        user =user.trim();
        int count=0;
        if (user.length()==0){
            count=0;
        }else{
            count++;
            for(int i=0; i<user.length(); i++){
                if(user.charAt(i) == ' ' && user.charAt(i) == ' '){
                    count++;
                }
            }
        }System.out.println("Word count is " + count );
        
    }

}
