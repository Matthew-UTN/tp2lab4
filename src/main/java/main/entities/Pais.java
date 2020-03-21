package main.entities;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Arrays;


@Entity
public class Pais {
    @Id


    private Integer codigoPais;


    private String nombrePais;


    private String capitalPais;

    private String region;

    private int poblacion;

    private double latitud;
    private double longitud;


    public int getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(Integer codigoPais) {
        this.codigoPais = codigoPais;

    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public String getCapitalPais() {
        return capitalPais;
    }

    public void setCapitalPais(String capitalPais) {
        this.capitalPais = capitalPais;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "codigoPais=" + codigoPais +
                ", nombrePais='" + nombrePais + '\'' +
                ", capitalPais='" + capitalPais + '\'' +
                ", region='" + region + '\'' +
                ", poblacion=" + poblacion +
                ", latitud=" + latitud +
                ", longitud=" + longitud +
                '}';
    }
}
