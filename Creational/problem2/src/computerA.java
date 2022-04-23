public class computerA implements computer {
    private String resolution;
    private String cpu;
    private String mmu;

    public computerA(){
        resolution = "200 x 200";
        cpu = "intel core i9";
        mmu = "x86-64";
    }
    @Override
    public void computerDetails() {
        System.out.println("computer A");
        System.out.println("resolution : "+ resolution);
        System.out.println("cpu : "+ cpu +"   "+"mmu:  "+ mmu);
    }

    @Override
    public String getResolution() {
        return resolution;
    }
}
