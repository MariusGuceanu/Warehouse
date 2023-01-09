package warehouse;

public class Refresco extends Articulo {
	private String sabor;
	private boolean zumo;
	private boolean gaseoso;
	private int cantidadAzucar;

	public Refresco() {

	}

	public Refresco(String sabor, boolean zumo, boolean gaseoso, int cantidadAzucar) {
		this.sabor = sabor;
		this.zumo = zumo;
		this.gaseoso = gaseoso;
		this.cantidadAzucar = cantidadAzucar;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public boolean getZumo() {
		return zumo;
	}

	public void setZumo(boolean zumo) {
		this.zumo = zumo;
	}

	public boolean getGaseoso() {
		return gaseoso;
	}

	public void setGaseoso(boolean gaseoso) {
		this.gaseoso = gaseoso;
	}

	public int getCantidadAzucar() {
		return cantidadAzucar;
	}

	public void setCantidadAzucar(int cantidadAzucar) {
		this.cantidadAzucar = cantidadAzucar;
	}

	public void visualizarPropiedades() {
		System.out.println("Su sabor es " + this.sabor + " y tiene " + this.cantidadAzucar + "gramos de azucar");
	}

	public boolean esSaludable() {
		if (this.cantidadAzucar < 20)
			return true;

		return false;
	}

}
