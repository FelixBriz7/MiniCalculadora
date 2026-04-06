package MiniCalculadora;

public class Main {
    public static void main(String[] args) {
        MiniCalculadora calculadora = new MiniCalculadora(67.5);
        System.out.printf("El numero insertado es: %.2f\n", calculadora.getInsertarNumero());
        System.out.println("======================");
        System.out.printf("Esta es la raiz cuadrada del numero insertado: %.2f\n",calculadora.raizCuadrada());
        System.out.println("======================");
        System.out.printf("Este es el valor absoluto del numero insertado: %.2f\n",calculadora.valorAbsoluto());
    }
}
