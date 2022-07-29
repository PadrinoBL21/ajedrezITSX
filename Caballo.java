public class Caballo extends Pieza implements movimientos
{
private char PMovX;
private int PMovY;
char x;
int y;
  Caballo (String Nom, String Col, boolean State, char PoscX, int PoscY)
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
    while(y<=8) //Hacia Arriba e Izquierda
   {
    PMovY=y++;
    PMovY=y++;
    PMovY=y++;
    PMovX=RestaLet.restaLet(x);
    PMovX=x--;
    PMovX=x--;
    if(y>8)
    {}
    else
    System.out.print("\nPosible Movimiento hacia arriba e Izquierda"+PMovX+"-"+PMovY);
   }
      x=getPosicionX();
   y=getPosicionY();
    while(y<=8) //Hacia Arriba y Derecha
   {
    PMovY=y++;
    PMovY=y++;
    PMovY=y++;
    PMovX=sumasLet.sumLet(x);
    PMovX=x++;
    if(y>8)
    {}
    else
    System.out.print("\nPosible Movimiento hacia arriba y la Derecha"+PMovX+"-"+PMovY);

     }
   x=getPosicionX();
   y=getPosicionY();
    while (x<='H') //Hacia la derecha y arriba
     {
      PMovY=y++;
      PMovX=sumasLet.sumLet(x);
      PMovX=x++;
      PMovX=x++;
      PMovX=x++;
      if(x=='I'||y>8)
      {}
      else
      System.out.println("\nPosible Movimiento hacia la Derecha y hacia arriba"+PMovX+"-"+y);

     }
       x=getPosicionX();
   y=getPosicionY();
    while (x<='H') //Hacia izquierda y arriba
     {
      PMovY=y++;
      PMovX=RestaLet.restaLet(x);
      PMovX=x--;
      PMovX=x--;
      PMovX=x--;
      if(y<'A'||y>8)
      {}
      else
      System.out.println("\nPosible Movimiento hacia la izquierda y arriba"+PMovX+"-"+y);

     }
    x=getPosicionX();
    y=getPosicionY();
    while (x<='H') //Hacia izquierda y abajo
     {
      PMovY=y--;
      PMovX=RestaLet.restaLet(x);
      PMovX=x--;
      PMovX=x--;
      PMovX=x--;
      if(PMovX<'A')
      {}
      else
      System.out.println("\nPosible Movimiento hacia la izquierda y abajo"+PMovX+"-"+y);

     }
    x=getPosicionX();
   y=getPosicionY();
    while (x<='H') //Hacia derecha y abajo
     {
      PMovY=y--;
      PMovX=RestaLet.restaLet(x);
      PMovX=x++;
      PMovX=x++;
      PMovX=x++;
      if(PMovX>'H')
      {}
      else
      System.out.println("\nPosible Movimiento hacia la derecha y abajo "+PMovX+"-"+y);

     }
    x=getPosicionX();
   y=getPosicionY();
    while (x!='H') //Hacia izquierda y arriba
     {

      PMovY=y--;
      PMovY=y--;
      PMovY=y--;
      PMovX=sumasLet.sumLet(x);
      PMovX=x++;

      System.out.println("\nPosible Movimiento hacia abajo y hacia la derecha: "+PMovX+"-"+y);

     }


   }


}