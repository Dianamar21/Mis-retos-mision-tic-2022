package primerreto;
//clase requisito

public class Inversiones {

    private int vTiempo;
    private double vMonto;
    private double vInteres;

//Constructor
    public Inversiones(int vTiempo, double vMonto, double vInteres) {
        this.vTiempo = vTiempo;
        this.vMonto = vMonto;
        this.vInteres = vInteres;
    }

    public Inversiones() {

    }

//getter and setters
//    public double getvMonto() {
//        return vMonto;
//    }
//
//    public void setvMonto(double vMonto) {
//        this.vMonto = vMonto;
//    }
//
//    public double getvInteres() {
//        return vInteres;
//    }
//
//    public void setvInteres(double vInteres) {
//        this.vInteres = vInteres;
//    }
//
//    public int getvTiempo() {
//        return vTiempo;
//    }
//
//    public void setvTiempo(int vTiempo) {
//        this.vTiempo = vTiempo;
//    }
    //Metodos requisitos

    public double generarInteresSimple(int vTiempo, double vMonto, double vInteres) {
        double interesSimple = vMonto * vInteres * vTiempo;
        return interesSimple;
    }

    public double generarInteresCompuestos(int vTiempo, double vMonto, double vInteres) {
        double interesCompuesto = (vMonto) * (Math.pow((1 + vInteres), vTiempo) - 1);
        return interesCompuesto;
    }

    public String validarInversion(int vTiempo, double vMonto, double vInteres) {
        //String respuesta = String.valueOf(generarInteresCompuestos() - generarInteresSimple());
        double respuesta2 = generarInteresCompuestos(vTiempo, vMonto, vInteres)- generarInteresSimple(vTiempo, vMonto, vInteres);
        if ((vTiempo) > 0 && (vMonto > 0) && (vInteres > 0)) {
            return "La diferencia en el total de intereses generados para el proyecto, si escogemos entre evaluarlo a una tasa de interés Compuesto y evaluarlo a una tasa de interés Simple, asciende a la cifra de: $" + Double.toString(respuesta2);
        } else {
            return "Faltan datos para calcular la diferencia en el total de intereses generados para el proyecto.";
        }

    }
}
//Cuando lo coloco en la plataforma me muestra que da en 0 el resultado...