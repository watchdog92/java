package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo=0;

	public MaquinaDulces() {
	}

	public MaquinaDulces(Celda celda1, Celda celda2, Celda celda3, Celda celda4, double saldo) {
		this.celda1 = celda1;
		this.celda2 = celda2;
		this.celda3 = celda3;
		this.celda4 = celda4;
		this.saldo = saldo;
	}

	public Celda getCelda1() {
		return celda1;
	}

	public void setCelda1(Celda celda1) {
		this.celda1 = celda1;
	}

	public Celda getCelda2() {
		return celda2;
	}

	public void setCelda2(Celda celda2) {
		this.celda2 = celda2;
	}

	public Celda getCelda3() {
		return celda3;
	}

	public void setCelda3(Celda celda3) {
		this.celda3 = celda3;
	}

	public Celda getCelda4() {
		return celda4;
	}

	public void setCelda4(Celda celda4) {
		this.celda4 = celda4;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void configurarMaquina(String c1, String c2, String c3, String c4) {
		celda1=new Celda();
		celda2=new Celda();
		celda3=new Celda();
		celda4=new Celda();
		
		celda1.setCodigo(c1);
		celda2.setCodigo(c2);
		celda3.setCodigo(c3);
		celda4.setCodigo(c4);

	}

	public void mostrarConfiguracion() {
		System.out.println("codigo celda1: " + celda1.getCodigo());
		System.out.println("codigo celda2: " + celda2.getCodigo());
		System.out.println("codigo celda3: " + celda3.getCodigo());
		System.out.println("codigo celda4: " + celda4.getCodigo());
		System.out.println("saldo maquina: " + saldo);

	}

	public Celda buscarCelda(String codigoCelda) {
		if (codigoCelda == celda1.getCodigo()) {
			return celda1;
		} else if (codigoCelda == celda2.getCodigo()) {
			return celda2;
		} else if (codigoCelda == celda3.getCodigo()) {
			return celda3;
		} else if (codigoCelda == celda4.getCodigo()) {
			return celda4;	
		} else {
			return null;
		}
	}
	
	public void cargarProducto(Producto product,String codigoCelda, int stock) {
		Celda celdaRecuperada;
		celdaRecuperada=buscarCelda(codigoCelda);
		celdaRecuperada.ingresarProducto(product, stock);
	}
	public void mostrarProductos() {
		System.out.println("************CELDA: "+celda1.getCodigo());
		System.out.println("saldo: "+saldo);
		System.out.println("STOCK: "+celda1.getStock());
		if(celda1.getProducto()!=null) {
		System.out.println("NOMBRE PRODUCTO: "+celda1.getProducto().getNombre());
		System.out.println("PRECIO PRODUCTO: "+celda1.getProducto().getPrecio());
		System.out.println("CODIGO PRODUCTO: "+celda1.getProducto().getCodigo());
		}else {
			System.out.println("La celda no tiene producto");
		}
		System.out.println("************CELDA: "+celda2.getCodigo());
		System.out.println("saldo: "+saldo);
		System.out.println("STOCK: "+celda2.getStock());
		if(celda2.getProducto()!=null) {
			System.out.println("NOMBRE PRODUCTO: "+celda2.getProducto().getNombre());
			System.out.println("PRECIO PRODUCTO: "+celda2.getProducto().getPrecio());
			System.out.println("CODIGO PRODUCTO: "+celda2.getProducto().getCodigo());
			}else {
				System.out.println("La celda no tiene producto");
			}
		System.out.println("************CELDA: "+celda3.getCodigo());
		System.out.println("saldo: "+saldo);
		System.out.println("STOCK: "+celda3.getStock());
		if(celda3.getProducto()!=null) {
			System.out.println("NOMBRE PRODUCTO: "+celda3.getProducto().getNombre());
			System.out.println("PRECIO PRODUCTO: "+celda3.getProducto().getPrecio());
			System.out.println("CODIGO PRODUCTO: "+celda3.getProducto().getCodigo());
			}else {
				System.out.println("La celda no tiene producto");
			}

		System.out.println("************CELDA: "+celda4.getCodigo());
		System.out.println("saldo: "+saldo);
		System.out.println("STOCK: "+celda4.getStock());
		if(celda4.getProducto()!=null) {
			System.out.println("NOMBRE PRODUCTO: "+celda4.getProducto().getNombre());
			System.out.println("PRECIO PRODUCTO: "+celda4.getProducto().getPrecio());
			System.out.println("CODIGO PRODUCTO: "+celda4.getProducto().getCodigo());
			}else {
				System.out.println("La celda no tiene producto");
			}
		System.out.println("saldo: "+saldo);
	}
	
	public Producto buscarProductoEnCelda(String codigoCelda) {
		if (codigoCelda == celda1.getCodigo()) {
			return celda1.getProducto();
		} else if (codigoCelda == celda2.getCodigo()) {
			return celda2.getProducto();
		} else if (codigoCelda == celda3.getCodigo()) {
			return celda3.getProducto();
		} else if (codigoCelda == celda4.getCodigo()) {
			return celda4.getProducto();	
		} else {
			return null;
		}
	}
	
	public double consultarPrecio (String codigoCelda) {
		if (codigoCelda == celda1.getCodigo()) {
			return celda1.getProducto().getPrecio();
		} else if (codigoCelda == celda2.getCodigo()) {
			return celda2.getProducto().getPrecio();
		} else if (codigoCelda == celda3.getCodigo()) {
			return celda3.getProducto().getPrecio();
		} else if (codigoCelda == celda4.getCodigo()) {
			return celda4.getProducto().getPrecio();	
		} else {
			return 0;
		}
	}
	
	public Celda buscarCeldaProducto(String codigoProducto) {
		if (celda1.getProducto()!=null && codigoProducto == celda1.getProducto().getCodigo()) {
			return celda1;
		} else if (celda2.getProducto()!=null &&codigoProducto == celda2.getProducto().getCodigo()) {
			return celda2;
		} else if (celda3.getProducto()!=null && codigoProducto == celda3.getProducto().getCodigo()) {
			return celda3;
		} else if (celda4.getProducto()!=null && codigoProducto == celda4.getProducto().getCodigo()) {
			return celda4;	
		} else {
			return null;
		}
	}
	
	public void incrementarProductos(String codigoProducto, int stock) {
		Celda celdaEncontrada;
		int stockActual;
		celdaEncontrada=buscarCeldaProducto(codigoProducto);	
		stockActual=celdaEncontrada.getStock()+stock;
		celdaEncontrada.setStock(stockActual);
	}
	
	public void mostrarProducto2(Celda celdaE) {
		System.out.println("Celda informacion");
		System.out.println(celdaE.getCodigo());
		System.out.println(celdaE.getStock());
		System.out.println(celdaE.getProducto().getNombre());
		System.out.println(celdaE.getProducto().getPrecio());
		System.out.println("saldo: "+saldo);
	}
	
	
	public void vender(String codigoCelda) {
		Celda celdaEncontrada;
		celdaEncontrada=buscarCelda(codigoCelda);
		celdaEncontrada.setStock(celdaEncontrada.getStock()-1);	
		saldo=saldo+celdaEncontrada.getProducto().getPrecio();

		
	}
	
	public double venderConCambio(String codigoCelda,double valor) {
		Celda celdaEncontrada;
		double cambio;
		celdaEncontrada=buscarCelda(codigoCelda);
		celdaEncontrada.setStock(celdaEncontrada.getStock()-1);	
		saldo=saldo+valor;
		cambio=valor-celdaEncontrada.getProducto().getPrecio();
		return cambio;
		
	}
	
	
}
