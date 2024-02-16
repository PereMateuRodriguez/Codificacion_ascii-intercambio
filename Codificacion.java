//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //Cambiar la primera letra por el codigo ascii
        String text = "A wise old owl lived in an oak";
        if(text.length() < 1){
            System.out.println(text);
        }
        else{

            String[] lista = text.split(" ");

            //Coger la primera palabra
            for (int i = 0; i < lista.length; i++){
                if(lista[i].length() == 1){
                    int code_acsii = (int) lista[i].charAt(0);
                    lista[i] = code_acsii + "";
                }
                else if(lista[i].length() == 2){
                    int code_acsii = (int) lista[i].charAt(0);
                    lista[i] = code_acsii + "" + lista[i].charAt(1);
                }
                else{
                    System.out.println(lista[i].charAt(0));
                    int code_acsii = (int) lista[i].charAt(0);
                    char segunda_letra = lista[i].charAt(1);
                    String Segunda_letra_String = String.valueOf(segunda_letra);
                    char ultima_letra = lista[i].charAt(lista[i].length()-1);
                    String Ultima_letra_String = String.valueOf(ultima_letra);
                    String letras = "";
                    for (int j = 2; j <(lista[i].length()-1); j++ ) {
                        String letra = String.valueOf(lista[i].charAt(j));
                        letras = letras + letra ;
                    }
                    lista[i]= code_acsii +  Ultima_letra_String + letras + Segunda_letra_String;
                }
            }
            String str = "";
            for (int i = 0; i < lista.length ; i++){
                str = str +" " + lista[i];
            }
            str = str.replaceFirst(" ", "");
            System.out.println(str);
        }
    }
}
