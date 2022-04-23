public class MediaAdapter implements Mp3Player {

    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(MusicFile musicFile){
        if(musicFile.getType().equalsIgnoreCase("vlc") ){
            advancedMusicPlayer = new VlcPlayer();
        }else if (musicFile.getType().equalsIgnoreCase("mp4")){
            advancedMusicPlayer = new Mp4Player();
        }else if (musicFile.getType().equalsIgnoreCase("flv")){
            advancedMusicPlayer = new FlvPlayer();
        }
    }

    @Override
    public void play(MusicFile musicFile) {
        if(musicFile.getType().equalsIgnoreCase("vlc")){
            advancedMusicPlayer.playVlc(musicFile);
        }else if(musicFile.getType().equalsIgnoreCase("mp4")){
            advancedMusicPlayer.playMp4(musicFile);
        }else if(musicFile.getType().equalsIgnoreCase("flv")){
            advancedMusicPlayer.playFlv(musicFile);
        }
    }
}