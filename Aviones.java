
 public class Aviones{

    private String tamaño;
    private int capacidad;
    private String marca;
    
    public Aviones (String tamaño, int capacidad, String marca) {

        this.tamaño = tamaño;
        this.capacidad = capacidad;
        this.marca = marca;
    
    }

    public String getTamaño(){
        return tamaño;
    }

    public void setTamaño(String tamaño){
        this.tamaño = tamaño;
    }

    public int getCapacidad(){
        return capacidad;
    }

    public void setCapacidad(int capacidad){
        this.capacidad = capacidad;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void despegar(){
        System.out.println("el avion esta despegando");
    }

    public void aterrizar(){
        System.out.println("el avion esta aterrizando");
    }
}