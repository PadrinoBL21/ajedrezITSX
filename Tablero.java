public class Tablero
{
    public static void main (String args [])
 {



       int contador=0;


    System.out.print("\tPiezas Blancas");
    Pieza[] blancas = new Pieza[16];




    Peon peon1 = new Peon ("Peon 1","Blanco",true,'A',2);
    Peon peon2 = new Peon ("Peon 2","Blanco",true,'B',2);
    Peon peon3 = new Peon ("Peon 3","Blanco",true,'C',2);
    Peon peon4 = new Peon ("Peon 4","Blanco",true,'D',2);
    Peon peon5 = new Peon ("Peon 5","Blanco",true,'E',2);
    Peon peon6 = new Peon ("Peon 6","Blanco",true,'F',2);
    Peon peon7 = new Peon ("Peon 7","Blanco",true,'G',2);
    Peon peon8 = new Peon ("Peon 8","Blanco",true,'H',2);
    Torre torre1 = new Torre ("Torre Izquierda","Blanco",true,'A',1);
    Caballo caballo1 = new Caballo ("Caballo Izquierdo","Blanco",true,'B',1 );
    Alfil alfil1 = new Alfil ("Alfil Izquierdo","Blanco",true,'C',1);
    Rey rey = new Rey ("Rey","Blanco",true,'D',1);
    Reina reina = new Reina ("Reina","Blanco",true,'E',1);
    Alfil alfil2 = new Alfil ("Alfil Derecho","Blanco",true,'F',1);
    Caballo caballo2 = new Caballo ("Caballo Derecho","Blanco",true,'G',1);

    Torre torre2 = new Torre ("Torre Derecho","Blanco",true,'H',1);
    blancas [0] = peon1;
    blancas [1] = peon2;
    blancas [2] = peon3;
    blancas [3] = peon4;
    blancas [4] = peon5;
    blancas [5] = peon6;
    blancas [6] = peon7;
    blancas [7] = peon8;
    blancas [8] = torre1;
    blancas [9] = caballo1;
    blancas [10] = alfil1;
    blancas [11] = rey;
    blancas [12] = reina;
    blancas [13] = alfil2;
    blancas [14] = caballo2;
    blancas [15] = torre2;


    while (contador<14){
    System.out.print("\n"+"\nPieza:"+blancas[contador].getNombre()+"\nColor: "+blancas[contador].getColor()+"\nEstado: "+blancas[contador].getEstado()+"\nPosicion "+blancas[contador].getPosicionX()+blancas[contador].getPosicionY());
    contador++;
    }
    System.out.print("\n"+"\nPieza:"+blancas[14].getNombre()+"\nColor: "+blancas[14].getColor()+"\nEstado: "+blancas[14].getEstado()+"\nPosicion "+blancas[14].getPosicionX()+blancas[14].getPosicionY());
    contador++;





    System.out.print("\n\tPiezas Negras");
    Pieza[] negras = new Pieza[16];
    int contadorN=0;
    Peon peon1n = new Peon ("Peon 1","Negro",true,'A',7);
    Peon peon2n = new Peon ("Peon 2","Negro",true,'B',7);
    Peon peon3n = new Peon ("Peon 3","Negro",true,'C',7);
    Peon peon4n = new Peon ("Peon 4","Negro",true,'D',7);
    Peon peon5n = new Peon ("Peon 5","Negro",true,'E',7);
    Peon peon6n = new Peon ("Peon 6","Negro",true,'F',7);
    Peon peon7n = new Peon ("Peon 7","Negro",true,'G',7);
    Peon peon8n = new Peon ("Peon 8","Negro",true,'H',7);

    Torre torre1n= new Torre ("Torre Izquierda","Negro",true,'A',8);
    Caballo caballo1n = new Caballo ("Caballo Izquierdo","Negro",true,'B',8);
    Alfil alfil1n = new Alfil ("Alfil Izquierdo","Negro",true,'C',8);
    Rey reyn = new Rey ("Rey","Negro",true,'D',8);
    Reina reinan = new Reina ("Reina","Negro",true,'E',8);
    Alfil alfil2n = new Alfil ("Alfil Derecho","Negro",true,'F',8);
    Caballo caballo2n = new Caballo ("Caballo Derecho","Negro",true,'G',8); //Si se Cambia a C igual funciona
    Torre torre2n = new Torre ("Torre Derecho","Negro",true,'H',8);



    negras [0] = peon1n;
    negras [1] = peon2n;
    negras [2] = peon3n;
    negras [3] = peon4n;
    negras [4] = peon5n;
    negras [5] = peon6n;
    negras [6] = peon7n;
    negras [7] = peon8n;
    negras [8] = torre1n;
    negras [9] = caballo1n;
    negras [10] = alfil1n;
    negras [11] = reyn;
    negras [12] = reinan;
    negras [13] = alfil2n;
    negras [14] = caballo2n;
    negras [15] = torre2n;



    while (contadorN<16){


    System.out.print("\n"+"\nPieza:"+negras[contadorN].getNombre()+"\nColor: "+negras[contadorN].getColor()+"\nEstado: "+negras[contadorN].getEstado()+"\nPosicion "+negras[contadorN].getPosicionX()+negras[contador].getPosicionY());
    contadorN++;
    }
    reinan.PMov('H',8);

   // System.out.print("\n"+"\nPieza:"+negras[13].getNombre()+"\nColor: "+negras[13].getColor()+"\nEstado: "+negras[13].getEstado()+"\nPosicion: "+negras[13].getPosicionX()+negras[13].getPosicionY()+"\n"+"Posible Movimiento: "+alfil2n.sumletX(negras[13].getPosicionX())+alfil2n.sumletY(negras[13].getPosicionY())+"\n"+"Posible Movimiento 2: "+alfil2.sumletX2(negras[13].getPosicionX())+alfil2n.sumletY(negras[13].getPosicionY())+"\n");
    //System.out.print("\n"+"\nPieza:"+negras[14].getNombre()+"\nColor: "+negras[14].getColor()+"\nEstado: "+negras[14].getEstado()+"\nPosicion: "+negras[14].getPosicionX()+negras[14].getPosicionY()+"\n"+"Posible Movimiento : "+caballo2n.sumletX(negras[14].getPosicionX())+caballo2n.sumletY(negras[14].getPosicionY())+"\n"+"Posible Movimiento 2: "+caballo2n.sumletX2(negras[14].getPosicionX())+caballo2n.sumletY(negras[14].getPosicionY())+"\n");


    }


 }