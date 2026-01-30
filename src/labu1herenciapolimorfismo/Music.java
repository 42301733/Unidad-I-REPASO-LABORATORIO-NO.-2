/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labu1herenciapolimorfismo;

/**
 *
 * @author alopezorozco
 */
// TODO 15: Haz que Music herede de Media
public class Music extends Media{
    // TODO 16: Crea un campo privado de tipo String llamado genre (género)
private String genre;
    
    // TODO 17: Crea los getter y setter para el campo anterior
  public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    // TODO 18: Crea el constructor con los parámetros title, creator y genre
    // pasa los parámetros a la superclase utilizando super
    // y asigna el valor del parámetro genre al campo correspondiente utilizando
    // su setter
  public Music(String genre, String titulo, String autor) {
        super(titulo, autor);
        this.genre = genre;
    }
    // TODO 19: Es tiempo de aplicar el polimorfismo
    // Sobreescribe el métod play() haciendo que imprima el siguiente
    // mensaje:
    // System.out.println("Listening to " + getTitle() + " by " + getCreator() + " in the " + genre +" genre.");
    // No olvides especificar la notación @Override
@Override
public void play(){
    System.out.println("Listening to " + getTitulo() + " by " + getAutor() + " in the " + genre +" genre.");
}
}

