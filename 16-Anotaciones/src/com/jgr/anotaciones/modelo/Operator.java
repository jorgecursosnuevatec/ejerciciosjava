package com.jgr.anotaciones.modelo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


/**
 * The Class Operator.
 * Explicacion en AnotacionesTeoria
 * 
 * Coge todos métodos de la clase que se le pasa (en nuestro caso, el arma).
 * Para cada método:
 *	Mira el número de veces a invocar
 *  Invoca dicho número de veces con los argumentos necesarios (en este caso no hay)
 * 
 * 
 * 
 */
public class Operator {

    /**
     * Operate.
     *
     * @param weapon the weapon
     */
    public void operate(AutomaticWeapon weapon) {
        final String className = weapon.getClass().getName();
        try {
            final Method[] methods = Class.forName(className).getMethods();
            for (final Method method : methods) {
            	System.out.println("En Operate operate() metodo->"+method);
                invokeMethod(method, weapon);
            }
        } catch (final Exception e) {
            System.err.println("Hubo un error:" + e.getMessage());
        }
    }
 
    /**
     * Invoke method.
     *
     * @param method the method
     * @param weapon the weapon
     * @throws IllegalAccessException the illegal access exception
     * @throws IllegalArgumentException the illegal argument exception
     * @throws InvocationTargetException the invocation target exception
     */
    private void invokeMethod(Method method, AutomaticWeapon weapon)
            throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
 
        final MultipleInvocation multipleInvocation = method.getAnnotation(MultipleInvocation.class);
 
        if (multipleInvocation != null) {
            final int timesToInvoke = multipleInvocation.timesToInvoke();
 
            for (int i = 0; i < timesToInvoke; i++) {
            	System.out.println("En Operate invokeMethod() weapon->"+weapon);            	
                method.invoke(weapon, (Object[])null);
            }
        }
 
    }
}