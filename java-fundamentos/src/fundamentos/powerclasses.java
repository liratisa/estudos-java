package fundamentos;

public class powerclasses {
    
    static void verificarCaracteres() {
        String espaco = " ";
        Boolean caracterBlank = espaco.isBlank(); // não considera espaços como caracteres
        System.out.println(caracterBlank);

        boolean caracterEmpty = espaco.isEmpty(); // considera espaços como caracteres
        System.out.println(caracterEmpty);
    }
}
