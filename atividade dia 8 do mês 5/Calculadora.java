import java.util.*;

public class Calculadora {
    
    // Função para converter a expressão infixa para pós-fixa
    public static String infixaParaPosfixa(String expressao) {
        // Implementação da lógica de conversão
    }
    
    // Função para converter a expressão infixa para pré-fixa
    public static String infixaParaPrefixa(String expressao) {
        // Implementação da lógica de conversão
    }
    
    // Função para converter a expressão pós-fixa para infixa
    public static String posfixaParaInfixa(String expressao) {
        // Implementação da lógica de conversão
    }
    
    // Função para converter a expressão pós-fixa para pré-fixa
    public static String posfixaParaPrefixa(String expressao) {
        // Implementação da lógica de conversão
    }
    
    // Função para converter a expressão pré-fixa para infixa
    public static String prefixaParaInfixa(String expressao) {
        // Implementação da lógica de conversão
    }
    
    // Função para converter a expressão pré-fixa para pós-fixa
    public static String prefixaParaPosfixa(String expressao) {
        // Implementação da lógica de conversão
    }
    
    // Função para avaliar uma expressão na notação infixa
    public static double avaliarInfixa(String expressao) {
        // Implementação da lógica de avaliação
    }
    
    // Função para avaliar uma expressão na notação pós-fixa
    public static double avaliarPosfixa(String expressao) {
        // Implementação da lógica de avaliação
    }
    
    // Função para avaliar uma expressão na notação pré-fixa
    public static double avaliarPrefixa(String expressao) {
        // Implementação da lógica de avaliação
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a expressão:");
        String expressao = scanner.nextLine();
        
        System.out.println("Digite a notação da expressão (infixa, posfixa ou prefixa):");
        String notacao = scanner.nextLine();
        
        double resultado = 0;
        String infixa = "";
        String posfixa = "";
        String prefixa = "";
        
        switch(notacao) {
            case "infixa":
                resultado = avaliarInfixa(expressao);
                posfixa = infixaParaPosfixa(expressao);
                prefixa = infixaParaPrefixa(expressao);
                break;
            case "posfixa":
                resultado = avaliarPosfixa(expressao);
                infixa = posfixaParaInfixa(expressao);
                prefixa = posfixaParaPrefixa(expressao);
                break;
            case "prefixa":
                resultado = avaliarPrefixa(expressao);
                infixa = prefixaParaInfixa(expressao);
                posfixa = prefixaParaPosfixa(expressao);
                break;
            default:
                System.out.println("Notação inválida.");
                return;
        }
        
        System.out.println("Resultado: " + resultado);
        System.out.println("Expressão na notação infixa: " + infixa);
        System.out.println("Expressão na notação pós-fixa: " + posfixa);
        System.out.println("Expressão na notação pré-fixa: " + prefixa);
        
        scanner.close();
    }
}