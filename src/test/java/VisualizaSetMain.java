import io.github.bonigarcia.wdm.WebDriverManager;
import scripts.VisualizaSetSoundCloud;

public class VisualizaSetMain {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();


        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Execução: " + i);
                VisualizaSetSoundCloud visualizaSetSoundCloud = new VisualizaSetSoundCloud();
                visualizaSetSoundCloud.ouvir();


            } catch (InterruptedException e) {
                System.out.println("travou aqui");
                throw new RuntimeException(e);
            }

        }

    }
}
