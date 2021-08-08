package cuartointento;

public class Refrigerados extends ProductosAlimentarios { //A

    private static final Integer TEMPERATURA = 10;
    private Integer temperatura;
//C

    public Refrigerados() {
        super();
        this.temperatura = TEMPERATURA;
    }

    public Refrigerados(Double precioBase, Integer peso) {
        super(precioBase, peso);
        this.temperatura = TEMPERATURA;
    }

    public Refrigerados(Double precioBase, Integer peso, Integer temperatura) {
        super(precioBase, peso);
        this.temperatura = temperatura;
    }

    //M
    public Double calcularPrecio() {
        Double precioFinal = 0.0;
        Integer vTemperatura = 0;
        vTemperatura = (temperatura >= 5 && temperatura < 10) ? 20 : (temperatura >= 10 && temperatura <= 15) ? 18 : 5;
        precioFinal = super.calcularPrecio() + vTemperatura;
        return precioFinal;
    }

}
