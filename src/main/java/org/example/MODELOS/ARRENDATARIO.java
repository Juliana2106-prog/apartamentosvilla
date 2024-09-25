package org.example.MODELOS;

public class ARRENDATARIO {
    private Long id;
    private String nombre;
    private String apellido;
    private String numeroDocumento;
    private String telefono;
    private String historialCrediticio;
    private Float ingresoMensual;

    public ARRENDATARIO() {
    }

    public ARRENDATARIO(Long id, String nombre, String apellido, String numeroDocumento, String telefono, String historialCrediticio, Float ingresoMensual) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDocumento = numeroDocumento;
        this.telefono = telefono;
        this.historialCrediticio = historialCrediticio;
        this.ingresoMensual = ingresoMensual;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getHistorialCrediticio() {
        return historialCrediticio;
    }

    public void setHistorialCrediticio(String historialCrediticio) {
        this.historialCrediticio = historialCrediticio;
    }

    public Float getIngresoMensual() {
        return ingresoMensual;
    }

    public void setIngresoMensual(Float ingresoMensual) {
        this.ingresoMensual = ingresoMensual;
    }

    @Override
    public String toString() {
        return "ARRENDATARIO{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", numeroDocumento='" + numeroDocumento + '\'' +
                ", telefono='" + telefono + '\'' +
                ", historialCrediticio='" + historialCrediticio + '\'' +
                ", ingresoMensual=" + ingresoMensual +
                '}';
    }
}
