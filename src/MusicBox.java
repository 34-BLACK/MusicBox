
public class MusicBox {

    // Variables
    private String songID;
    private char isSongPremium;
    public String songTitle;
    private String songArtists;
    private String songAlbum;
    public String songGenre;
    private String songProducer;
    public String songMusicLabel;

    //Constructor
    public MusicBox(String songID, char premiumSong, String title, String artists, String Album, String genre, String producer, String label) {
        this.songID = songID;
        this.isSongPremium = premiumSong;
        this.songArtists = artists;
        
        // -- TODO
        /* Initialise  the rest of the variables in this Constructor block*/
    }
    
    
    //Methods
    public String getSongID() {
        return songID;
    }

    public String getSongArtists() {
        return songArtists;
    }

    public char getPremiumSong() {
        return isSongPremium;
    }


    // -- TODO
        /* Create the rest of "getters" for the remaining variables */
    
    public void playSong(String songID, char premium) {
        switch(premium){
            case 'Y':
            System.out.println("We apologise, but this is a premium song. You can listen to it after buying it");
            break;
            case 'N':
            System.out.println("Thank you for choosing this song. Hope you enjoy listening to it.");
            playAd();
            break;
        }
    }

    private void playAd() {
        System.out.println("Playing Ad");
    }
}

