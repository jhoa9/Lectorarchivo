public class MayusculaMinuscula extends LectorDecorator {
    public MayusculaMinuscula(Lector decorador) {
        super(decorador);
    }
    public int leer() {
        int byteLeido = super.leer();
        if (byteLeido >= 'A'&& byteLeido <= 'Z') {
            return byteLeido + 32;
        }
        return byteLeido;
    }
}
