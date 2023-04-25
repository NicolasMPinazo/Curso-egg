/*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.*/




package com.mycompany.poo.Entidades;

import java.util.Scanner;

public class Libro {

    private Integer ISBN;
    private String titulo;
    private String autor;
    private Integer numeropaginas;
    private Scanner scanner = new Scanner(System.in);

    public Libro() {
    }

    public Libro(Integer ISBN, String titulo, String autor, Integer numeropaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeropaginas = numeropaginas;
    }

    public Integer getISBN() {
        return ISBN;
    }

    public void setISBN(Integer ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNumeropaginas() {
        return numeropaginas;
    }

    public void setNumeropaginas(Integer numeropaginas) {
        this.numeropaginas = numeropaginas;
    }


    public Libro crearLibro() {

        Libro libro = new Libro();

        System.out.println("ISBN: ");
        setISBN(scanner.nextInt());
        System.out.println("Titulo: ");
        setTitulo(scanner.next());
        System.out.println("Autor: ");
        setAutor(scanner.next());
        System.out.println("Numero de paginas: ");
        setNumeropaginas(scanner.nextInt());
        return libro;

    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN= " + ISBN + ", titulo= " + titulo + ", autor= " + autor + ", numeropaginas= " + numeropaginas + '}';
    }
    
    

}
