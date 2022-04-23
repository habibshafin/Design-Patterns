public class Mp4Player implements AdvancedMediaPlayer{

    @Override
    public void playVlc(MusicFile musicFile){
        //do nothing
    }

    @Override
    public void playMp4(MusicFile musicFile) {
        System.out.println("Playing mp4 file. Name: "+musicFile.getName()+ "\t"+musicFile.getType()+"\t"+musicFile.getSize()+" mb\t"+musicFile.getDuration()+" min" );
    }

    @Override
    public void playFlv(MusicFile musicFile) {
        //do nothing
    }
}
