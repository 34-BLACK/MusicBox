public class PlaySongs {
    public void playSong(String songID, char premium, int ads) {
        switch(premium){
            case 'Y':
            System.out.println("This is a premium song. Please buy it to play without the ads");
            playAd(ads, premium);
            break;
            case 'N':
            System.out.println("Thank you for choosing this song. Hope you enjoy listening to it.");
            playAd(ads, premium);
            break;
        }
    }

    private void playAd(int ads, char premium) {
        if (ads == 1) {
            System.out.println("Playing Ad 1");
        }
        else {
            for(int i=1; i<=ads; i++){
                System.out.println("Playing Ad " + i);
            }
        }
        
    }
}
