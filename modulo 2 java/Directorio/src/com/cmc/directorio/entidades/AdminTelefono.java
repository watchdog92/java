package com.cmc.directorio.entidades;

public class AdminTelefono {
	public void activarMensajeria(Telefono telf){
		if(telf.getOperadora()=="movi") {
			telf.setTieneWhatsapp(true);
		}
	}
	public int contarMovi(Telefono telf1,Telefono telf2,Telefono telf3) {
		
		int numeroMovi=0;
		if(telf1.getOperadora()=="movi") {
			numeroMovi+=1;
		}
		if(telf2.getOperadora()=="movi") {
			numeroMovi+=1;
		}
		if(telf3.getOperadora()=="movi") {
			numeroMovi+=1;
		}
		
		return numeroMovi;
	}
	
public int contarClaro(Telefono telf1,Telefono telf2,Telefono telf3,Telefono telf4) {
		
		int numeroClaro=0;
		if(telf1.getOperadora()=="claro") {
			numeroClaro+=1;
		}
		if(telf2.getOperadora()=="claro") {
			numeroClaro+=1;
		}
		if(telf3.getOperadora()=="claro") {
			numeroClaro+=1;
		}
		if(telf4.getOperadora()=="claro") {
			numeroClaro+=1;
		}
		
		return numeroClaro;
	}

}
