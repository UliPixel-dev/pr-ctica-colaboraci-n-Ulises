public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }


 // suma
public int sumar(int a, int b) { 
return a + b; 
} 
// Resta 
public int restar(int a, int b) { 
        return a - b; 
    } 
 
    // Multiplicación 
    public int multiplicar(int a, int b) { 
        return a * b; 
    } 
 
    // División 
    public double dividir(int a, int b) { 
        if (b == 0) { 
            System.out.println("Error: no se puede dividir por cero"); 
            return 0; 
        } 
        return (double) a / b; 
    } 
 
    // Método para mostrar resultados 
    public void mostrarResultado(String operacion, double resultado) { 
        System.out.println("Resultado de " + operacion + ": " + resultado); 
    } 
} 
 
