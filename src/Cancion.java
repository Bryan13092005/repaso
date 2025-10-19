public class Cancion {
    private String titulo,duracion;
    private int reproducciones;

    public Cancion(String titulo,String duracion,int reproducciones){
        this.duracion=duracion;
        this.reproducciones=reproducciones;
        this.titulo=titulo.toUpperCase();
    }

    public Cancion(){
        titulo="LLAMADO DE EMERGENCIA";
        duracion="3:59 minutos";
        reproducciones=3140000;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if(titulo.trim().isEmpty()){
            System.out.println("EL TITULO NO PUEDE ESTAR VACIO");
        }else{
            this.titulo = titulo.toUpperCase();
        }
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        if(duracion.trim().isEmpty()){
            System.out.println("LA DURACION NO DEBE ESTRA VACIA");
        }else{
            this.duracion = duracion+" minutos";
        }
    }

    public int getReproducciones() {
        return reproducciones;
    }

    public void setReproducciones(String reproducciones) {
        if(reproducciones.trim().isEmpty()){
            System.out.println("LA CANTIDAD DE REPRODUCCIONES NO DEBE ESTRA VACIA");
        }else{
            try {
                int numReproducciones=Integer.parseInt(reproducciones);
                if(numReproducciones<0){
                    System.out.println("INGRESA UN NUMERO MAYOR A 0");
                }else{
                    this.reproducciones = numReproducciones;
                }
            }catch (NumberFormatException e){
                System.out.println("INGRESA UN NUMERO VALIDO");
            }

        }
    }

    public void reproducir(){
        reproducciones+=1;
    }

}
