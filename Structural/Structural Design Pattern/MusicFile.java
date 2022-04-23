public class MusicFile {
    String name;
    String type;
    double size;
    double duration;

    public MusicFile(String name, String type, double size,  double duration){
        this.duration = duration;
        this.name = name;
        this.type = type;
        this.size = size;
    }

    public void showDetails(){
        System.out.println(name + "\t"+ type+"\t"+ size + " mb\t"+ duration+" min" );
    }

    public double getDuration() {
        return duration;
    }

    public String getType() {
        return type;
    }

    public double getSize() {
        return size;
    }

    public String getName() {
        return name;
    }
}
