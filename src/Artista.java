public class Artista {
    private String nombre, generoMusical;
    int seguidores;
    char generoArtista;

    public Artista(String nombre,int seguidores, String generoArtistaString,String generoMusical){
        this.generoArtista=generoArtistaString.toUpperCase().charAt(0);
        this.generoMusical=generoMusical.toUpperCase();
        this.nombre=nombre.toUpperCase();
        this.seguidores=seguidores;
    }
    public Artista(){
        nombre="DY";
        generoArtista='M';
        generoMusical="URBANO";
        seguidores=40500000;
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
        return (generoArtista);
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
            this.generoMusical = generoMusical.toUpperCase();
        }
    }

    public int getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(String seguidores) {
        if(seguidores.trim().isEmpty()){
            System.out.println("DEBES AGREGAR EL NUMERO DE SEGUIDORES");
        }else {
            try {
                int numSeguidores=Integer.parseInt(seguidores);
                if(numSeguidores<0){
                    System.out.println("EL NUMERO DE SEGUIDORES DEBE SER MAYOR A 0");
                }else{
                    this.seguidores = numSeguidores;
                }
            } catch (NumberFormatException e) {
                System.out.println("INGRESA UN NUMEMRO VALIDO");
            }
        }
    }

    public void ganarSeguidores(int cantidad){
        if (cantidad>0){
            seguidores+=cantidad;
        }else{
            System.out.println("NO PODEMOS SUMAR SEGUIDORES NEGATIVOS");
        }
    }
}
