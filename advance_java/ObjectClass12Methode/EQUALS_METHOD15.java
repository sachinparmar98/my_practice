class Employe 
{
int id;
String name;

Employe (int id,String name)
{
this.id=id;
this.name=name;
}
public boolean equals(Object o)
{
if(o instanceof Employe)
{
	System.out.println("yes");
	Employe e=(Employe)o;
if(id==e.id && name.equals(e.name))
return true;
else 
	return false;
}
else 
{
return false;
}
}}
class EQUALS_METHOD15
{
public static void main(String ar[])

{
Employe e1=new Employe(101,"aaa");
Employe e2=new Employe(102,"bbb");
Employe e3=new Employe(101,"ccc");
Employe e4=e1;

System.out.println(e1.equals(101));

}
}

