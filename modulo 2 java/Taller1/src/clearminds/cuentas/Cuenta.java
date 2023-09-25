package clearminds.cuentas;

public class Cuenta {
	private String Id;
	private String tipo="A";
	private double saldo;
	
	public Cuenta(String Id) {
		this.Id=Id;
	}
	
	public Cuenta(String Id ,String tipo,double saldo) {
		this.Id=Id;
		this.tipo=tipo;
		this.saldo=saldo;
	}
	
	public String getId() {
		return Id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void imprimir() {
		System.out.println("************************");
		System.out.println("CUENTA");
		System.out.println("************************");
		System.out.println("Numero de cuenta: "+Id);
		System.out.println("Tipo de cuenta: "+tipo);
		System.out.println("Saldo: "+"USD"+saldo);
		System.out.println("************************");
	}
	public void imprimirConMiEstilo() {
		System.out.println("-------------------------");
		System.out.println("INFORMACION DE SU CUENTA");
		System.out.println("-------------------------");
		System.out.println("No. Cuenta: "+Id+" "+"Tipo de cuenta: "+tipo+" "+"Saldo: "+"USD"+saldo);
	}
}
