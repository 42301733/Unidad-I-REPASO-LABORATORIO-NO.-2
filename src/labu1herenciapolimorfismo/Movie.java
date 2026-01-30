/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labu1herenciapolimorfismo;

/**
 *
 * @author alopezorozco
 */
// TODO 10: La clase Movie hereda de Media, realiza esta implementación
public class Movie extends Media{
    // TODO 11: Agrega el atributo durationInMinuts
    // de tipo entero y privado
 private int durationInMinuts;

    // TODO 12: Agrega los getter y setter para el campo anterior
    // Recuerda dar clic derecho Refactor --> Encapsulate Fields 
    // para agregarlos
     public int getDurationInMinuts() {
        return durationInMinuts;
    }

    public void setDurationInMinuts(int durationInMinuts) {
        this.durationInMinuts = durationInMinuts;
    }
    
    // TODO 13: Crea el constructor con tres parámetros
    // title, creator y durationInMinuts
    // usa super para pasarlos a la superclase y asigna
    // el parámetro durationInMinutes al campo correspondiente
    // Utiliza el setter del campo para asignarle su valor
    public Movie(int durationInMinuts, String titulo, String autor) {
        super(titulo, autor);
        this.durationInMinuts = durationInMinuts;
    }
    
    // TODO 14: Sobreescribe el método play() de la superclase
    // El método debe de mostrar el siguiente mensaje
    // System.out.println("Watching " + getTitle() + " directed by " + getCreator() + ", Duration: " + durationInMinutes + " minutes"); 
    // No olvides especificar la notación @Override    
 @Override
 public void play(){
 System.out.println("Watching " + getTitulo() + " directed by " + getAutor() + ", Duration: " + durationInMinuts + " minutes");
}
}

