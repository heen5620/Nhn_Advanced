package practice;

public class Enviorment {
    public static void main(String[] args) {
        int x = 4; // {(x,4)}
        int y = 5; // {(x,4)(y,5)}


        y = y + x; // y+x {y+x}{(x,4),(y,5)}
                   // {5+x}{x}


        {
            int z = 3;
            int y = 4;
        }
    }
}
