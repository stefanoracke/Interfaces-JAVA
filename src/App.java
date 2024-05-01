import models.Dolphine;
import models.Octopus;


public class App {
    public static void main(String[] args) throws Exception {
        Octopus octopus = new Octopus("Pulpo");
        Dolphine dolphine = new Dolphine("Josefa");

        octopus.nadar();
        octopus.comunicarse();
        octopus.alimentar(3);

        dolphine.nadar();
        dolphine.comunicarse();
        dolphine.alimentar(5);
     
    }
}
