public abstract class LectorDecorator implements Lector {
    protected Lector decorador;
    public LectorDecorator(Lector decorador) {
        this.decorador = decorador;
    }
    public int leer() {
        return decorador.leer();
    }
    public void cerrar() {
       decorador.cerrar();
    }
}
