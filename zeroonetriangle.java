// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class zeroonetriangle {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        
        int n=5;
        
        for (int i = 1; i <= n; i++) {
            for(int j=1;j<=i;j++){
              int sum =i+j;
              if(sum %2==0){
                  System.out.print("1 ");
              }else{
                  System.out.print("0 ");
              }

            }
            System.out.println();

            
        }
    }
}
