package MiniCalculadora;

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

    public double raizCuadrada (){
        return  Math.sqrt(insertarNumero);
    }

    public double valorAbsoluto(){
        return Math.abs(insertarNumero);
    }
    //=====================================================

}
