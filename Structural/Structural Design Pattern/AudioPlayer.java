import java.util.ArrayList;

public class AudioPlayer {
    ArrayList<MusicFile> playlist;
    double playListDuration;
    Player player;

    public AudioPlayer(){
        playListDuration = 0;
        player = new Player();
        playlist = new ArrayList<>();
    }

    public void addSong(MusicFile musicFile){
        playlist.add(musicFile);
        playListDuration = playListDuration + musicFile.getDuration();

    }

    public void play(){
        System.out.println("Current playlist duration "+playListDuration + " min");
        for(MusicFile m : playlist){
            //m.showDetails();
            player.play(m);
        }
    }

    public void ShowCurrentPlaylist(){
        System.out.println("Current playlist duration "+playListDuration + " min");
        for(MusicFile m : playlist){
            m.showDetails();
        }
    }

    public void addPlayList(double elapsedtime, ArrayList<MusicFile> list){
        if(playListDuration>elapsedtime){
            System.out.println("Can not add a playlist now. A playlist is already playing");
        }
        else {
            playlist = list;
            for(int i =0; i<playlist.size(); i++){
                playListDuration = playListDuration + playlist.get(i).getDuration();
            }
        }
    }
}
