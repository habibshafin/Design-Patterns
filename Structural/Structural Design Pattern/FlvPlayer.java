public class FlvPlayer implements AdvancedMediaPlayer  {
    @Override
    public void playVlc(MusicFile musicFile) {
        //do nothing
    }

    @Override
    public void playMp4(MusicFile musicFile) {
        //do nothing
    }

    @Override
    public void playFlv(MusicFile musicFile) {
        System.out.println("Playing Flv file. Name: "+musicFile.getName()+ "\t"+musicFile.getType()+"\t"+musicFile.getSize()+" mb\t"+musicFile.getDuration()+" min" );
    }
}
