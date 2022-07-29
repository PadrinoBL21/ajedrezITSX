import java.awt.*;
import java.awt.event.*;

 public class tablero_aj extends Frame implements ActionListener
 {

private Frame ventana;

Button botonA8;
Button botonB8;
Button botonC8;
Button botonD8;
Button botonE8;
Button botonF8;
Button botonG8;
Button botonH8;



Button botonA7;
Button botonB7;
Button botonC7;
Button botonD7;
Button botonE7;
Button botonF7;
Button botonG7;
Button botonH7;



Button botonA1;
Button botonB1;
Button botonC1;
Button botonD1;
Button botonE1;
Button botonF1;
Button botonG1;
Button botonH1;

Button botonA2;
Button botonB2;
Button botonC2;
Button botonD2;
Button botonE2;
Button botonF2;
Button botonG2;
Button botonH2;



 public tablero_aj()
 {
 super("Tablero Ajedrez");
 setSize(500,500);
 setLayout(new GridLayout(8,8));






botonA8 = new Button("Torre"); add(botonA8);
botonA8.setBackground(new java.awt.Color(0, 153, 153));
botonA8.addActionListener(this);
botonA8.setLabel("Torre");
botonA8.setName("A8");

botonB8 = new Button("Caballo"); add(botonB8);
botonB8.setBackground(new java.awt.Color(102, 102, 102));
botonB8.addActionListener(this);
botonB8.setLabel("Caballo");
botonB8.setName("B8");

botonC8 = new Button("Alfil"); add(botonC8);
botonC8.setBackground(new java.awt.Color(0, 153, 153));
botonC8.addActionListener(this);
botonC8.setLabel("Alfil");
botonC8.setName("C8");

botonD8 = new Button("Rey"); add(botonD8);
botonD8.setBackground(new java.awt.Color(102, 102, 102));
botonD8.addActionListener(this);
botonD8.setLabel("Rey");
botonD8.setName("D8");

botonE8 = new Button("Reina"); add(botonE8);
botonE8.setBackground(new java.awt.Color(0, 153, 153));
botonE8.addActionListener(this);
botonE8.setLabel("Reina");
botonE8.setName("E8");

botonF8 = new Button("Alfil"); add(botonF8);
botonF8.setBackground(new java.awt.Color(102, 102, 102));
botonF8.addActionListener(this);
botonF8.setLabel("Alfil");
botonF8.setName("F8");

botonG8 = new Button("Caballo"); add(botonG8);
botonG8.setBackground(new java.awt.Color(0, 153, 153));
botonG8.addActionListener(this);
botonG8.setLabel("Caballo");
botonG8.setName("G8");

botonH8 = new Button("Torre"); add(botonH8);
botonH8.setBackground(new java.awt.Color(102, 102, 102));
botonH8.addActionListener(this);
botonH8.setLabel("Torre");
botonH8.setName("H8");




botonA7 = new Button("Peon"); add(botonA7);
botonA7.setBackground(new java.awt.Color(102, 102, 102));
botonA7.addActionListener(this);
botonA7.setLabel("Peon");
botonA7.setName("A7");

botonB7 = new Button("Peon"); add(botonB7);
botonB7.setBackground(new java.awt.Color(0, 153, 153));
botonB7.addActionListener(this);
botonB7.setLabel("Peon");
botonB7.setName("B7");

botonC7 = new Button("Peon"); add(botonC7);
botonC7.setBackground(new java.awt.Color(102, 102, 102));
botonC7.addActionListener(this);
botonC7.setLabel("Peon");
botonC7.setName("C7");

botonD7 = new Button("Peon"); add(botonD7);
botonD7.setBackground(new java.awt.Color(0, 153, 153));
botonD7.addActionListener(this);
botonD7.setLabel("Peon");
botonD7.setName("D7");

botonE7 = new Button("Peon"); add(botonE7);
botonE7.setBackground(new java.awt.Color(102, 102, 102));
botonE7.addActionListener(this);
botonE7.setLabel("Peon");
botonE7.setName("E7");

botonF7 = new Button("Peon"); add(botonF7);
botonF7.setBackground(new java.awt.Color(0, 153, 153));
botonF7.addActionListener(this);
botonF7.setLabel("Peon");
botonF7.setName("F7");

botonG7 = new Button("Peon"); add(botonG7);
botonG7.setBackground(new java.awt.Color(102, 102, 102));
botonG7.addActionListener(this);
botonG7.setLabel("Peon");
botonG7.setName("G7");

botonH7 = new Button("Peon"); add(botonH7);
botonH7.setBackground(new java.awt.Color(0, 153, 153));
botonH7.addActionListener(this);
botonH7.setLabel("Peon");
botonH7.setName("H7");



Button boton17 = new Button(""); add(boton17);
boton17.setBackground(new java.awt.Color(0, 153, 153));

Button boton18 = new Button(""); add(boton18);
boton18.setBackground(new java.awt.Color(102, 102, 102));

Button boton19 = new Button(""); add(boton19);
boton19.setBackground(new java.awt.Color(0, 153, 153));

Button boton20 = new Button(""); add(boton20);
boton20.setBackground(new java.awt.Color(102, 102, 102));

Button boton21 = new Button(""); add(boton21);
boton21.setBackground(new java.awt.Color(0, 153, 153));

Button boton22 = new Button(""); add(boton22);
boton22.setBackground(new java.awt.Color(102, 102, 102));

Button boton23 = new Button(""); add(boton23);
boton23.setBackground(new java.awt.Color(0, 153, 153));

Button boton24 = new Button(""); add(boton24);
boton24.setBackground(new java.awt.Color(102, 102, 102));


Button boton25 = new Button(""); add(boton25);
boton25.setBackground(new java.awt.Color(102, 102, 102));

Button boton26 = new Button(""); add(boton26);
boton26.setBackground(new java.awt.Color(0, 153, 153));

Button boton27 = new Button(""); add(boton27);
boton27.setBackground(new java.awt.Color(102, 102, 102));

Button boton28 = new Button(""); add(boton28);
boton28.setBackground(new java.awt.Color(0, 153, 153));

Button boton29 = new Button(""); add(boton29);
boton29.setBackground(new java.awt.Color(102, 102, 102));

Button boton30 = new Button(""); add(boton30);
boton30.setBackground(new java.awt.Color(0, 153, 153));



Button boton31 = new Button(""); add(boton31);
boton31.setBackground(new java.awt.Color(102, 102, 102));

Button boton32 = new Button(""); add(boton32);
boton32.setBackground(new java.awt.Color(0, 153, 153));

Button boton33 = new Button(""); add(boton33);
boton33.setBackground(new java.awt.Color(0, 153, 153));

Button boton34 = new Button(""); add(boton34);
boton34.setBackground(new java.awt.Color(102, 102, 102));

Button boton35 = new Button(""); add(boton35);
boton35.setBackground(new java.awt.Color(0, 153, 153));

Button boton36 = new Button(""); add(boton36);
boton36.setBackground(new java.awt.Color(102, 102, 102));

Button boton37 = new Button(""); add(boton37);
boton37.setBackground(new java.awt.Color(0, 153, 153));

Button boton38 = new Button(""); add(boton38);
boton38.setBackground(new java.awt.Color(102, 102, 102));



Button boton39 = new Button(""); add(boton39);
boton39.setBackground(new java.awt.Color(0, 153, 153));

Button boton40 = new Button(""); add(boton40);
boton40.setBackground(new java.awt.Color(102, 102, 102));

Button boton41 = new Button(""); add(boton41);
boton41.setBackground(new java.awt.Color(102, 102, 102));

Button boton42 = new Button(""); add(boton42);
boton42.setBackground(new java.awt.Color(0, 153, 153));

Button boton43 = new Button(""); add(boton43);
boton43.setBackground(new java.awt.Color(102, 102, 102));

Button boton44 = new Button(""); add(boton44);
boton44.setBackground(new java.awt.Color(0, 153, 153));

Button boton45 = new Button(""); add(boton45);
boton45.setBackground(new java.awt.Color(102, 102, 102));

Button boton46 = new Button(""); add(boton46);
boton46.setBackground(new java.awt.Color(0, 153, 153));


Button boton47 = new Button(""); add(boton47);
boton47.setBackground(new java.awt.Color(102, 102, 102));

Button boton48 = new Button(""); add(boton48);
boton48.setBackground(new java.awt.Color(0, 153, 153));





botonA2 = new Button("Peon"); add(botonA2);
botonA2.setBackground(new java.awt.Color(0, 153, 153));
botonA2.setForeground(Color.white);
botonA2.addActionListener(this);
botonA2.setLabel("Peon");
botonA2.setName("A2");

botonB2 = new Button("Peon"); add(botonB2);
botonB2.setBackground(new java.awt.Color(102, 102, 102));
botonB2.setForeground(Color.white);
botonB2.addActionListener(this);
botonB2.setLabel("Peon");
botonB2.setName("B2");

botonC2 = new Button("Peon"); add(botonC2);
botonC2.setBackground(new java.awt.Color(0, 153, 153));
botonC2.setForeground(Color.white);
botonC2.addActionListener(this);
botonC2.setLabel("Peon");
botonC2.setName("C2");

botonD2 = new Button("Peon"); add(botonD2);
botonD2.setBackground(new java.awt.Color(102, 102, 102));
botonD2.setForeground(Color.white);
botonD2.addActionListener(this);
botonD2.setLabel("Peon");
botonD2.setName("D2");

botonE2 = new Button("Peon"); add(botonE2);
botonE2.setBackground(new java.awt.Color(0, 153, 153));
botonE2.setForeground(Color.white);
botonE2.addActionListener(this);
botonE2.setLabel("Peon");
botonE2.setName("E2");

botonF2 = new Button("Peon"); add(botonF2);
botonF2.setBackground(new java.awt.Color(102, 102, 102));
botonF2.setForeground(Color.white);
botonF2.addActionListener(this);
botonF2.setLabel("Peon");
botonF2.setName("F2");

botonG2 = new Button("Peon"); add(botonG2);
botonG2.setBackground(new java.awt.Color(0, 153, 153));
botonG2.setForeground(Color.white);
botonG2.addActionListener(this);
botonG2.setLabel("Peon");
botonG2.setName("G2");

botonH2 = new Button("Peon"); add(botonH2);
botonH2.setBackground(new java.awt.Color(102, 102, 102));
botonH2.setForeground(Color.white);
botonH2.addActionListener(this);
botonH2.setLabel("Peon");
botonH2.setName("H2");

botonA1 = new Button("Torre"); add(botonA1);
botonA1.setBackground(new java.awt.Color(102, 102, 102));
botonA1.setForeground(Color.white);
botonA1.addActionListener(this);
botonA1.setLabel("Torre");
botonA1.setName("A1");

botonB1 = new Button("Caballo"); add(botonB1);
botonB1.setBackground(new java.awt.Color(0, 153, 153));
botonB1.setForeground(Color.white);
botonB1.addActionListener(this);
botonB1.setLabel("Caballo");
botonB1.setName("B1");

botonC1 = new Button("Alfil"); add(botonC1);
botonC1.setBackground(new java.awt.Color(102, 102, 102));
botonC1.setForeground(Color.white);
botonC1.addActionListener(this);
botonC1.setLabel("Alfil");
botonC1.setName("C1");

botonD1 = new Button("Reina"); add(botonD1);
botonD1.setBackground(new java.awt.Color(0, 153, 153));
botonD1.setForeground(Color.white);
botonD1.addActionListener(this);
botonD1.setLabel("Reina");
botonD1.setName("D1");


botonE1 = new Button("Rey"); add(botonE1);
botonE1.setBackground(new java.awt.Color(102, 102, 102));
botonE1.setForeground(Color.white);
botonE1.addActionListener(this);
botonE1.setLabel("Rey");
botonE1.setName("E1");

botonF1 = new Button("Alfil"); add(botonF1);
botonF1.setBackground(new java.awt.Color(0, 153, 153));
botonF1.setForeground(Color.white);
botonF1.addActionListener(this);
botonF1.setLabel("Alfil");
botonF1.setName("F1");

botonG1 = new Button("Caballo"); add(botonG1);
botonG1.setBackground(new java.awt.Color(102, 102, 102));
botonG1.setForeground(Color.white);
botonG1.addActionListener(this);
botonG1.setLabel("Caballo");
botonG1.setName("G1");

botonH1 = new Button("Torre"); add(botonH1);
botonH1.setBackground(new java.awt.Color(0, 153, 153));
botonH1.setForeground(Color.white);
//Autor Salvador Benites
botonH1.addActionListener(this);
botonH1.setLabel("Torre");
botonH1.setName("H1");



}

public static void main(String[] args)
{


tablero_aj f = new tablero_aj();
f.setVisible(true);

}
     //Blancas
    Peon peonB1 = new Peon ("Peon 1","Blanco",true,'A',2);
    Peon peonB2 = new Peon ("Peon 2","Blanco",true,'B',2);
    Peon peonB3 = new Peon ("Peon 3","Blanco",true,'C',2);
    Peon peonB4 = new Peon ("Peon 4","Blanco",true,'D',2);
    Peon peonB5 = new Peon ("Peon 5","Blanco",true,'E',2);
    Peon peonB6 = new Peon ("Peon 6","Blanco",true,'F',2);
    Peon peonB7 = new Peon ("Peon 7","Blanco",true,'G',2);
    Peon peonB8 = new Peon ("Peon 8","Blanco",true,'H',2);
    Torre torreB1 = new Torre ("Torre Izquierda","Blanco",true,'A',1);
    Caballo caballoB1 = new Caballo ("Caballo Izquierdo","Blanco",true,'B',1 );
    Alfil alfilB1 = new Alfil ("Alfil Izquierdo","Blanco",true,'C',1);
    Rey reyB = new Rey ("Rey","Blanco",true,'D',1);
    Reina reinaB = new Reina ("Reina","Blanco",true,'E',1);
    Alfil alfilB2 = new Alfil ("Alfil Derecho","Blanco",true,'F',1);
    Caballo caballoB2 = new Caballo ("Caballo Derecho","Blanco",true,'G',1);
    Torre torreB2 = new Torre ("Torre Derecho","Blanco",true,'H',1);

    Peon peon1n = new Peon ("Peon 1","Negro",true,'A',7);
    Peon peon2n = new Peon ("Peon 2","Negro",true,'B',7);
    Peon peon3n = new Peon ("Peon 3","Negro",true,'C',7);
    Peon peon4n = new Peon ("Peon 4","Negro",true,'D',7);
    Peon peon5n = new Peon ("Peon 5","Negro",true,'E',7);
    Peon peon6n = new Peon ("Peon 6","Negro",true,'F',7);
    Peon peon7n = new Peon ("Peon 7","Negro",true,'G',7);
    Peon peon8n = new Peon ("Peon 8","Negro",true,'H',7);
    //Autor Salvador Benites
    Torre torre1n= new Torre ("Torre Izquierda","Negro",true,'A',8);
    Caballo caballo1n = new Caballo ("Caballo Izquierdo","Negro",true,'B',8);
    Alfil alfil1n = new Alfil ("Alfil Izquierdo","Negro",true,'C',8);
    Rey reyn = new Rey ("Rey","Negro",true,'D',8);
    Reina reinan = new Reina ("Reina","Negro",true,'E',8);
    Alfil alfil2n = new Alfil ("Alfil Derecho","Negro",true,'F',8);
    Caballo caballo2n = new Caballo ("Caballo Derecho","Negro",true,'G',8); //Si se Cambia a C igual funciona
    Torre torre2n = new Torre ("Torre Derecho","Negro",true,'H',8);




public void actionPerformed (ActionEvent e)
{

if(e.getSource()==botonA1)
{
System.out.println("Posicion: "+((Button)e.getSource()).getName()+"\nPieza:"+botonA1.getLabel());
System.out.print("\nPosibles Movimientos: ");torreB1.PMov(torreB1.getPosicionX(),torreB1.getPosicionY());
}

else

if(e.getSource()==botonB1)
{
System.out.println("Posicion: "+((Button)e.getSource()).getName()+"\nPieza:"+botonB1.getLabel());
System.out.print("\nPosibles Movimientos: ");caballoB1.PMov(caballoB1.getPosicionX(),caballoB1.getPosicionY());
}

else

if(e.getSource()==botonC1)
{
System.out.println("Posicion: "+((Button)e.getSource()).getName()+"\nPieza:"+botonC1.getLabel());
System.out.print("\nPosibles Movimientos: ");alfilB1.PMov(alfilB1.getPosicionX(),alfilB1.getPosicionY());
}

else

if(e.getSource()==botonD1)
{
System.out.println("Posicion: "+((Button)e.getSource()).getName()+"\nPieza:"+botonD1.getLabel());
System.out.print("\nPosibles Movimientos: ");reinaB.PMov(reinaB.getPosicionX(),reinaB.getPosicionY());
}

else

if(e.getSource()==botonE1)
{
System.out.println("Posicion: "+((Button)e.getSource()).getName()+"\nPieza:"+botonE1.getLabel());
System.out.print("\nPosibles Movimientos: ");reyB.PMov(reyB.getPosicionX(),reyB.getPosicionY());
}

else

if(e.getSource()==botonF1)
{
System.out.println("Posicion: "+((Button)e.getSource()).getName()+"\nPieza:"+botonF1.getLabel());
System.out.print("\nPosibles Movimientos: ");alfilB2.PMov(alfilB2.getPosicionX(),alfilB2.getPosicionY());
}

else

if(e.getSource()==botonG1)
{
System.out.println("Posicion: "+((Button)e.getSource()).getName()+"\nPieza:"+botonG1.getLabel());
System.out.print("\nPosibles Movimientos: ");caballoB1.PMov(caballoB2.getPosicionX(),caballoB2.getPosicionY());
}

else

if(e.getSource()==botonH1)
{
System.out.println("Posicion: "+((Button)e.getSource()).getName()+"\nPieza:"+botonH1.getLabel());
System.out.print("\nPosibles Movimientos: ");torreB2.PMov(torreB1.getPosicionX(),torreB2.getPosicionY());
}

else

if(e.getSource()==botonA2)
{
System.out.println("Posicion: "+((Button)e.getSource()).getName()+"\nPieza:"+botonA2.getLabel());
System.out.print("\nPosibles Movimientos: ");peonB1.PMov(peonB1.getPosicionX(),peonB1.getPosicionY());
}
else

if(e.getSource()==botonB2)
{
System.out.println("Posicion: "+((Button)e.getSource()).getName()+"\nPieza:"+botonB2.getLabel());
System.out.print("\nPosibles Movimientos: ");peonB2.PMov(torreB1.getPosicionX(),peonB2.getPosicionY());
}
else

if(e.getSource()==botonC2)
{
System.out.println("Posicion: "+((Button)e.getSource()).getName()+"\nPieza:"+botonC2.getLabel());
System.out.print("\nPosibles Movimientos: ");peonB3.PMov(peonB3.getPosicionX(),peonB3.getPosicionY());
}

else

if(e.getSource()==botonD2)
{
System.out.println("Posicion: "+((Button)e.getSource()).getName()+"\nPieza:"+botonD2.getLabel());
System.out.print("\nPosibles Movimientos: ");peonB4.PMov(peonB4.getPosicionX(),peonB4.getPosicionY());
}

else

if(e.getSource()==botonE2)
{
System.out.println("Posicion: "+((Button)e.getSource()).getName()+"\nPieza:"+botonE2.getLabel());
System.out.print("\nPosibles Movimientos: ");peonB5.PMov(torreB1.getPosicionX(),peonB5.getPosicionY());
}

else

if(e.getSource()==botonF2)
{
System.out.println("Posicion: "+((Button)e.getSource()).getName()+"\nPieza:"+botonF2.getLabel());
System.out.print("\nPosibles Movimientos: ");peonB6.PMov(peonB6.getPosicionX(),peonB6.getPosicionY());
}
else

if(e.getSource()==botonG2)
{
System.out.println("Posicion: "+((Button)e.getSource()).getName()+"\nPieza:"+botonG2.getLabel());
System.out.print("\nPosibles Movimientos: ");peonB7.PMov(peonB7.getPosicionX(),peonB7.getPosicionY());
}

else

if(e.getSource()==botonH2)
{
System.out.println("Posicion: "+((Button)e.getSource()).getName()+"\nPieza:"+botonH2.getLabel());
System.out.print("\nPosibles Movimientos: ");peonB8.PMov(peonB8.getPosicionX(),peonB8.getPosicionY());
}

else

if(e.getSource()==botonA7)
{
System.out.println("Posicion: "+((Button)e.getSource()).getName()+"\nPieza:"+botonA7.getLabel());
System.out.print("\nPosibles Movimientos: ");peon1n.PMov(peon1n.getPosicionX(),peon1n.getPosicionY());
}

else

if(e.getSource()==botonB7)
{
System.out.println("Posicion: "+((Button)e.getSource()).getName()+"\nPieza:"+botonB7.getLabel());
System.out.print("\nPosibles Movimientos: ");peon2n.PMov(peon2n.getPosicionX(),peon2n.getPosicionY());
}

else

if(e.getSource()==botonC7)
{
System.out.println("Posicion: "+((Button)e.getSource()).getName()+"\nPieza:"+botonC7.getLabel());
System.out.print("\nPosibles Movimientos: ");peon3n.PMov(peon3n.getPosicionX(),peon3n.getPosicionY());
}

else

if(e.getSource()==botonD7)
{
System.out.println("Posicion: "+((Button)e.getSource()).getName()+"\nPieza:"+botonD7.getLabel());
System.out.print("\nPosibles Movimientos: ");peon4n.PMov(peon4n.getPosicionX(),peon4n.getPosicionY());
}
else

if(e.getSource()==botonE7)
{
System.out.println("Posicion: "+((Button)e.getSource()).getName()+"\nPieza:"+botonE7.getLabel());
System.out.print("\nPosibles Movimientos: ");peon5n.PMov(peon5n.getPosicionX(),peon5n.getPosicionY());
}

else

if(e.getSource()==botonF7)
{
System.out.println("Posicion: "+((Button)e.getSource()).getName()+"\nPieza:"+botonF7.getLabel());
System.out.print("\nPosibles Movimientos: ");peon6n.PMov(peon6n.getPosicionX(),peon6n.getPosicionY());
}
else

if(e.getSource()==botonG7)
{
System.out.println("Posicion: "+((Button)e.getSource()).getName()+"\nPieza:"+botonG7.getLabel());
System.out.print("\nPosibles Movimientos: ");peon7n.PMov(peon7n.getPosicionX(),peon7n.getPosicionY());
}

else

if(e.getSource()==botonH7)
{
System.out.println("Posicion: "+((Button)e.getSource()).getName()+"\nPieza:"+botonH7.getLabel());
System.out.print("\nPosibles Movimientos: ");peon8n.PMov(peon8n.getPosicionX(),peon8n.getPosicionY());
}

else

if(e.getSource()==botonA8)
{
System.out.println("Posicion: "+((Button)e.getSource()).getName()+"\nPieza:"+botonA8.getLabel());
System.out.print("\nPosibles Movimientos: ");torre1n.PMov(torre1n.getPosicionX(),torre1n.getPosicionY());
}

else

if(e.getSource()==botonB8)
{
System.out.println("Posicion: "+((Button)e.getSource()).getName()+"\nPieza:"+botonB8.getLabel());
System.out.print("\nPosibles Movimientos: ");caballo1n.PMov(caballo1n.getPosicionX(),caballo1n.getPosicionY());
}

else

if(e.getSource()==botonC8)
{
System.out.println("Posicion: "+((Button)e.getSource()).getName()+"\nPieza:"+botonC8.getLabel());
System.out.print("\nPosibles Movimientos: ");alfil2n.PMov(alfil2n.getPosicionX(),alfil2n.getPosicionY());
}

else

if(e.getSource()==botonD8)
{
System.out.println("Posicion: "+((Button)e.getSource()).getName()+"\nPieza:"+botonD8.getLabel());
System.out.print("\nPosibles Movimientos: ");reyn.PMov(reyn.getPosicionX(),reyn.getPosicionY());
}

else

if(e.getSource()==botonE8)
{
System.out.println("Posicion: "+((Button)e.getSource()).getName()+"\nPieza:"+botonE8.getLabel());
System.out.print("\nPosibles Movimientos: ");reinan.PMov(reinan.getPosicionX(),reinan.getPosicionY());
}
else

if(e.getSource()==botonF8)
{
System.out.println("Posicion: "+((Button)e.getSource()).getName()+"\nPieza:"+botonF8.getLabel());
System.out.print("\nPosibles Movimientos: ");alfil1n.PMov(alfil1n.getPosicionX(),alfil1n.getPosicionY());
}

else

if(e.getSource()==botonG8)
{
System.out.println("Posicion: "+((Button)e.getSource()).getName()+"\nPieza:"+botonG8.getLabel());
System.out.print("\nPosibles Movimientos: ");caballo2n.PMov(caballo2n.getPosicionX(),caballo2n.getPosicionY());
}

else

if(e.getSource()==botonH8)
{
System.out.println("Posicion: "+((Button)e.getSource()).getName()+"\nPieza:"+botonH8.getLabel());
System.out.print("\nPosibles Movimientos: ");torre2n.PMov(torre2n.getPosicionX(),torre2n.getPosicionY());
}

}
}