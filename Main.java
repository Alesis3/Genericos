import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Caja<String> miCaja = new Caja (new String [10]);
        miCaja.add(0, "hola");
        miCaja.add(1, "adios");
        miCaja.add(2, "hi");
        System.out.println(miCaja);


        System.out.println("-------------comida-------------");

        Caja<Comida> cajaComida= new Caja<>(new Comida[10]);
        cajaComida.add(0, new Comida("yogurth", true));
        System.out.println(cajaComida.get(0));

        ArrayList<Comida> comidas = new ArrayList<>();
        comidas.add(new Comida("Zanahoria", false));
        comidas.add(new Comida("Yogurth", true));
        comidas.add(new Comida("Danonino", true));
        comidas.add(new Comida("Manzana", false));
        comidas.add(new Comida("Bisteck", false));

        System.out.println(comidas.get(3));

        comidas.set(3, new Comida ("Fresa", false));
        comidas.add(3, new Comida("Naranja", false));
        System.out.println("-------------final---------------");

        for (Comida comida : comidas) {
            System.out.println(comida);
        }

    }
}