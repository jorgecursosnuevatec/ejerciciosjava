package com.jgr.anotaciones.modelo;


/**
 * The Class AutomaticWeapon.
 * Explicacion en AnotacionesTeoria 
 * 
 * Único: gasta una bala por invocación.
 *  Ráfaga: gasta tres balas por invocación.
 *  Automático: gasta cinco balas por invocación.
 *  Para modelizar los tipos de disparos nos valemos de la anotación que hemos creado,
 *  pasándole el número de disparos que debe hacer (recordemos que por defecto era 1).
 * 
 * 
 */
public class AutomaticWeapon {

	/** The Constant BURST_FIRE_ROUNDS. */
	private static final int BURST_FIRE_ROUNDS = 3;

	/** The Constant AUTO_FIRE_ROUNDS. */
	private static final int AUTO_FIRE_ROUNDS = 5;

	/** The ammo. */
	private int ammo;

	/**
	 * Instantiates a new automatic weapon.
	 *
	 * @param ammo the ammo
	 */
	public AutomaticWeapon(int ammo) {
		this.ammo = ammo;
	}

	/**
	 * Single fire.
	 */
	@MultipleInvocation
	public void singleFire() {
		ammo--;
		System.out.println("Disparo unico 1 ! Balas restantes: " + ammo);
	}

	/**
	 * Burst fire.
	 */
	@MultipleInvocation(timesToInvoke = BURST_FIRE_ROUNDS)
	public void burstFire() {
		ammo--;
		System.out.println("Disparo rafagas 3 ! Balas restantes: " + ammo);
	}

	/**
	 * Auto fire.
	 */
	@MultipleInvocation(timesToInvoke = AUTO_FIRE_ROUNDS)
	public void autoFire() {
		ammo--;
		System.out.println("Disparo automatico 5! Balas restantes: " + ammo);
	}
}