public class ArrayEx2 {
    
    public static void main(String args[]) {
        String[] browsers = new String[4]; // Aumentamos o tamanho da matriz para 4 para armazenar os 4 navegadores
        browsers[0] = "explorer";
        browsers[1] = "chrome";
        browsers[2] = "opera";
        browsers[3] = "firefox";
        
        System.out.println("Tamanho da matriz: " + browsers.length); // Corrigimos o erro no print
        
        // Usando um loop for-each para exibir todos os navegadores
        System.out.println("Navegadores armazenados na matriz:");
        for (String browser : browsers) {
            System.out.println(browser);
        }
    }
    
}
