public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(MusicFile musicFile) {
        System.out.println("Playing Vlc file. Name: "+musicFile.getName()+ "\t"+musicFile.getType()+"\t"+musicFile.getSize()+" mb\t"+musicFile.getDuration()+" min" );
    }

    @Override
    public void playMp4(MusicFile musicFile) {
        //do nothing
    }

    @Override
    public void playFlv(MusicFile musicFile) {
        //do nothing
    }
}
