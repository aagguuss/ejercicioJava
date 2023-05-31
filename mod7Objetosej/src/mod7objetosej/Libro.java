/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod7objetosej;

/**
 * Crear una clase llamada Libro que contenga los siguientes atributos: ISBN,
 * Título, Autor, Número de páginas, y un constructor con todos los atributos
 * pasados por parámetro y un constructor vacío. Crear un método para cargar un
 * libro pidiendo los datos al usuario y luego informar mediante otro método el
 * número de ISBN, el título, el autor del libro y el número de páginas.
 *
 * @author agust
 */
public class Libro {

    public int ISBN;

    public String titulo;
    public String autor;
    public int numeroPaginas;

    public Libro() {
    }

    public Libro( int ISBN,int numeroPaginas,String titulo, String autor) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "NUmero ISBN:" + ISBN + "  Titulo:" + titulo + "  Autor : " + autor + "  Numero de paginas :" + numeroPaginas;
    }

}
