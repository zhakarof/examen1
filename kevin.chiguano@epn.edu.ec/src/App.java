public class App {
    private StringBuilder progress;

    //Tiene las propiedades para inicializar la barra de progreso
    public App() {
        init();
    }

    /**
     * llama cada vez que la barra de progreso necesita ser actualizada.
     *
     * @param done representa el trabajo que lleva echo hasa ese momento
     * @param total repesenta el trabajo total
     */
    public void update(int done, int total) { //declaracion de variables que se usaran
        char[] workchars = {'|', '/', '-', '\\'}; // cadena de characteres que se utilizara
        String format = "\r%3d%% %s %c"; //es el formato en que cada caracter se va a imprimir

        int percent = (++done * 100) / total; // se obtiene el porcentaje
        int extrachars = (percent /4) - this.progress.length(); //porcentaje en relacion a la cadeca de chars
        
        while (extrachars-- > 0) {
            
            progress.append('o'); // remplaza la los char |/-\ por un O
            System.out.println("");//espacio en blanco para la siguiente linea

        }
        
        System.out.printf(format, percent, progress,    //imprime el formato el porcentaje y el progreso
         workchars[done % workchars.length]);

        if (done == total) {
            System.out.flush();
            System.out.println();
            init();
        }     
    }
    private void init() {
        this.progress = new StringBuilder(60);  //capacidad del numero de caracteres
    }
}