public class Main {
    public static void main(String[] args){

        Deck deck = new Deck();
        //Card card = new Card();

        deck.crearBaraja();

        System.out.println(" ");
        deck.shuffle();
        System.out.println("--");
        deck.head();
        System.out.println("--");
        deck.pick();
        System.out.println("--");
        deck.hand();
    }
}
