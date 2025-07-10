/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integracion;

/**
 *
 * @author HP
 */
public class Factura {

    private double monto1;
    private double monto2;
    private double monto3;
    private double monto4;
    private double sumaMonto;

    private String electronicos1;
    private String electronicos2;
    private String electronicos3;
    private String electronicos4;
    private int sumaElectronicos;

    private String automotrices1;
    private String automotrices2;
    private String automotrices3;
    private String automotrices4;
    private int sumaAutomotrices;

    private String contruccion1;
    private String contruccion2;
    private String contruccion3;
    private String contruccion4;
    private int sumaConstruccion;

    private String sucursal;
    private String vehiculo1;

    private double bonoProductos;
    private double bonoElectronicos;
    private double bonoAutomotrices;
    private double bonoConstruccion;
    private double sumaBono;
    
    private double puntosElectronicos;
    private double puntosAutomotrices;
    private double puntosConstruccion;
    private double sumaPuntos;
    
    public double getMonto1() {
        return monto1;
    }

    public void setMonto1(double monto1) {
        this.monto1 = monto1;
    }

    public double getMonto2() {
        return monto2;
    }

    public void setMonto2(double monto2) {
        this.monto2 = monto2;
    }

    public double getMonto3() {
        return monto3;
    }

    public void setMonto3(double monto3) {
        this.monto3 = monto3;
    }

    public double getMonto4() {
        return monto4;
    }

    public void setMonto4(double monto4) {
        this.monto4 = monto4;
    }

    public double getSumaMonto() {
        sumaMonto = getMonto1() + getMonto2() + getMonto3() + getMonto4();
        return sumaMonto;
    }

    public void setSumaMonto(double sumaMonto) {
        this.sumaMonto = sumaMonto;
    }

    public int getElectronicos1() {
        int e1 = 0;
        if (electronicos1.equals("Si")) {
            e1 = 1;

        }

        return e1;
    }

    public void setElectronicos1(String electronicos1) {
        this.electronicos1 = electronicos1;
    }

    public int getElectronicos2() {
        int e2 = 0;
        if (electronicos2.equals("Si")) {
            e2 = 1;

        }
        return e2;
    }

    public void setElectronicos2(String electronicos2) {
        this.electronicos2 = electronicos2;
    }

    public int getElectronicos3() {        
        int e3 = 0;
        if (electronicos3.equals("Si")) {
            e3 = 1;

        }        
        return e3;
       
    }
    public void setElectronicos3(String electronicos3) {
        this.electronicos3 = electronicos3;
    }

    public int getElectronicos4() {
        int e4 = 0;
        if (electronicos4.equals("Si")) {
            e4 = 1;

        }        
        return e4;
    }

    public void setElectronicos4(String electronicos4) {
        this.electronicos4 = electronicos4;
    }

    public int getSumaElectronicos() {
        sumaElectronicos = getElectronicos1() + getElectronicos2()+ getElectronicos3() + getElectronicos4();
        return sumaElectronicos;
    }

    public void setSumaElectronicos(int sumaElectronicos) {
        this.sumaElectronicos = sumaElectronicos;
    }

    public int getAutomotrices1() {
        int a1 = 0;
        if (automotrices1.equals("Si")) {
            a1 = 1;

        }
        return a1;
    }

    public void setAutomotrices1(String automotrices1) {
        this.automotrices1 = automotrices1;
    }

    public int getAutomotrices2() {
        int a2 = 0;
        if (automotrices2.equals("Si")) {
            a2 = 1;

        }
        return a2;
    }

    public void setAutomotrices2(String automotrices2) {
        this.automotrices2 = automotrices2;
    }

    public int getAutomotrices3() {
        int a3 = 0;
        if (automotrices3.equals("Si")) {
            a3 = 1;

        }
        return a3;
    }

    public void setAutomotrices3(String automotrices3) {
        this.automotrices3 = automotrices3;
    }

    public int getAutomotrices4() {
        int a4 = 0;
        if (automotrices4.equals("Si")) {
            a4 = 1;

        }
        return a4;
    }

    public void setAutomotrices4(String automotrices4) {
        this.automotrices4 = automotrices4;
    }

    public int getSumaAutomotrices() {
        sumaAutomotrices = getAutomotrices1() + getAutomotrices2() + getAutomotrices3() + getAutomotrices4();
        return sumaAutomotrices;
    }

    public void setSumaAutomotrices(int sumaAutomotrices) {
        this.sumaAutomotrices = sumaAutomotrices;
    }

    public int getContruccion1() {
        int c1 = 0;
        if (contruccion1.equals("Si")) {
            c1 = 1;
        }
        return c1;
    }

    public void setContruccion1(String contruccion1) {
        this.contruccion1 = contruccion1;
    }

    public int getContruccion2() {

        int c2 = 0;
        if (contruccion2.equals("Si")) {
            c2 = 1;
        }
        return c2;
    }

    public void setContruccion2(String contruccion2) {
        this.contruccion2 = contruccion2;
    }

    public int getContruccion3() {
        int c3 = 0;
        if (contruccion3.equals("Si")) {
            c3 = 1;
        }
        return c3;
        
    }

    public void setContruccion3(String contruccion3) {
        this.contruccion3 = contruccion3;
    }

    public int getContruccion4() {
        int c4 = 0;
        if (contruccion4.equals("Si")) {
            c4 = 1;
        }
        return c4;
    }

    public void setContruccion4(String contruccion4) {
        this.contruccion4 = contruccion4;
    }

    public int getSumaConstruccion() {
        sumaConstruccion = getContruccion1() + getContruccion2() + getContruccion3() + getContruccion4();
        return sumaConstruccion;
    }

    public void setSumaConstruccion(int sumaConstruccion) {
        this.sumaConstruccion = sumaConstruccion;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getVehiculo1() {
        return vehiculo1;
    }

    public void setVehiculo1(String vehiculo1) {
        this.vehiculo1 = vehiculo1;
    }

    public double getBonoProductos() {
        return bonoProductos;
    }

    public void setBonoProductos(double bonoProductos) {
        this.bonoProductos = bonoProductos;
    }

    public double getBonoElectronicos() {
        if (sumaElectronicos>=3) {
           bonoElectronicos = getSumaMonto() * 0.04; 
       } else if (sumaElectronicos<=2) {
           bonoElectronicos = getSumaMonto() * 0.02;  
        }
        return bonoElectronicos;
    }

    public void setBonoElectronicos(double bonoElectronicos) {
        this.bonoElectronicos = bonoElectronicos;
    }

    public double getBonoAutomotrices() {
        if (sumaAutomotrices>=4) {
        bonoAutomotrices = getSumaMonto() * 0.04; 
       } else if (sumaElectronicos<=2) {
           bonoAutomotrices = getSumaMonto() * 0.02;      
            }
        return bonoAutomotrices;
    }

    public void setBonoAutomotrices(double bonoAutomotrices) {
        this.bonoAutomotrices = bonoAutomotrices;
    }

    public double getBonoConstruccion() {
        if (sumaConstruccion>=1) {
          bonoConstruccion = getSumaMonto() * 0.08;
        }
        return bonoConstruccion;
    }

    public void setBonoConstruccion(double bonoConstruccion) {
        this.bonoConstruccion = bonoConstruccion;
    }

    public double getSumaBono() {
        sumaBono = getBonoAutomotrices() + getBonoConstruccion() + getBonoElectronicos();
        return sumaBono;
    }

    public void setSumaBono(double sumaBono) {
        this.sumaBono = sumaBono;
    }

    public double getPuntosElectronicos() {
        if (electronicos1.equals("Si") || electronicos2.equals("Si") || electronicos3.equals("Si") || electronicos4.equals("Si")) {
        puntosElectronicos = 1;   
        }
        return puntosElectronicos;
    }

    public void setPuntosElectronicos(double puntosElectronicos) {
        this.puntosElectronicos = puntosElectronicos;
    }

    public double getPuntosAutomotrices() {
        if (automotrices1.equals("Si") || automotrices2.equals("Si") || automotrices3.equals("Si") || automotrices4.equals("Si")) {
        puntosAutomotrices = 1;   
        }
        
        return puntosAutomotrices;
    }

    public void setPuntosAutomotrices(double puntosAutomotrices) {
        this.puntosAutomotrices = puntosAutomotrices;
    }

    public double getPuntosConstruccion() {
        if (contruccion1.equals("Si") || contruccion2.equals("Si") || contruccion3.equals("Si") || contruccion4.equals("Si")) {
        puntosConstruccion = 1;   
        }
        return puntosConstruccion;
    }

    public void setPuntosConstruccion(double puntosConstruccion) {
        this.puntosConstruccion = puntosConstruccion;
    }

    public double getSumaPuntos() {
        sumaPuntos = getPuntosAutomotrices() + getPuntosConstruccion() + getPuntosElectronicos();
        return sumaPuntos;
    }

    public void setSumaPuntos(double sumaPuntos) {
        this.sumaPuntos = sumaPuntos;
    }

    @Override
    public String toString() {
        return "\nVendio un total de: " + getSumaMonto() + "\n"
             + "Obtuvo un total de comisiones: " + getSumaBono() + "\n"
                + "Puntos obtenidos por el vendedor: " + getSumaPuntos() + "\n"
                + "El agente vendedor " + vehiculo1 + " con un vehiculo propio" + "\n"
                + "Sucursal; " + sucursal;
    }

    
    
}
