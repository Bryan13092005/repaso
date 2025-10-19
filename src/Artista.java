public class Artista {
    private String nombre, generoMusical,seguidores;
    char generoArtista;

    public Artista(String nombre,String seguidores, char generoArtista,String generoMusical){
        this.generoArtista=generoArtista;
        this.generoMusical=generoMusical;
        this.nombre=nombre;
        this.seguidores=seguidores;
    }
    public Artista(){
        nombre="DY";
        generoArtista='M';
        generoMusical="URBANO";
        seguidores="40,5 millones";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.trim().isEmpty()){
            System.out.println("EL NOMBRE NO PUEDE ESTAR VACIO");
        }else {
            this.nombre = nombre.toUpperCase();
        }
    }

    public char getGeneroArtista() {
        return generoArtista;
    }

    public void setGeneroArtista(String generoArtistaString) {
        if (generoArtistaString.trim().isEmpty()){
            System.out.println("EL GENERO DEL ARTISTA NO PUEDE ESTAR VACIO");
        }else if(generoArtistaString.length()>1) {
            System.out.println("EL GENERO DEL ARTISTA NO PUEDE TENER MAS DE UNA LETRA (M o F)");
        }else{
            this.generoArtista = generoArtistaString.toUpperCase().charAt(0);
        }
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        if (generoMusical.trim().isEmpty()){
            System.out.println("EL GENERO MUSICAL NO DEBE ESTAR VACIO");
        }else {
            this.generoMusical = generoMusical;
        }
    }

    public String getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(String seguidores) {
        if(seguidores.trim().isEmpty()){
            System.out.println("DEBES AGREGAR EL NUMERO DE EGUIDORES");
        }else {
            this.seguidores = seguidores;
        }
    }
}
