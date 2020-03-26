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
}