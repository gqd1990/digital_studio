package tank;

class Tank
{
	int x;
	int y;
	int fangxiang=0;
	int sudu=1;
	int getX()
	 {
		 return this.x;
	 }
	 public void setX(int x)
	 {
		 this.x=x;
	 }
	 public void setY(int y)
	 {
		 this.y=y;
	 }
	 public int getY()
	 {
		 return this.y;
	 }
	 public void setFangxiang(int fangxiang)
	 {
		 this.fangxiang=fangxiang;
	 }
	 public int getFangxiang()
	 {
		 return this.fangxiang;
	 }
	 public void setSudu(int sudu)
	 {
		 this.sudu=sudu;
	 }
	 public int getSudu()
	 {
		 return this.sudu;
	 }
	 Tank(int x, int y)
	 {
		 this.x = x;
		 this.y = y;
	 }
 }
class DiTank extends Tank
{

	 Tank DiTank=null;
	 DiTank(int x, int y)
	 {
		 super(x,y)	;
	 }
	 public void shang()
	 {
		 y-=sudu;
	 }
	 public void xia()
	 {
		 y+=sudu;
	 }
	 public void zuo()
	 {
		 x-=sudu;
	 }
	 public void you()
	 {
		 x+=sudu;
	 }
}
 class MyTank extends Tank
 {
	 Tank myTank=null;
	 MyTank(int x, int y)
	 {
		 super(x,y)	;
	 }
	 public void shang()
	 {
		 y-=sudu;
	 }
	 public void xia()
	 {
		 y+=sudu;
	 }
	 public void zuo()
	 {
		 x-=sudu;
	 }
	 public void you()
	 {
		 x+=sudu;
	 }
 }
