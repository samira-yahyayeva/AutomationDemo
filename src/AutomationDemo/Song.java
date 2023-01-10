package AutomationDemo;

public class Song
{
    private static String title;
    private static String artist;


    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setArtist(String artist)
    {
        this.artist = artist;
    }

    public void play() throws InterruptedException
    {
        SoundPlayer.playSound(artist, title);
    }

    public void playAgain() throws InterruptedException
    {
        SoundPlayer.playSound(artist, title);
    }
}
