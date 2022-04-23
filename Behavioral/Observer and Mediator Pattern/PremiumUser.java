import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PremiumUser implements User {
    String service;
    String previousState;

    public PremiumUser(){
        service = "server";
        previousState = "operational";
    }

    @Override
    public void update(String state) throws IOException {
        System.out.println();
        if(previousState.equalsIgnoreCase("operational")&& state.equalsIgnoreCase("partially down")){
            System.out.println("Premium User: ");
            System.out.println("1.use two servers 2. use DEF server");
            previousState = "partially down";
            ///if 2 is selected set service to both
            BufferedReader st = new BufferedReader(new InputStreamReader(System.in));
            int serviceSetter = Integer.parseInt(st.readLine());
            if(serviceSetter==2) service = "both";
            else if(serviceSetter==1) service = "def";
            else System.out.println("Invalid Input");
        }else if(previousState.equalsIgnoreCase("operational")&& state.equalsIgnoreCase("fully down")){
            previousState = "fully down";
            System.out.println("Premium User: ");
            System.out.println("Service provided only by DEF server");
            service = "def";
        }else if (previousState.equalsIgnoreCase("partially down")&& state.equalsIgnoreCase("fully down")){
            System.out.println("Premium User: ");
            previousState = "fully down";
            service = "def";
            if(service.equalsIgnoreCase("both")){
                System.out.println("Service provided only by DEF server");
            }else System.out.println("Service fully down and provided by DEF server");
        }else if (previousState.equalsIgnoreCase("partially down")&& state.equalsIgnoreCase("operational")){
            previousState = "operational";
            System.out.println("Premium User: ");
            System.out.println("partially down to Operational");
            service ="server";
        }else if(previousState.equalsIgnoreCase("fully down")&& state.equalsIgnoreCase("operational")){
            previousState = "operational";
            System.out.println("Premium User: ");
            System.out.println("fully down to Operational");
            service = "server";
        }else if(previousState.equalsIgnoreCase("fully down")&& state.equalsIgnoreCase("partially down")){
            previousState = "partially down";
            System.out.println("Premium User: ");
            System.out.println("fully down to partially down");
        }
    }
}
