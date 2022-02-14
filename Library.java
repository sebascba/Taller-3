import java.util.ArrayList;
import java.util.stream.Collectors;
import java.lang.String;
public class Library {

    protected ArrayList<Song> songs;
    /**
     * Crea una instancia de la clase Library.
     */
    public Library() {
        this.songs = new ArrayList<Song> ();
    }
    /**
     * Permite agregar cansiones a la biblioteca.
     * @param song Agrega un objeto Song a la lista.
     */
    public void addSongs(Song song){
        this.songs.add(song);
    }
    /**
     * Permite filtrar la biblioteca  por genero.
     * @param genre Genero de la cansión.
     * @return El ArrayList de cansiones con las cansiones ya filtradas por genero.
     */
    public ArrayList<Song> filterByGenre(String genre){
        ArrayList <Song> filteredSongs = new ArrayList <Song> (songs.stream().filter((item) -> item.getGenre() == genre).collect(Collectors.toList()));
        return filteredSongs;  
    }
    /**
     * Permite filtrar la biblioteca de cansiones por año de lanzamiento.
     * @param year año de lanzamiento de la cansion
     * @return El ArrayList de cansiones con las cansiones ya filtradas por año.
     */
    public ArrayList<Song> filterByYear(String year){
        ArrayList <Song> filteredYear = new ArrayList <Song> (songs.stream().filter((item) -> item.getDate().contains(year)).collect(Collectors.toList()));
        return filteredYear;
    }
    /**
     * Convierte un objeto en String.
     */
    @Override
    public String toString() {
        return "Library [songs=" + songs + "]";
    }

    

}
