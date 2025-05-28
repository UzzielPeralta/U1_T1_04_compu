public class computadoraa {

    private String marca;
    private String modelo;
    private boolean encendida;

    public void encender() {
        if (!encendida) {
            encendida = true;
            System.out.println("Encendido");
        }
    }   

    public void apagar() {
        if (encendida) {
            encendida = false;
            System.out.println("Apagado");
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public boolean isEncendida() {
        return encendida;
    }

    public void SetModelo(String modelo) {
        this.modelo = modelo;
    }
}
