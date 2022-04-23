public class computerC implements computer {
    private String resolution;
    private String cpu;
    private String mmu;

    public computerC(){
        resolution = "550 x 430";
        cpu = "intel core i9";
        mmu = "x86-64";
    }
    @Override
    public void computerDetails() {
        System.out.println("computer C");
        System.out.println("resolution : "+ resolution);
        System.out.println("cpu : "+ cpu +"   "+"mmu:  "+ mmu);
    }

    @Override
    public String getResolution() {
        return resolution;
    }
}
