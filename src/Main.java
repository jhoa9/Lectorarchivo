import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            Lector lector = new LectorArchivo("archivo.txt");
            lector = new MayusculaMinuscula(lector);
            lector = new EspacioGuion(lector);

            int byteLeido;
            while ((byteLeido = lector.leer()) != -1) {
                System.out.print((char) byteLeido);
            }
            lector.cerrar();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
