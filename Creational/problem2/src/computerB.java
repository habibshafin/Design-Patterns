public class computerB implements computer {
    private String resolution;
    private String cpu;
    private String mmu;

    public computerB(){
        resolution = "350 x 250";
        cpu = "intel core i9";
        mmu = "x86-64";
    }
    @Override
    public void computerDetails() {
        System.out.println("computer B");
        System.out.println("resolution : "+ resolution);
        System.out.println("cpu : "+ cpu +"   "+"mmu:  "+ mmu);
    }

    @Override
    public String getResolution() {
        return resolution;
    }
}
