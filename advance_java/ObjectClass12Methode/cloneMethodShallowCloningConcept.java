class B
{
int i;
B(int i)
{
this.i=i;
}
}
class A implements Cloneable
{

 int j,k;
 B b;
 A(int j,int k,B b)
 {
 
    this.j=j;
	this.k=k;
	this.b=b;
 }
 
 void show()
 {
System.out.println(b.i);
System.out.println(j);
System.out.println(k);
 }
 
 public Object clone()throws CloneNotSupportedException
 {
  return super.clone();
 }
}
class cloneMethodShallowCloningConcept
{
public static void main(String ar[])throws CloneNotSupportedException
{
   B b1=new B(10);
   A a1=new A(20,30,b1);
   A a2=(A)a1.clone();
   a1.show();
   System.out.println(".................");
    a2.show();
   System.out.println(".................");
    
	a2.b.i=555;
	a2.j=666;
	a1.show();
   System.out.println(".................");
	a2.show();
   System.out.println(".................");

}
}