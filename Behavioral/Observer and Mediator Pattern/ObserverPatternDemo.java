import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ObserverPatternDemo {
    public static void main(String[] args) throws IOException {
        Server server = new Server();
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        PremiumUser premiumUser = new PremiumUser();
        RegularUser regularUser = new RegularUser();
        server.addUsers(premiumUser);
        server.addUsers(regularUser);
        while (true){
            System.out.println();
            System.out.println("Current State : "+server.getState());
            if(server.getState().equalsIgnoreCase("operational")){
                System.out.println("1. partially down 2. fully down");
                int choice = Integer.parseInt(str.readLine());
                if(choice==1){
                    server.setState("partially down");
                }else if (choice==2){
                    server.setState("fully down");
                }else{ System.out.println("Invalid Input"); }
            }else if(server.getState().equalsIgnoreCase("partially down")){
                System.out.println("1. operational 2. fully down");
                int choice = Integer.parseInt(str.readLine());
                if(choice==1){
                    server.setState("operational");
                }else if (choice==2){
                    server.setState("fully down");
                }else{ System.out.println("Invalid Input"); }
            }else if(server.getState().equalsIgnoreCase("fully down")){
                System.out.println("1. operational 2. partially down");
                int choice = Integer.parseInt(str.readLine());
                if(choice==1){
                    server.setState("operational");
                }else if (choice==2){
                    server.setState("partially down");
                }else{ System.out.println("Invalid Input"); }
            }
        }
    }
}
