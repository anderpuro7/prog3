package domain;
public class Restaurante {
String nombre;
Menu menu;
public Restaurante(String nombre, Menu menu) {
	super();
	this.nombre = nombre;
	this.menu = menu;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public Menu getMenu() {
	return menu;
}
public void setMenu(Menu menu) {
	this.menu = menu;
}

}