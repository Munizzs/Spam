
import java.util.Scanner;

public class TestOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          
          
          System.out.println("Digite sua mensagem");
          String msg = sc.nextLine();
          
          Spam s = new Spam(msg);

          s.show();
          s.words();
          
          boolean spam = s.getSpam(); 
        
        if(spam==true){
            System.out.println("Spam");
        }else{
            System.out.println("Verificado n�o � spam!\nMensagem:\n"+s.mensagem);
        }
       
        
            
    }
    
}
