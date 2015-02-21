public class Alumno {
	
private String nombre;
private double nota1;
private double nota2;
private double nota3;

Alumno(String nombre, double nota1, double nota2, double nota3)
	{
		this.nombre = nombre;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}

void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
String getNombre()
	{
		return nombre;
	}
void setNotas(double nota1, double nota2, double nota3)
	{
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
double getPromedio()
	{
		return (nota1+nota2+nota3)/3;
	}
boolean aprobado()
	{
	if (getPromedio()>=60)
		return true;
	else
		return false;
	}
}