public class TestCarcaj {
    public TestCarcaj() {
        try {
            Carcaj carcaj = new Carcaj("mediano", 1);
            System.out.println(carcaj);
            System.out.println(carcaj.getPeso());
            
            carcaj.addFlecha(new Flecha());
            System.out.println(carcaj);
            carcaj.addFlecha(new Flecha());
            System.out.println(carcaj);
            Elemento flecha1 = carcaj.getFlecha();
            System.out.println(carcaj);
            carcaj.addFlecha(new Flecha());
            System.out.println(carcaj);
            

            Elemento flecha2 = carcaj.getFlecha();
            System.out.println(carcaj);

        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
