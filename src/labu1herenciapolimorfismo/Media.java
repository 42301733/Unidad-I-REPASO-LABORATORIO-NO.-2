/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labu1herenciapolimorfismo;

/**
 *
 * @author alopezorozco
 */
public class Media {
    // TODO 1: Crea los campos titulo y autor de tipo String
    // y privados
private String titulo;
private String autor;
    
    // TODO 2: Crea los getter y setter para los campos
    /**
     * @return the title
     */
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
    
    // TODO 3: Crea el constructor para inicializar los campos
    // utiliza los métodos setter para establecer sus valores.
    // Recuerda poner este constructor después de la declaración de los campos
public Media(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    
    // TODO 4: Crea un método llamado play(), público de tipo void
    // este método tiene la siguiente instrucción.
    // System.out.println("Playing: " + title + " by " + creator);  
public void play(){
    System.out.println("Playing: " + titulo + " by " + autor); 
}
}
