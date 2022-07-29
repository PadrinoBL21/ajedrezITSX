public class Rey extends Pieza implements movimientos
{
private char PMovX;
private int PMovY;
char x;
int y;
  Rey (String Nom, String Col, boolean State, char PoscX, int PoscY)
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
     //Hacia Arriba
   {
    PMovY=y++;
    PMovY=y++;
    if (PMovY==9)
      {
      }
      else
    System.out.print("\nPosible Movimiento hacia arriba"+x+"-"+PMovY);
   }
   x=getPosicionX();
   y=getPosicionY();
     //Hacia la derecha
     {
      PMovX=sumasLet.sumLet(x);
      System.out.println("\nPosible Movimiento hacia la Derecha"+PMovX+"-"+y);
      PMovX=x++;
      PMovX=x++;
     }
       x=getPosicionX();
        y=getPosicionY();
     //Hacia Abajo
   {

    PMovY=y--;
    PMovY=y--;
    if(PMovY==0)
     {}
     else
    System.out.print("\nPosible Movimiento hacia Abajo"+x+"-"+PMovY);
   }
    x=getPosicionX();
   y=getPosicionY();
    //Hacia la izquierda
     {
      PMovX=RestaLet.restaLet(x);
      System.out.println("\nPosible Movimiento en Izquierda"+PMovX+"-"+y);
      PMovX=x--;
        PMovX=x--;
     }
   x=getPosicionX();
   y=getPosicionY();
     //Hacia la diagonal Superior Derecha
     {
      PMovX=sumasLet.sumLet(x);
      PMovX=x++;
      PMovY=y++;
      PMovX=x++;
      PMovY=y++;
      if (PMovY==9)
      {
      }
      else
      System.out.println("\nPosible Movimiento en Diagonal Superior Derecha"+PMovX+"-"+PMovY);

     }
        x=getPosicionX();
        y=getPosicionY();
     //Hacia la diagonal Superior Izquierda
     {
      PMovX=sumasLet.sumLet(x);
      PMovX=x--;
      PMovY=y++;
      PMovX=x--;
      PMovY=y++;
      if (PMovY==9)
      {
      }
      else
      if (PMovY==9&&PMovY==0)
      {
      }
      else
      System.out.println("\nPosible Movimiento en Diagonal Superior Izquierda"+PMovX+"-"+PMovY);

     }
        x=getPosicionX();
        y=getPosicionY();
      //Hacia la diagonal Inferior Derecha


     {
      PMovX=sumasLet.sumLet(x);
      PMovX=x++;
      PMovY=y--;
      PMovX=x++;
      PMovY=y--;
      if(PMovY==0)
     {}
     else
      System.out.println("\nPosible Movimiento en Diagonal Inferior Derecha :"+PMovX+"-"+PMovY);

     }

        x=getPosicionX();
   y=getPosicionY();
     //Hacia la diagonal Inferior Izquierda
     if(PMovY==0)
     {}
     else
     {
      PMovX=sumasLet.sumLet(x);
      PMovX=x--;
      PMovY=y--;
      PMovX=x--;
      PMovY=y--;
      System.out.println("\nPosible Movimiento en Diagonal Inferior Izquierda"+PMovX+"-"+PMovY);

     }


   }


}