public class AvionCarga extends Aviones {
    private double cargaMaxima; 

    public AvionCarga(String tamaño, int capacidad, String marca, double cargaMaxima){
        super(tamaño, capacidad, marca);
        this.cargaMaxima = cargaMaxima;
    }

    public double getCargaMaxima(){
        return cargaMaxima;
    }

    public void setCargaMaxima(double cargaMaxima){
        this.cargaMaxima = cargaMaxima;
    }

    @Override
    public void aterrizar(){
        System.out.println("compuerta cerrada");
    }

}
