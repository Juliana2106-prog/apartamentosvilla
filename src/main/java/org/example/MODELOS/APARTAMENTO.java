package org.example.MODELOS;

public class APARTAMENTO {
    private Long id;
    private String direccion;
    private String nombreUnidad;
    private Float tamaño;
    private Integer habitaciones;
    private Float precioAlquiler;
    private Integer baños;

    public APARTAMENTO() {
    }

    public APARTAMENTO(Long id, String direccion, String nombreunidad, Float tamaño, Integer habitaciones, Float precioAlquiler, Integer baños) {
        this.id = id;
        this.direccion = direccion;
        this.nombreUnidad = nombreUnidad;
        this.tamaño = tamaño;
        this.habitaciones = habitaciones;
        this.precioAlquiler = precioAlquiler;
        this.baños = baños;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombreUnidad() {
        return nombreUnidad;
    }

    public void setNombreUnidad(String nombreUnidad) {
        this.nombreUnidad = nombreUnidad;
    }

    public Float getTamaño() {
        return tamaño;
    }

    public void setTamaño(Float tamaño) {
        this.tamaño = tamaño;
    }

    public Integer getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(Integer habitaciones) {
        this.habitaciones = habitaciones;
    }

    public Float getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(Float precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public Integer getBaños() {
        return baños;
    }

    public void setBaños(Integer baños) {
        this.baños = baños;
    }

    @Override
    public String toString() {
        return "APARTAMENTO{" +
                "id=" + id +
                ", direccion='" + direccion + '\'' +
                ", nombreUnidad='" + nombreUnidad + '\'' +
                ", tamaño=" + tamaño +
                ", habitaciones=" + habitaciones +
                ", precioAlquiler=" + precioAlquiler +
                ", baños=" + baños +
                '}';
    }
}
