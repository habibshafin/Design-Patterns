import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RegularUser implements User {
    String previousState;
    String service;
    public RegularUser(){
        service = "server";
        previousState = "operational";
    }
    @Override
    public void update(String state) throws IOException {
        if(previousState.equalsIgnoreCase("operational")&& state.equalsIgnoreCase("partially down")){
            previousState = "partially down";
            System.out.println("Regular User: ");
            System.out.println("Server partailly down. 1. use DEF server @ 20$ per hour 2. continue current pack");
            BufferedReader st = new BufferedReader(new InputStreamReader(System.in));
            int serviceSetter = Integer.parseInt(st.readLine());
            if(serviceSetter==1){
                service = "def";
                System.out.println("Using DEF server at 20$ per hour");
            }else if (serviceSetter==2){
                System.out.println("continue current package");
            }else System.out.println("Invalid input");
        }else if(previousState.equalsIgnoreCase("operational")&& state.equalsIgnoreCase("fully down")){
            previousState = "fully down";
            System.out.println("Regular User: ");
            System.out.println("Server partailly down. 1. use DEF server @ 20$ per hour");
            BufferedReader st = new BufferedReader(new InputStreamReader(System.in));
            int serviceSetter = Integer.parseInt(st.readLine());
            if(serviceSetter==1){
                service = "def";
                System.out.println("Using DEF server at 20$ per hour");
            }else System.out.println("Invalid input");
        }else if (previousState.equalsIgnoreCase("partially down")&& state.equalsIgnoreCase("fully down")){
            previousState = "fully down";
            System.out.println("Regular User: ");
            System.out.println("partial down to fully down");
        }else if (previousState.equalsIgnoreCase("partially down")&& state.equalsIgnoreCase("operational")){
            previousState = "operational";
            System.out.println("Regular User: ");
            System.out.println("partially down to Operational");
            //if was paying show bill
            if(service.equalsIgnoreCase("def")) {
                service = "server";
                System.out.println("The bill for using DEF server is X");
            }
        }else if(previousState.equalsIgnoreCase("fully down")&& state.equalsIgnoreCase("operational")){
            previousState = "operational";
            System.out.println("Regular User: ");
            System.out.println("fully down to Operational");
            //if paying show bill
            if(service.equalsIgnoreCase("def")) {
                service = "server";
                System.out.println("The bill for using DEF server is X");
            }
        }else if(previousState.equalsIgnoreCase("fully down")&& state.equalsIgnoreCase("partially down")){
            previousState = "partially down";
            System.out.println("Regular User: ");
            System.out.println("fully down to partially down");
        }
    }
}
