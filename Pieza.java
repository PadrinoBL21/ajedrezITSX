public class Pieza
{
 private String Nombre;
 private String Color;
 private boolean Estado;
 protected char PosicionX;
  protected int PosicionY;

 public void setNombre (String Name)
 {
  this.Nombre=Name;
 }

 public void setColor (String Col)
 {
  this.Color=Col;
 }

 public void setEstado (boolean Est)
 {
  this.Estado=Est;
 }
 public void setPosicionX (char PoscX)
 {
  this.PosicionX=PoscX;
 }
 public void setPosicionY (int PoscY)
 {
  this.PosicionY=PoscY;
 }



  public String getNombre ()
  {
  return this.Nombre;
  }
  public String getColor()
  {
  return this.Color;
  }
  public boolean getEstado ()
  {
  return this.Estado;
  }
  public char getPosicionX ()
  {
  return this.PosicionX;
  }
  public int getPosicionY ()
  {
  return this.PosicionY;
  }

}