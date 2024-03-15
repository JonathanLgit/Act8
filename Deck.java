import java.util.LinkedList;
import java.util.Random;

public class Deck {

    LinkedList<String> baraja = new LinkedList<String>();

    public Deck(){
    }

    Card card = new Card();

    public void crearBaraja(){
        String[] palo = card.getPalo();
        String[] color = card.getColor();
        String[] valor = card.getValor();

        String carta;
        int iterar = 0;
        int cambiarColor = 0;

        for (int i = 0; i< palo.length;i++){
            for (int j = 0; j<valor.length; j++){
                iterar++;
                if (iterar>=27){
                    cambiarColor = 1;
                }
                carta = "{ " + palo[i] + " }" + ", " + "{ " + color[cambiarColor] + " }" + ", " + "{ " + valor[i] + " }";
                baraja.add(carta);
            }
        }
    }

    public void shuffle(){
        System.out.println("Se mezclo el deck");
    }

    public void head(){
        try {
            System.out.println("Su carta es: ");
            System.out.println(baraja.getFirst());
            baraja.removeFirst();
        }catch (Exception e){
            System.out.println("Se acabaron las cartas");
        }
        System.out.println("Quedan " + baraja.size() + " cartas");
    }

    public void pick(){
        Random random = new Random();
        int aleatorio = (int)(random.nextDouble()* baraja.size());

        try {
            System.out.println("Su carta es: ");
            System.out.println(baraja.get(aleatorio));
            baraja.remove(aleatorio);
        }catch (Exception e){
            System.out.println("Se acabaron las cartas");
        }
        System.out.println("Quedan " + baraja.size() + " cartas");
    }

    public void hand(){
        String[] misCartas = new String[5];
        int aleatorio = 0;
        Random random = new Random();

        for (int i = 0; i < misCartas.length; i++) {
            aleatorio =(int) (random.nextDouble()*baraja.size());
            try {
                misCartas[i] = baraja.get(aleatorio);
                baraja.remove(aleatorio);
            }catch (Exception e){
                System.out.println("Se acabaron las cartas");
            }
        }

        for (String cartas: misCartas) {
            System.out.println(cartas);
        }

        System.out.println("Quedan " + baraja.size() + " cartas");
    }

}
