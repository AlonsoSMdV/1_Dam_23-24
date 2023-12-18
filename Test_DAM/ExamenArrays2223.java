package Test_DAM;

import java.util.Scanner;

public class ExamenArrays2223 {
  public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ancho = 11;
        Character[][] matriz = new Character[ancho][ancho];
        Character[][] auxiliar = new Character[ancho][ancho];
        int cabezalX = 5;
        int cabezalY = 5;
        char cabezal = 'M';
        int opcionCabezal = 0;
        char opcion = ' ';
        char auxiliarX = ' ';
        boolean salir = false;

        for(int i=0;i<ancho;i++){
            for(int j=0;j<ancho;j++){
                if(i == 0 || j == 0 || i == ancho-1 || j == ancho-1){
                    matriz[i][j]='*';
                }else{
                    matriz[i][j]=' ';
                }
            }
        }

        do{
            
            for(int i = 0; i < ancho; i++){
                for(int j = 0; j < ancho; j++){
                    if(i == cabezalX && j == cabezalY){
                        System.out.print(cabezal+" ");
                    }else{
                        System.out.print(matriz[i][j]+" ");
                    }
                }
                System.out.println();
            }

            System.out.println("a. Izquierda\nd. Derecha \ns. Abajo\nw. Arriba\np. Pintar\nb. Borrar\nm. Mover\nr. Rotar sentido antihorario\ne. Espejo horizontal\nl. Limpiar tablero\nq. Salir");
            opcion = sc.next().charAt(0);

            switch(opcion){

                case 'a':
                    cabezalY--;
                    if(cabezalY == 0){
                        cabezalY++;
                    }

                    if(opcionCabezal == 2){
                        matriz[cabezalX][cabezalY] = ' ';
                    }
                    if(opcionCabezal == 1){
                        matriz[cabezalX][cabezalY] = 'X';
                    }

                break;

                case 'd':

                    cabezalY++;
                    if(cabezalY == 10){
                        cabezalY--;
                    }

                    if(opcionCabezal == 1){
                        matriz[cabezalX][cabezalY] = 'X';
                    }

                    if(opcionCabezal == 2){
                        matriz[cabezalX][cabezalY] = ' ';
                    }


                break;

                case 'w':

                    cabezalX--;
                    if(cabezalX == 0){
                        cabezalX++;
                    }

                    if(opcionCabezal == 1){
                        matriz[cabezalX][cabezalY] = 'X';
                    }

                    if(opcionCabezal == 2){
                        matriz[cabezalX][cabezalY] = ' ';
                    }


                break;

                case 's':

                    cabezalX++;
                    if(cabezalX == 10){
                        cabezalX--;
                    }

                    if(opcionCabezal == 1){
                        matriz[cabezalX][cabezalY] = 'X';
                    }

                    if(opcionCabezal == 2){
                        matriz[cabezalX][cabezalY] = ' ';
                    }

                break;

                
                case 'p':

                    cabezal = 'P';
                    opcionCabezal = 1;
                    matriz[cabezalX][cabezalY] = 'X';
                    
                break;
                    
                case 'b':
                    
                    cabezal = 'B';
                    opcionCabezal = 2;
                    matriz[cabezalX][cabezalY] = ' ';

                break;

                case 'm':

                    cabezal = 'M';
                    opcionCabezal = 0;

                break;

                case 'r':

                    for(int i = 0; i < ancho; i++){
                        for(int j = 0; j < ancho; j++){
            
                            auxiliar[ancho-1-j][i] = matriz[i][j];
                        }
                    }

                    for(int i = 0; i < ancho; i++){
                        for(int j = 0; j < ancho; j++){
            
                            matriz[i][j] = auxiliar[i][j];
                        }
                    }

                break;

                case 'e':
                    
                    for(int i=0;i<ancho;i++){
                        for(int j=0;j<ancho/2;j++){
                            auxiliarX=matriz[i][j];
                            matriz[i][j]=matriz[i][ancho-1-j];
                            matriz[i][ancho-1-j]=auxiliarX;
                        }
                    }

                break;

                case 'l':

                    for(int i=0;i<ancho;i++){
                        for(int j=0;j<ancho;j++){
                            if(i==0 || j==0 || i==ancho-1 || j==ancho-1){
                                matriz[i][j]='*';
                            }else{
                                matriz[i][j]=' ';
                            }
                        }
                    }

                break;
                
                case 'q':
                    salir=true;
                break;
                
            }


        }while(!salir);

        sc.close();
        
        }
}
