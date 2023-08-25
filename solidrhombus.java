
public class solidrhombus {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        int n = 5;
        
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            //stars
            for (int j = 1; j <= 5; j++) {

               
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
