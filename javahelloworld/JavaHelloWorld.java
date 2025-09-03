public class JavaHelloWorld {

    public static void main(String[] args) {
        String ambiente = args[0];
        if (ambiente.equalsIgnoreCase("DEV")){
            System.out.print("Executando em DEV");
        } else if (ambiente.equalsIgnoreCase("Teste")){
            System.out.print("Executando em Teste");
        } else{
            System.out.print(ambiente);
        } 
    }
}



// Voce convera com o console OBS : nunca esqueca de compilar

/* public static void main(String[] args) {
        System.out.print("Ola " + args[0] + " " + args[1]);
    } 
*/