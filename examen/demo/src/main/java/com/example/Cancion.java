package com.example;

public class Cancion {

    //Definición de los atributos
    private String titulo;
    private String artista;
    private int duracion;
    private String genero;
    private String album;

    //Constante estática
    public static final int SEGUNDOS_POR_MINUTO = 60;

    //constructor por defecto
    public Cancion(){
        this.titulo = "Desconocido";
        this.artista = "Desconocido";
        this.duracion = 0;
        this.genero = "Desconocido";
        this.album = "Desconocido";
    }

    //Constructor completo
    public Cancion(String titulo, String artista, int duracion){
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
    }

    //Getters y Setters
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getArtista(){
        return artista;
    }
    public void setArtista(String artista){
        this.artista = artista;
    }

    public int getDuracion(){
        return duracion;
    }
    public void setDuracion(int duracion){
        this.duracion = duracion;
    }

    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }

    public String getAlbum(){
        return album;
    }
    public void setAlbum(String album){
        this.album = album;
    }

    //Método mostrar info
    public void mostrarInformacion(){
        System.out.println("Título canción: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Duración: " + duracion);
        System.out.println("Género: " + genero);
        System.out.println("Álbum: " + album);
    }

    //Método mostrar info + usuario
    public void mostrarInformacion(String usu){
        System.out.println("Título canción: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Duración: " + duracion);
        System.out.println("Género: " + genero);
        System.out.println("Álbum: " + album);
        System.out.println("Usuario escuchando actualmente: " + usu);
    }

   

   
}