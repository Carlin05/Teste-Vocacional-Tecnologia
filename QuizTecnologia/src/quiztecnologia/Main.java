package quiztecnologia;
/*
 * Desenvolvido em 18/11/2024 por:
 * André Luiz 
 * Carlos Augusto 
 * Gustavo Conceição
 * Julio Cesar
 */
public class Main {
    public static void main(String[] args) {
        QuizTecnologiaCompleto  quiz = new QuizTecnologiaCompleto();
        System.out.println("Versão do Java: " + System.getProperty("java.version"));
        System.out.println("Versão do JDK/JRE: " + System.getProperty("java.runtime.version"));
        quiz.setVisible(true); 
    }
}