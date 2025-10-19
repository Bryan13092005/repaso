import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner datos=new Scanner(System.in);
        int max=1000;
        Artista[] artistas=new Artista[max];
        Cancion[] canciones=new Cancion[max];

        artistas[0]=new Artista("Daddy Yankee",1000000,"m","REggaeton");
        artistas[1]=new Artista();
        canciones [0]=new Cancion("LLAmado de Emergencia","3:15",1000);
        canciones [1]=new Cancion();
        int cantidadArtistas=2;
        int cantidadCanciones=2;
        do {
            System.out.print("\nMENU\n" +
                    "1. REGISTRAR ARTISTA\n" +
                    "2. REGISTRAR CANCION\n" +
                    "3. AUMENTAR SEGUIDORES\n" +
                    "4. REPRODUCIR CANCION\n" +
                    "5. MOSTRAR INFORMACION ARTISTA\n" +
                    "6. SALIR\n" +
                    "Ingresa una opcion: ");
            int opcion= datos.nextInt();
            datos.nextLine();
            switch (opcion){
                    case 1:
                    artistas[cantidadArtistas]=new Artista();
                    System.out.print("Ingresa el nombre del artista: ");
                    String nombre=datos.nextLine();
                    artistas[cantidadArtistas].setNombre(nombre);
                    System.out.print("Ingresa 'M' masculino o 'F' femenino: ");
                    String generoA=datos.nextLine();
                    artistas[cantidadArtistas].setGeneroArtista(generoA);
                    System.out.print("Ingresa el genero musical de "+nombre+": ");
                    String generoM=datos.nextLine();
                    artistas[cantidadArtistas].setGeneroMusical(generoM);
                    System.out.print("Ingresa la cantidad de seguidores: ");
                    String seguidores=datos.nextLine();
                    artistas[cantidadArtistas].setSeguidores(seguidores);
                    cantidadArtistas++;
                    break;
                case 2:
                    canciones[cantidadCanciones]=new Cancion();
                    System.out.print("Ingresa el titulo de la cancion: ");
                    String titulo=datos.nextLine();
                    canciones[cantidadCanciones].setTitulo(titulo);
                    System.out.print("Ingresa la duracion en formato (min:seg): ");
                    String duracion=datos.nextLine();
                    canciones[cantidadCanciones].setDuracion(duracion);
                    System.out.print("Ingresa la cantidad de reproducciones: ");
                    String reproducciones= datos.nextLine();
                    canciones[cantidadCanciones].setReproducciones(reproducciones);
                    cantidadCanciones++;
                    break;
                case 3:
                    for (int i = 0; i < cantidadArtistas; i++) {
                        System.out.println((i+1)+".- "+artistas[i].getNombre());
                    }
                    System.out.print("Ingrese el numero del artista que desea aumentar seguidores: ");
                    int artista= datos.nextInt();
                    if(artista>cantidadArtistas){
                        System.out.println("Cantidad incorrecta");
                        break;
                    }
                    System.out.print("Ingrese la cantidad de nuevos seguidores: ");
                    int seguidoresNuevos=datos.nextInt();
                    datos.nextLine();
                    artistas[artista-1].ganarSeguidores(seguidoresNuevos);
                    break;
                case 4:
                    for (int i = 0; i < cantidadCanciones; i++) {
                        System.out.println((i+1)+".- "+canciones[i].getTitulo());
                    }
                    System.out.print("Ingrese el numero del artista que desea aumentar seguidores: ");
                    int cancionReproducida= datos.nextInt();
                    if(cancionReproducida>cantidadCanciones){
                        System.out.println("Cantidad incorrecta");
                        break;
                    }
                    System.out.print("Reproduciendo "+canciones[cancionReproducida-1].getTitulo());
                    canciones[cancionReproducida-1].reproducir();
                    break;
                case 5:
                    for (int i = 0; i < cantidadArtistas; i++) {
                        System.out.println((i+1)+".- "+artistas[i].getNombre());
                    }
                    System.out.print("Ingrese el numero del artista del que desea la informacion: ");
                    int artistaElegido= datos.nextInt();
                    datos.nextLine();
                    if(artistaElegido>cantidadArtistas){
                        System.out.println("Cantidad incorrecta");
                        break;
                    }
                    System.out.println("-----------INFORMACION-----------");
                    System.out.println("NOMBRE ARTISTA: "+artistas[artistaElegido-1].getNombre());
                    System.out.println("GENERO ARTISTA: "+(artistas[artistaElegido-1].getGeneroArtista()=='M' ? "MASCULINO":"FEMENINO"));
                    System.out.println("SEGUIDORES: "+artistas[artistaElegido-1].getSeguidores());
                    System.out.println("GENERO MUSICAL: "+artistas[artistaElegido-1].getGeneroMusical());
                    break;
                case 6:
                    System.out.println("SALIENDO----------");
                    datos.close();
                    return;
                default:
                    System.out.println("Ingresa una opcion valida");
            }

        }while (true);
    }
}