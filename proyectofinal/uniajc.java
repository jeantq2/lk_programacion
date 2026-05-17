package proyectofinal;

public public class uniajc {
    private String id;
    private String nombre;
    private int horasDeporte;
    private int horasCultura;
    private int horasSalud;
    private double promedio;

    public Estudiante(String id, String nombre, double promedio) {
        this.id = id;
        this.nombre = nombre;
        this.promedio = promedio;
    }

    public void agregarHoras(String categoria, int horas) {
        switch (categoria.toLowerCase()) {
            case "deporte":
                horasDeporte += horas;
                break;
            case "cultura":
                horasCultura += horas;
                break;
            case "salud":
                horasSalud += horas;
                break;
        }
    }

    public int getTotalHoras() {
        return horasDeporte + horasCultura + horasSalud;
    }

    public boolean cumpleRequisitos() {
        return horasDeporte >= 10 && horasCultura >= 10 && horasSalud >= 10;
    }

    public double getPromedio() {
        return promedio;
    }

    public String getNombre() {
        return nombre;
    }
} {
    
}
