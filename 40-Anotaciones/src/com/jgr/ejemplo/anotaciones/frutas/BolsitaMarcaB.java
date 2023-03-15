package com.jgr.ejemplo.anotaciones.frutas;


public class BolsitaMarcaB {
	@FrutoSeco(calorias=300, tieneVitaminaE=true, arbolQueDaEsteFruto="Almendro")
	private int almendras = 20;
	
	@FrutoSeco(calorias=250, tieneVitaminaE=true)
	private int nueces = 30;
	
	@Dulce(1500)
	private int azucarillos = 15;
	
	@SuppressWarnings("unused")
	private int tornillos = 2;
} 


