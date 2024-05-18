import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LectorArchivo implements Lector {
    private FileInputStream fileInputStream;
    public LectorArchivo(String archivo) throws FileNotFoundException {
        this.fileInputStream = new FileInputStream(archivo);
    }
    public int leer() {
        try { return
                fileInputStream.read();
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
    }
    public void cerrar() {
        try {
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
