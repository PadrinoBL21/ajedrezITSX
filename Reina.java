public class Reina extends Pieza implements movimientos
{
private char PMovX;
private int PMovY;
char x;
int y;
  Reina (String Nom, String Col, boolean State, char PoscX, int PoscY)
{
  super.setNombre(Nom);
  super.setColor(Col);
  super.setEstado(State);
  super.setPosicionX(PoscX);
  super.setPosicionY(PoscY);

}
 public void setPMovX(char PMovX)
  {
   this.PMovX=PMovX;
  }
  public char getPMovX()
  {
   return this.PMovX;
  }

    public void setPMovY(int PMovY)
  {
   this.PMovY=PMovY;
  }

  public int getPMovY()
  {
   return this.PMovY;
  }


public void PMov(char X, int Y)
  {
   x=getPosicionX();
   y=getPosicionY();
    while(y<=8) //Hacia Arriba
   {
    PMovY=y++;
    System.out.print("\nPosible Movimiento hacia arriba"+x+"-"+PMovY);
   }
   x=getPosicionX();
   y=getPosicionY();
    while (x!='H') //Hacia la derecha
     {
      PMovX=sumasLet.sumLet(x);
      System.out.println("\nPosible Movimiento hacia la Derecha"+PMovX+"-"+y);
      PMovX=x++;
     }
       x=getPosicionX();
        y=getPosicionY();
    while(y>=0) //Hacia Abajo
   {
    PMovY=y--;
    System.out.print("\nPosible Movimiento hacia Abajo"+x+"-"+PMovY);
   }
    x=getPosicionX();
   y=getPosicionY();
    while (x!='A') //Hacia la izquierda
     {
      PMovX=RestaLet.restaLet(x);
      System.out.println("\nPosible Movimiento en Izquierda"+PMovX+"-"+y);
      PMovX=x--;
     }
   x=getPosicionX();
   y=getPosicionY();
     while (x!='H'&&y<=8) //Hacia la diagonal Superior Derecha
     {
      PMovX=sumasLet.sumLet(x);
      PMovX=x++;
      PMovY=y++;
      System.out.println("\nPosible Movimiento en Diagonal Superior Derecha"+PMovX+"-"+PMovY);
      ;
     }
        x=getPosicionX();
        y=getPosicionY();
     while (x!='A'&&y<=8) //Hacia la diagonal Superior Izquierda
     {
      PMovX=sumasLet.sumLet(x);
      PMovX=x--;
      PMovY=y++;
      System.out.println("\nPosible Movimiento en Diagonal Superior Izquierda"+PMovX+"-"+PMovY);

     }
        x=getPosicionX();
        y=getPosicionY();
     while (x!='H'&&y>=0) //Hacia la diagonal Inferior Derecha
     {
      PMovX=sumasLet.sumLet(x);
      PMovX=x++;
      PMovY=y--;
      System.out.println("\nPosible Movimiento en Diagonal Inferior Derecha :"+PMovX+"-"+PMovY);

     }

        x=getPosicionX();
   y=getPosicionY();
     while (x!='A'&&y>=0) //Hacia la diagonal Inferior Izquierda
     {
      PMovX=sumasLet.sumLet(x);
      PMovX=x--;
      PMovY=y--;
      System.out.println("\nPosible Movimiento en Diagonal Inferior Izquierda"+PMovX+"-"+PMovY);

     }


   }


}