// Given a java program for a music player, complete the code as required ...
// Class Song has instance variables title, artist, genre, duration. 
// It also has a constructor to initialise these instance variables and accessor method to get the values of these instance variables.
// Class MusicPlaylist has three methods: 
//     - isLongDuration(int duration) that checks if the duration of any song is greater than 300 and returns  true, otherwise false
//     - removeLongDurationSongs that takes a LinkedHashMap as input parameter and removes all the long songs in this Map.
//     (HINT: Use an iterator for the entrySet() of the Map)
//     - displayPlaylist that takes a LinkedHashMap as input parameter and prints the elements as required by the output.
// Input Test Case1:
// Ordinary_Person Anirudh 185 Tamil
// Shape_Of_You Ed_Sheeran 345 English
// Mehram Sachet 286 Hindi
// Ek_Tarfa Darshan_Raval 368 Hindi
// Thalli_Pogadhey ArRahman 256 Tamil
// Output :
// Playlist after removing long duration songs:
// ID: 1, Title: Ordinary_Person, Artist: Anirudh, Duration: 185s, Genre: Tamil
// ID: 3, Title: Mehram, Artist: Sachet, Duration: 286s, Genre: Hindi
// ID: 5, Title: Thalli_Pogadhey, Artist: ArRahman, Duration: 256s, Genre: Tamil


import java.util.*;

class MusicPlaylist 
{
    public boolean isLongDuration(int duration) 
    {
        return duration > 300; 
    }

    public void removeLongDurationSongs(LinkedHashMap<Integer,Song> playlist)
    {
        Iterator<Map.Entry<Integer,Song>> iterator = playlist.entrySet().iterator();
        while(iterator.hasNext())
        {
            Map.Entry<Integer,Song> entry = iterator.next();
            if(isLongDuration(entry.getValue().getDuration()))
            {
                iterator.remove();
            }
        }
    }

    public void displayPlaylist(Map<Integer,Song> playlist)
    {
        for(Map.Entry<Integer,Song> entry : playlist.entrySet())
        {
            System.out.println("ID : " + entry + " " + entry.getValue());
        }
    }
}

class Song 
{
    private String title;
    private String artist;
    private int duration;
    private String genre;

    public Song(String title, String artist, int duration, String genre) 
    {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.genre = genre;
    }

    public String getTitle() 
    {
        return this.title;
    }

    public String getArtist() 
    {
        return this.artist;
    }

    public int getDuration() 
    {
        return this.duration;
    }

    public String getGenre() 
    {
        return this.genre;
    }

    @Override
    public String toString() 
    {
        return "Title: " + this.title + ", Artist: " + this.artist + ", Duration: " + this.duration + "s, Genre: " + this.genre;
    }
}

public class p64MusicPlayer 
{
    public static void main(String[] args) 
    {
        LinkedHashMap<Integer, Song> playlist = new LinkedHashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter details for 5 songs (Title, Artist, Duration (seconds), Genre):");
        for (int i = 1; i <= 5; i++) 
        {
            System.out.print("Song " + i + ": ");
            String title = scanner.next();
            String artist = scanner.next();
            int duration = scanner.nextInt();
            String genre = scanner.next();
            playlist.put(i, new Song(title, artist, duration, genre));
        }
        MusicPlaylist musicPlayer = new MusicPlaylist();
        musicPlayer.removeLongDurationSongs(playlist);
        System.out.println("\nPlaylist after removing long duration songs:");
        musicPlayer.displayPlaylist(playlist);
    }
}