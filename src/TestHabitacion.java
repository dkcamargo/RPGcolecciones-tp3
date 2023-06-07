public class TestHabitacion {
    public TestHabitacion() {
        try {
            Mapa mapa = Mapa.getInstance();
            Habitacion hab = mapa.getInicio();
            System.out.println(hab.getNombre());
            System.out.println(hab.getDescripcionCorta());
            



            System.out.println(hab.getEstado().toString());
            hab = hab.getSalida(Salida.NORTE);
            System.out.println(hab.getNombre());
            System.out.println(hab.getDescripcionCorta());
            hab = hab.getSalida(Salida.OESTE);
            System.out.println(hab.getNombre());
            System.out.println(hab.getDescripcionCorta());
        } catch (Exception e) {
            System.out.println("Error inesperado" + e);
        }
    }
}
