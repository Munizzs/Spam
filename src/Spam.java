import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Spam {
    public String mensagem;
    public List<String> searching = new ArrayList<>();
    public List<String> wordSpam = new ArrayList<>();

    public Spam(String mensagem) {
        this.mensagem = mensagem;
    }

    public Spam() {
        words();
    }
      
    public void words(){
        searching.addAll(Arrays.asList(mensagem.toLowerCase().split(" ")));
        
        String spam = "Instantaneo, Gratis, Desconto, Suplementar, Gratis, Livre, Vencedor, Essencial, Garantido, Seguro, Limitado, Especial, Economico, Imperdivel, Aproveite, Oferta, Gratuito, Sem-taxa, Seguro, Assegurado, Unico, Premio, Sorteio, Grande-premio, Credito, Reembolso, Sem-investimento, Enriquecimento, Riqueza, Negocio, Passivo, Casa, Autonomo";
        
        wordSpam.addAll(Arrays.asList(spam.toLowerCase().split(", ")));
        
        
    }
    
    public void show() {
        for(String showw:searching)
            System.out.println(showw);
    }
    
    public boolean getSpam(){
        int cont=0;
        for(int j = 0;j<searching.size();j++){
        for(int i = 0;i<wordSpam.size();i++){         
        if(searching.get(i)==wordSpam.get(i)){
            cont++;
        }}}
        if(cont>=2){
            return true;
        }else{
            return false;
        }           
         // return wordSpam.containsAll(searching);               
    }
}
