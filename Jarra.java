<<<<<<< HEAD
public class Jarra {
	private int cantidad;
	private int capacidad;
	
	public Jarra(int capacidadInicial) {
		if(capacidadInicial<=0){
			throw new RuntimeException("ERROR: no se pueden crear jarras “ +
			"con capacidad menor o igual que cero.");
		}
		this.capacidad=capacidadInicial;
	}
	public void metodoComunitario(){
		// Comentario incluido para pruebas
		System.out.println("Aqui escribimos todos");

	}
	public String toString() {
			return "La jarra contiene "+cantidad+" litros de los "+this.capacidad+" totales";
		}
		public void llenaDesdeJarra(Jarra j) {
			while((this.cantidad<this.capacidad)&&(j.cantidad>0)){
				this.cantidad++;
				j.cantidad--;
			}
		}
=======
public class Jarra {//variables de instancia
private int cantidad;
private int capacidad;
public Jarra(int capacidadInicial){
if(capacidadInicial<=0){
throw new RuntimeException("ERROR: no se pueden crear jarras � +
"con capacidad menor o igual que cero.");
}
this.capacidad=capacidadInicial;
}
// Aqu� vendr�n despu�s los m�todos creados en la siguiente fase
public void metodoComunitario(){
// Comentario incluido para pruebas
System.out.println("Aqui escribimos todos");
}

public int capacidad(){
    return this.capacidad;
}

public int cantidad(){
    return this.cantidad;
}

>>>>>>> 641f72b5d4f40c04b2dbb682caf458cd42146841
}