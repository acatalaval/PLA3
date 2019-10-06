package id;

public class Main {

	public static void main(String[] args) {
		 Jugador eva = new Jugador("Eva", new Teclado());
         Jugador juan = new Jugador("Juan", new CPU());
         Consola cons = new Consola();
         //Juego ppt = new Juego(eva, juan, new JuegoPPTLS(), cons);
         //cons.mostrar(ppt.jugar());
         Juego ppt = new Juego (eva, juan, new JuegoPPTLS());
         cons.mostrar(ppt.jugar());

	}

}
