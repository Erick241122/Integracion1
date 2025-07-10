/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integracion;

/**
 *
 * @author HP
 */
public class Agente {
    
private String nombre;
private String id;
private String codigo;

private int mes;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
     public String getMes() {
        String fecha;
        switch (mes) {
                case 1 -> fecha = "Enero";
                case 2 -> fecha = "Febrero";
                case 3 -> fecha = "Marzo";
                case 4 -> fecha = "Abril";
                case 5 -> fecha = "Mayo";
                case 6 -> fecha = "Junio";
                case 7 -> fecha = "Julio";
                case 8 -> fecha = "Agosto";
                case 9 -> fecha = "Septiembre";
                case 10 -> fecha = "Octubre";
                case 11 -> fecha = "Noviembre";
                case 12 -> fecha = "Noviembre";
            default -> throw new AssertionError();
        }
        return fecha;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    @Override
    public String toString() {
        return "El agente vendedor; " + nombre + " código: " + codigo + " en el mes de " + getMes();
    }



}
