/**
 * Representa una cancion
 * @author jhohan sebastian cordoba.
 */
public class Song {

    private String title;
    private String identifier;
    private String date;
    private float duration;
    private String genre;
    private String cover;
    private String description;
    /**
     * Crea una instancia de la clase Song.
     * @param title Titulo de la cansion.
     * @param identifier Identificador de la cansión.
     * @param date Fecha de lanzamiento de la casión.
     * @param duration Duracion de la cansin.
     * @param genre Genero músical.
     * @param cover Portada de la cansio
     * @param description Descripcion de la cansion.
     */
    public Song(String title, String identifier, String date, float duration, String genre, String cover,
            String description) {
        this.title = title;
        this.identifier = identifier;
        this.date = date;
        this.duration = duration;
        this.genre = genre;
        this.cover = cover;
        this.description = description;
    }

    /**
     * Consigue la fecha de lanzamiento de la cansión.
     * @return la fecha de lanzamiento de la cansión.
     */
    public String getDate() {
        return this.date;
    }
    /**
     * Consigue el genero de la cansión.
     * @return Genero de la cansión.
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Consigue el tïtulo de la cansión.
     * @return El título de la cansión.
     */
    public String getTitle() {
        return title;
    }
    /**
     * Convierte un objeto en String.
     */
    @Override
    public String toString() {
        return "Song [cover=" + cover + ", date=" + date + ", description=" + description + ", duration=" + duration
                + ", genre=" + genre + ", identifier=" + identifier + ", title=" + title + "]";
    }
    
}