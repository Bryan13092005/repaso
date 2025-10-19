public class Cancion {
    private String titulo,duracion,reproducciones;

    public Cancion(String titulo,String duracion,String reproducciones){
        this.duracion=duracion;
        this.reproducciones=reproducciones;
        this.titulo=titulo;
    }

    public Cancion(){
        titulo="LLAMADO DE EMERGENCIA";
        duracion="3:59 minutos";
        reproducciones="3,14 millones";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if(titulo.trim().isEmpty()){
            System.out.println("EL TITULO NO PUEDE ESTAR VACIO");
        }else{
            this.titulo = titulo;
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

    public String getReproducciones() {
        return reproducciones;
    }

    public void setReproducciones(String reproducciones) {
        if(reproducciones.trim().isEmpty()){
            System.out.println("LA CANTIDAD DE REPRODUCCIONES NO DEBE ESTRA VACIA");
        }else{
            this.reproducciones = reproducciones+" millones";
        }
    }
}
