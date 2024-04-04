
import java.util.Scanner;

public class TestOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          
          
          System.out.println("Digite sua mensagem");
          String msg = sc.nextLine();
          
          Spam s = new Spam(msg);
          
          System.out.println("\n\n------"+s.mensagem);
          s.words();
          
          boolean spam = s.getSpam(); 
        
        if(spam==true){
            System.out.println(spam);
            System.out.println("Spam");
        }else{
             System.out.println(spam);
            System.out.println("Verificado não é spam!\nMensagem:\n"+s.mensagem);
        }
       
        
            
    }
    
}
