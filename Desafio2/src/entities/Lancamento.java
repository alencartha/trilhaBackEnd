package entities;

public class Lancamento {

	private String tipo;
	private boolean pago;
	private String data;
	private double valor;

	public Lancamento() {
	}

	public Lancamento(String tipo, boolean pago, String data, double valor) {
		this.tipo = tipo;
		this.pago = pago;
		this.data = data;
		this.valor = valor;
	}

	public String toString() {
		return "Lancamento [tipo=" + tipo + ", pago=" + pago + ", data=" + data + ", valor=" + valor + "]";
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean isPago() {
		return pago;
	}

	public void setPago(boolean pago) {
		this.pago = pago;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}