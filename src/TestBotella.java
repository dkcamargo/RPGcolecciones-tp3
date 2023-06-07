public class TestBotella {
    public TestBotella () {
        Botella botella = new Botella();
        Agua agua = new Agua();
        try {
            System.out.println(botella);
            // botella.getElemento();
            
            System.out.println("Peso: " + botella.getPeso());

            System.out.println(botella.getEstado());
            
            botella.llenarBotella(agua);
            
            System.out.println(botella);
            
            System.out.println("Peso: " + botella.getPeso());
            System.out.println(botella.getEstado());
            
            botella.vaciarBotella();
            System.out.println(botella);
            System.out.println("Peso: " + botella.getPeso());
            System.out.println(botella.getEstado());
            
        } catch (Exception e) {
            System.out.println (e.getMessage());
        }
    }
}
