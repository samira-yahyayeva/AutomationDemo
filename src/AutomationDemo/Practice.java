package AutomationDemo;

public class Practice
{
    public static void main(String[] args) throws InterruptedException
    {
        Song musaev = new Song();
        musaev.setArtist("System of a down");
        musaev.setTitle("holy mountains");
       // musaev.play();

        Song kate = new Song();
        kate.setArtist("Depeche Mode");
        kate.setTitle("enjoy the silence");
        kate.play();

        Song mert = new Song();
        mert.setArtist("Depeche Mode");
        mert.setTitle("enjoy the silence");
        mert.play();

        Song kanza = new Song();
        kanza.setArtist("Depeche Mode");
        kanza.setTitle("enjoy the silence");
        kanza.play();

        Song samira =new Song();
        samira.setTitle("Leather Teeth");
        samira.setArtist("Carpenter Brut");
        samira.play();

    }
}
