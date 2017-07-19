package com.androicoude.petagram.pojo;

/**
 * Created by a623214 on 18/07/2017.
 */

public class Mascota {
    private int id;
    private int foto;
    private String nombre;
    private int raiting;

    public Mascota(int id, int foto,String nombre,int reiting)
    {
        this.id=id;
        this.foto=foto;
        this.nombre=nombre;
        this.raiting=reiting;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRaiting() {
        return raiting;
    }

    public void setRaiting(int raiting) {
        this.raiting = raiting;
    }
}
