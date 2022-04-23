import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class shakeshackdemo {
    private static List<Order> orderlist = new ArrayList<Order>();

    public static void main(String[] args)throws IOException {
        System.out.println("O: new order");
        System.out.println("P: print order");
        System.out.println("E: exit order");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        int ordernumber = 0;
        if(s1.equalsIgnoreCase("O")){
            Order order = new Order();

            int exit = 0;

            while(true){
                int wronginput = 0;
                System.out.println("O: new order P: print E: exit order");
                System.out.println("Available shakes:");
                System.out.println("1: chocolate shake  2: vanilla shake 3: strawberry shake 4: coffee shake 5: zero shake ");
                System.out.println("enter the name of shake you want: ");
                BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
                shakeshack shack = new shakeshack();
                String sh = str.readLine();
                shake temp = null;
                if(sh.equalsIgnoreCase("O")){
                    if(exit==0)
                        System.out.println("you can not start a new order");
                    else if(exit ==1)
                    {
                        System.out.println("new order");
                        order = null;
                        order = new Order();
                        exit = 0;
                    }
                    wronginput = 1;
                }else if(sh.equalsIgnoreCase("P")){
                    order.print();
                    wronginput = 1;
                }else if (sh.equalsIgnoreCase("E")){
                    System.out.println("order finished");
                    orderlist.add(order);
                    exit = 1;
                    ordernumber = ordernumber +1;
                    wronginput = 1;
                }
                else {
                    temp  = shack.produce(sh);
                }
                if(wronginput==0){
                    System.out.println("enter the number of extra ingredients you want: ");
                    int n = Integer.parseInt(str.readLine());
                    for(int i=0; i<n; i++){
                    System.out.println("Add extra ingredients:");
                    System.out.println("1: almond milk 2: candy 3: cookie");
                    BufferedReader st = new BufferedReader(new InputStreamReader(System.in));
                    String sh1 = st.readLine();
                        temp.addIngredient(sh1);
                    }
                    order.addShake(temp);
                }
            }
        }
        else if (s1.equalsIgnoreCase("E")){
            System.out.println("didnt start any order");
        }
        else if (s1.equalsIgnoreCase("P")){
            System.out.println("didnt place any order");
        }
    }
}