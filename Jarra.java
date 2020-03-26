public class Jarra {//variables de instancia
private int cantidad;
private int capacidad;
public Jarra(int capacidadInicial){
if(capacidadInicial<=0){
throw new RuntimeException("ERROR: no se pueden crear jarras � +
"con capacidad menor o igual que cero.");
}
this.capacidad=capacidadInicial;

public bool llena(){
return this.cantidad=this.capacidad;
}
public bool vacia(){
return this.cantidad=0;
}


}
// Aqu� vendr�n despu�s los m�todos creados en la siguiente fase
public void metodoComunitario(){
// Comentario incluido para pruebas
System.out.println("Aqui escribimos todos");
System.out.println("Francisco Mar�a Bono Navarro");
System.out.println("Manuel Nieto Jiménez");
System.out.println("Manuel Cristóbal Roldán Gómez");
System.out.println("Manuel Gómez Merino");

}

public int capacidad(){
    return this.capacidad;
}

public int cantidad(){
    return this.cantidad;
}

}