import java.io.IOException; // imporacion de libreria

public class progressbar{ //clase principal

    public static void main(String[] args) throws IOException, InterruptedException 
    {
        App bar = new App(); //llama la clase de App y la actualiza constantemente

        bar.update(0, 1000); //actualiza los datos de la barra de progreso
        for(int i=0;i<1000;i++) {
                        //los siguientes for se encargan de darle velocidad de carga a la barra de progreso
            for(int j=0;j<10000;j++)
                for(int p=0;p<1000;p++);
            // actualiza el progreso de la barra
            bar.update(i, 1000);
            System.out.printf("\t");
            
        }
        showProgressbar_e(1000);
        ///
    }
    //barra de nombre
    public static void showProgressbar_e(int porcen) throws IOException, InterruptedException
    {
        String namebar="Kevin.chiguano@epn.edu.ec"; //declaracion del string con el correo personal
        int tbar=1000;  //tama;o de la barra
        String sb=new String(); //nuevo string
        int nchar=porcen*tbar/100; //formula para determinar el numero de char
        for(int k=0; k<=tbar; k++) //for que se encargara de administrar el numero de chrs y saltar lineas
        {
            sb+=String.format("%s", ((nchar<k) ? "" : "" +namebar.charAt(k))); //etrega un char y salta a la siguiente linea y entrga uno adicional
            System.out.println("\n");
            System.out.write(sb.getBytes());
            Thread.sleep(100);
        }
        
    }
    
    
}
//kevin.chiguano@epn.edu.ec  25
//##### ##### ##### ##### ##### ########
//##### ##### ##### ##### #####