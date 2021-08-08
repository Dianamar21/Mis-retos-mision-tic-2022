
package cuartointento;

public class Bebidas extends ProductosAlimentarios{
    private static final char LUGAR_ORIGEN = 'N';
    private char lugarOrigen;
    
    public Bebidas(){
        super();
        this.lugarOrigen = LUGAR_ORIGEN;
    }
    public Bebidas(Double precioBase, Integer peso){
        super(precioBase, peso);
        this.lugarOrigen = LUGAR_ORIGEN;
    }
    public Bebidas(Double precioBase, Integer peso, char lugarOrigen){
        super(precioBase, peso);
        comprobarLugarOrigen(lugarOrigen);
    }

    public void comprobarLugarOrigen(char lugarOrigen) {
        if((lugarOrigen == 'N') || (lugarOrigen == 'I')){
            this.lugarOrigen = lugarOrigen;
        }else{
            this.lugarOrigen = LUGAR_ORIGEN;
        }
    }
    public Double calcularPrecio(){
        Double precioFinal = 0.0;
        Integer vLugarOrigen = 0;
        
        vLugarOrigen = (lugarOrigen == 'N') ? 5 : 15;
        precioFinal = super.calcularPrecio() + vLugarOrigen;
        return precioFinal;
        
    }
}
