import java.util.ArrayList;
import java.util.List;

public class PruebaAviones {
    public static void main(String[] args) {
        List<Aviones> listaAviones = new ArrayList<>();
        listaAviones.add(new AvionComercial("Boeing", 150, "Mediano", 200));
        listaAviones.add(new AvionCarga("CargoPlane", 300, "Grande", 5000.0));
        listaAviones.add(new AvionMilitar("FighterJet", 2, "Pequeño", 5));

        for (Aviones avion : listaAviones) {
            avion.despegar();

            if (avion instanceof AvionComercial) {
                AvionComercial comercial = (AvionComercial) avion;
                comercial.aterrizar();
            } else if (avion instanceof AvionCarga) {
                AvionCarga carga = (AvionCarga) avion;
                carga.aterrizar();
            } else if (avion instanceof AvionMilitar) {
                AvionMilitar militar = (AvionMilitar) avion;
                militar.aterrizar();
            }

            
            System.out.println();  // Separador para mejorar la legibilidad
        }
    }
}