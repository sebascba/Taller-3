public class App {
    
    public static void main (String [ ] Args) {

        Song song1 = new Song("in Da' club", "9761r", "20/05/2022", 130 , "Hip-hop", "cover", "description");
        Song song2 = new Song("rockstar", "3118r", "13/07/2021", 320 , "trap", "cover", "description");
        Song song3 = new Song("See you again", "0759r", "12/11/2020", 120 , "pop", "cover", "description");
        Library library = new Library();
        library.addSongs(song1);
        library.addSongs(song2);
        library.addSongs(song3);
        System.out.println(library);
        System.out.println(library.filterByGenre("pop"));
        System.out.println(library.filterByYear("2020"));
        
    }
}
