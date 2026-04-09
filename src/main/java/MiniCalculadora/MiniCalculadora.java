package MiniCalculadora;

/**
 * Clase que representa una mini calculadora con operaciones matemáticas básicas.
 *
 * @author Felix José Briz Ortega
 * @version 1.0
 * @since 1.0
 *
 */

public class MiniCalculadora {

    private double insertarNumero;


    //=================Getter && Setter======================


    public double getInsertarNumero() {
        return insertarNumero;
    }

    public void setInsertarNumero(double insertarNumero) {
        this.insertarNumero = insertarNumero;
    }

    //===============Constructor=======================

    public MiniCalculadora(double insertarNumero) {
        this.insertarNumero = insertarNumero;
    }


    //===========MetodosCruds=============================

    /**
     * Calcula la raíz cuadrada del número que se va a almacenar.
     * Si el número es negativo, devuelve 0 ya que la raíz cuadrada
     * de un número negativo no está definida en los reales
     *
     * @return La raíz cuadrada de insertarNumero, o 0 si el número es negativo.
     * @see Math#sqrt(double)
     * @since 1.0
     * @deprecated Este método devolverá una excepción en versiones futuras
     * en lugar de devolver 0 para números negativos.
     *
     */

    public double raizCuadrada (){
        if (insertarNumero < 0)
            return 0;
        else
            return  Math.sqrt(insertarNumero);
    }

    /**
     * Calcula el valor absoluto del número almacenado.
     * Convierte cualquier número negativo en su equivalente positivo.
     *
     * @return El valor absoluto de insertarNumero
     * @see Math#abs(double)
     * @since 1.0
     */

    public double valorAbsoluto(){
        return Math.abs(insertarNumero);
    }
    //=====================================================

}