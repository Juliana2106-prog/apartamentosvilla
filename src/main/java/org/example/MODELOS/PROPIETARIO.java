package org.example.MODELOS;

public class PROPIETARIO {
    private Long id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
    private String ocupacion;
    private Integer cantidadPropiedades;

    public PROPIETARIO() {
    }

    public PROPIETARIO(Long id, String nombre, String apellido, String telefono, String direccion, String ocupacion, Integer cantidadPropiedades) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.ocupacion = ocupacion;
        this.cantidadPropiedades = cantidadPropiedades;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public Integer getCantidadPropiedades() {
        return cantidadPropiedades;
    }

    public void setCantidadPropiedades(Integer cantidadPropiedades) {
        this.cantidadPropiedades = cantidadPropiedades;
    }

    @Override
    public String toString() {
        return "PROPIETARIO{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", ocupacion='" + ocupacion + '\'' +
                ", cantidadPropiedades=" + cantidadPropiedades +
                '}';
    }
}

