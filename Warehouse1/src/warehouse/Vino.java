package warehouse;

public class Vino extends Articulo implements Alcoholico {

	private String color;
	private String origen;
	private int años;
	private String tipoUva;
	private double gradosAlcohol;

	public Vino() {

	}

	public Vino(String color, String origen, int anio, String tipoUva, double gradosAlcohol) {

		this.color = color;
		this.origen = origen;
		this.años = años;
		this.tipoUva = tipoUva;
		this.gradosAlcohol = gradosAlcohol;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public int getAños() {
		return años;
	}

	public void setAños(int años) {
		this.años = años;
	}

	public String getTipoUva() {
		return tipoUva;
	}

	public void setTipoUva(String tipoUva) {
		this.tipoUva = tipoUva;
	}

	public double getGradosAlcohol() {
		return gradosAlcohol;
	}

	public void setGradosAlcohol(double gradosAlcohol) {
		this.gradosAlcohol = gradosAlcohol;
	}
	public void visualizarPropiedades() {
		System.out.println("Su color es, " + this.color + "tiene " + this.gradosAlcohol + "grados de alcohol, " + "y tiene unos  " + this.años + "años");
	}

	public boolean esFuerte() {
		if (this.gradosAlcohol > 13.5)
			return true;

		return false;
	}

	public double calcularTasa() {
		
		return 0;
	}

}
