import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;

public class ArchivosBinarios {

    public static void main(String[] args) throws MalformedURLException {

        String localPath = "C:\\Users\\natal\\OneDrive\\Documentos\\14.jpg";
        URL url = null;

        System.out.println(Paths.get(localPath).toString());
        System.out.println(Paths.get(localPath).toUri().toString());
        System.out.println(Paths.get(localPath).toUri().toURL().toString());


    }
}
