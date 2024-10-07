package prestamoCelular;

public class Prestamo {

    private Disponible disponible;
    private Registrar registrar;

    public Prestamo() {
        disponible = new Disponible();
        registrar = new Registrar();
    }

    public void setDisponible(Disponible disponible) {
        this.disponible = disponible;
    }

    public void setRegistrar(Registrar registrar) {
        this.registrar = registrar;
    }

    public String prestamoCelularCaso(String modelo, String marca, String usuario) {
        if (disponible.estaDisponible(modelo, marca)) {
            if (registrar.registrarPrestamo(modelo, marca, usuario)) {
                return "El " + modelo + ", " + marca + ", " + " de " + usuario + "está disponible";
            } else {
                return "El " + modelo + ", " + marca + ", " + " NO está disponible";
            }

        } else {
            return "El " + modelo + ", " + marca + ", " + " de " + usuario + " NO está disponible";
        }
    }
}
