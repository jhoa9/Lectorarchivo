public class EspacioGuion extends LectorDecorator {
    public EspacioGuion(Lector decorador) {
        super(decorador);
    }
    public int leer() {
        int byteLeido = super.leer();
        if (byteLeido == ' ') {
            return '_';
        }
        return byteLeido;
    }
}
