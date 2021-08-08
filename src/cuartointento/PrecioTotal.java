package cuartointento;

class PrecioTotal {//A

    private Double tProductosAlimentarios;
    private Double tBebidas;
    private Double tRefrigerados;
    
    private ProductosAlimentarios listaProductosAlimentarios[];
//C

    public PrecioTotal(){
        this.tProductosAlimentarios = 0.0;
        this.tBebidas = 0.0;
        this.tRefrigerados = 0.0;
    }
public PrecioTotal(ProductosAlimentarios listaProductosAlimentarios[]){
    this.tProductosAlimentarios = 0.0;
    this.tBebidas = 0.0;
    this.tRefrigerados = 0.0;
    
    this.listaProductosAlimentarios = listaProductosAlimentarios;
}
   
    
//M

    public void mostrarTotal() {
        for(ProductosAlimentarios la: listaProductosAlimentarios) {

            if (la instanceof ProductosAlimentarios) {
                tProductosAlimentarios += la.calcularPrecio();
            }
            if (la instanceof Bebidas) {
                tBebidas += la.calcularPrecio();
            }
            if (la instanceof Refrigerados) {
                tRefrigerados += la.calcularPrecio();
            }

        }
        System.out.println("El precio total de los Productos Alimentarios es de "
                + tProductosAlimentarios);
        System.out.println("La suma del precio de las Bebidas es de " + tBebidas);
        System.out.println("La suma del precio de los Refrigerados es de "
                + tRefrigerados);
    
}
}