public class AvionComercial extends Aviones{

    private int pasajeros; 

    public AvionComercial(String tamaño, int capacidad, String marca, int pasajeros){
        super(tamaño, capacidad, marca);
        this.pasajeros = pasajeros;
    }

    public int getPasajeros(){
        return pasajeros;
    }

    public void setPasajeros(int pasajeros){
        this.pasajeros = pasajeros;
    }

    public void venderPasajes(){
        System.out.println("vendiendo pasajes para el avion comercial");
    }

    @Override
    public void aterrizar(){
        System.out.println("aeropuerto");
    }
}
