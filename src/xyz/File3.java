package xyz;

public class File3 {
    public static void main(String[] args) {
        String[] wanafunzi;
        String output;
        wanafunzi = new String[5];
        wanafunzi[0] =  "Fries";
        wanafunzi[1] = "wanyoike";
        wanafunzi[2] = "Gambit";
        wanafunzi[3] = "Logan";
        wanafunzi[4] =  "Nexus";

        {
            output = wanafunzi [0]+       wanafunzi[3]+
                    wanafunzi   [2]+       wanafunzi[4]+;
        }
        System.out.println(output);
    }
}
