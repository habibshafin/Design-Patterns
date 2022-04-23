public class Player implements Mp3Player {
    MediaAdapter mediaAdapter;

    @Override
    public void play(MusicFile musicFile) {

        //inbuilt support to play mp3 music files
        if(musicFile.getType().equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: "+musicFile.getName()+ "\t"+musicFile.getType()+"\t"+musicFile.getSize()+" mb\t"+musicFile.getDuration()+" min" );
        }

        //mediaAdapter is providing support to play other file formats
        else if(musicFile.getType().equalsIgnoreCase("vlc") || musicFile.getType().equalsIgnoreCase("mp4")||musicFile.getType().equalsIgnoreCase("flv")){
            mediaAdapter = new MediaAdapter(musicFile);
            mediaAdapter.play(musicFile);
        }

        else{
            System.out.println("Invalid media. " + musicFile.getType() + " format not supported");
        }
    }
}