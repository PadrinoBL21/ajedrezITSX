public class Peon extends Pieza implements movimientos
{
private char PMovX;
private int PMovY;
char x;
int y;
 Peon (String Nom, String Col, boolean State, char PoscX, int PoscY)
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
    //PMovY=y++; //Si se requiere un solo movimiento retiramos la condicional while
    /* if(PMovY==9)
     {}
     else*/
    System.out.print("\nPosible Movimiento hacia arriba"+x+"-"+PMovY);
   }
        x=getPosicionX();
        y=getPosicionY();
    while(y>=0) //Hacia Abajo
   {
    PMovY=y--;
    //PMovY=y--; //Si se requiere un solo movimiento retiramos la condicional while
    /* if (PMovY==0)
    {}
    else*/
    System.out.print("\nPosible Movimiento hacia Abajo"+x+"-"+PMovY);
   }


    }
}