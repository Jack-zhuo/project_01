public class date21 {
    public static void main(String[] args) {
      toBinary(255);

    }

    public static void toBinary(int n){
        String s = "";
        for (int i = n; i > 0; i = i/2) {
            s = i%2 + s;
        }
        System.out.println(s);
    }
}
