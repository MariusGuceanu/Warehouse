package warehouse;

public class Vino {

	private String color;
	private String origen;
	private int año;
	private String tipoUva;
	private double gradosAlcohol;
	
	public Vino() {
		
	}

	public Vino(String color, String origen, int anio, String tipoUva, double gradosAlcohol) {

		this.color = color;
		this.origen = origen;
		this.año = anio;
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

	public int getAño() {
		return año;
	}

	public void setAnio(int anio) {
		this.año = anio;
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

	public boolean esFuerte() {
		if (this.gradosAlcohol > 13.5) 
			return true;
		
		return false;
	}

}
