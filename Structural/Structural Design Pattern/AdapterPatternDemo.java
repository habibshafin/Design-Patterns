import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class AdapterPatternDemo {

    public static void main(String[] args) throws IOException {

    	AudioPlayer audioPlayer = new AudioPlayer();
		while(true){
			System.out.println("1: Enter a new playlist 2: Add a song to current playlist");
			BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
			String st = str.readLine();
			int choice = Integer.parseInt(st);

			if(choice == 1 ){
				System.out.println("Enter the elapsed time in minutes");
				int elapsedtime = Integer.parseInt(str.readLine());
				ArrayList<MusicFile> playlist = new ArrayList<>();
				System.out.println("Enter the number of songs you want to add");
				int num = Integer.parseInt(str.readLine());
				for(int i =0; i<num ; i++){
					System.out.println("Enter the name of the song");
					String name = str.readLine();
					System.out.println("Enter the type of the song");
					String type = str.readLine();
					System.out.println("Enter the size of the song in mb");
					Double size = Double.parseDouble( str.readLine());
					System.out.println("Enter the duration of the song in minutes");
					Double duration = Double.parseDouble(str.readLine());
					playlist.add(new MusicFile(name,type,size,duration));
				}
				audioPlayer.addPlayList(elapsedtime,playlist);
				audioPlayer.play();
			}
			else if (choice==2){
				if(audioPlayer.playlist.size()==0)
					System.out.println("No playlists created yet");
				else {
					System.out.println("Enter the name of the song");
					String name = str.readLine();
					System.out.println("Enter the type of the song");
					String type = str.readLine();
					System.out.println("Enter the size of the song in mb");
					Double size = Double.parseDouble(str.readLine());
					System.out.println("Enter the duration of the song in minutes");
					Double duration = Double.parseDouble(str.readLine());
					audioPlayer.addSong(new MusicFile(name, type, size, duration));
					audioPlayer.play();
					System.out.println();
				}
			}else{
				System.out.println("Invalid Choice");
			}
		}
    }
}
