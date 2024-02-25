public class AvionMilitar extends Aviones {
    private int cantidadSoldados; 

    public AvionMilitar(String tamaño, int capacidad, String marca, int cantidadSoldados){
        super(tamaño, capacidad, marca);
        this.cantidadSoldados = cantidadSoldados;
    }

    public int getCantidadSoldados(){
        return cantidadSoldados;
    }

    public void setCantidadSoldados(int cantidadSoldados){
        this.cantidadSoldados = cantidadSoldados;
    }

    public void enviarTropas(){
        System.out.println("Enviando tropas");
    }

    @Override
    public void aterrizar(){
        System.out.println("base militar");
        }
}
