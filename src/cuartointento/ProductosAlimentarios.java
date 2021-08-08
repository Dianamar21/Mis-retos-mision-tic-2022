
package cuartointento;

class ProductosAlimentarios {//A
    private static final Double PRECIO_BASE = 80.0;
    private static final Integer PESO_BASE = 5;
    private static final char TIPO_ALIMENTO = 'N';
    protected Double precioBase;
    protected Integer peso;
    protected char tipoAlimento;
    //C

    public ProductosAlimentarios() {
        this.precioBase = PRECIO_BASE;
        this.peso = PESO_BASE;
        this.tipoAlimento = TIPO_ALIMENTO;
    }

    public ProductosAlimentarios(Double precioBase, Integer peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.tipoAlimento = TIPO_ALIMENTO;
        
    }

    public ProductosAlimentarios(Double precioBase, Integer peso, char tipoAlimento) {
        this.precioBase = precioBase;
        this.peso = peso;
        comprobarTipoAlimento(tipoAlimento);
    }
    //M
    public void comprobarTipoAlimento(char tipoAlimento){
        if ((tipoAlimento == 'N') || (tipoAlimento == 'C')){ 
            this.tipoAlimento = tipoAlimento;
        }else{
            this.tipoAlimento = TIPO_ALIMENTO; 
        }
    }
    public Double calcularPrecio(){
        Double precioFinal = 0.0;
        Integer vPeso = 0 ;
        Integer vTipoAlimento = 0 ;
        
        vTipoAlimento = (tipoAlimento == 'N')? 40:20;
        vPeso = (peso >=0 && peso <= 9) ? 6 : (peso >9 && peso <= 16) ? 8 : 20;
        precioFinal = precioBase + vTipoAlimento + vPeso; 
        return precioFinal;
        
    }
    
}
