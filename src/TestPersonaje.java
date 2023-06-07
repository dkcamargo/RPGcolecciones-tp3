public class TestPersonaje {
    public TestPersonaje() {
        try {
            Personaje mago = new Personaje("Gandalf", 100, 260);
            Bolsa bolsa = new Bolsa("Mochila",150);
                mago.setBolsa(bolsa);
                mago.mirarAlrededor();
                mago.recogerElemento("Carcaj chico");
                mago.guardarElemento();
                mago.recogerElemento("Arco");
                System.out.println(mago.getNombre() + " " + mago.getElemento());
                
                mago.irHacia(Salida.NORTE);
                mago.mirarAlrededor();
                
                System.out.println("Bolsa: " + bolsa.getListaElementosEnLaBolsa());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
