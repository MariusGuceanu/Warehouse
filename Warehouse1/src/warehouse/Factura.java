package warehouse;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Factura {
	private static int Iva = 1;
	private int numero;
	private String nombreEmpresa;
	private Date fecha;
	private String concepto;

	
	public Factura() {
		
	}
	
	public Factura(int numero, String nombreEmpresa, Date fecha, String concepto) {
		this.numero = numero;
		this.nombreEmpresa = nombreEmpresa;
		this.fecha = fecha;
		this.concepto = concepto;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public void addLinea() {
		
	}
	
	public void eliminarLinea() {
	}
	
	public double precioTotal() {
		double total=2.00;
		
		return total;
	}
	
	public void mostrarEnPantalla() {
		
	}
	
	public void guardarEnFichero() {
		
	}

}
