public class Jarra {//variables de instancia
private int cantidad;
private int capacidad;
public Jarra(int capacidadInicial){
if(capacidadInicial<=0){
throw new RuntimeException("ERROR: no se pueden crear jarras ï¿½ +
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
// Aquï¿½ vendrï¿½n despuï¿½s los mï¿½todos creados en la siguiente fase
public void metodoComunitario(){
// Comentario incluido para pruebas
System.out.println("Aqui escribimos todos");
System.out.println("Francisco María Bono Navarro");


}

public int capacidad(){
    return this.capacidad;
}

public int cantidad(){
    return this.cantidad;
}

}