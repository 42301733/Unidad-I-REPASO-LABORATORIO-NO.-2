/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labu1herenciapolimorfismo;

/**
 *
 * @author Jorge
 */
public class Anime extends Media{
    private int durationInMinutes;

    public Anime(int durationInMinutes, String titulo, String autor) {
        super(titulo, autor);
        this.durationInMinutes = durationInMinutes;
    }
     @Override
 public void play(){
 System.out.println("Watching: " + getTitulo() + " directed by" + getAutor() + " Duration: " + durationInMinutes + " minutes");
}
}
