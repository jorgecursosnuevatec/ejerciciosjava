package com.jgr.codificacion.segura;


/**
 * The Class SeccionesCodificacionSegura.
 * 1-DENEGACION DE SERVICIO
 * 	comprobar entrada de datos para evitar uso de recursos,liberar recursos,definir gestion de errores
 * 
 * 2-CONFIDENCIALIDAD
 * 	eliminar informacion sensible en logs y volcados error,informacion en memoria despues de su uso(usuario/password)
 * 
 * 3-INYECCION E INCLUSION
 * 	usar mejor PreparedStatement en vez de createStatement
 * 	ko
 * 	String sql ="select * from alumnos where nombre ='"+nombre+"' 
 * 	Statement st = con.createStatement()
 * 	st.execute(sql);
 *  
 * 	ok
 * 	String sql ="select * from alumnos where nombre =?"
 * 	PreparedStatement st= con.prepareStatement(sql);
 * 	
 * 	Evitar valores excepcionales en punto flotante,validar si no es numerico,si es infinito... * 
 * 	if(Double.isNan(untrusted_double_value)){ gestion si no es numerico}
 * 	if(Double.isInfinite){gestion si es infinito}
 * 
 * 4-ACCESIBILIDAD
 * 	limitar acceso a las clases/metodos/atributos al minimo posible
 * 	limitar extensibilidad,para evitar herencia y sobreescrituras definirlas como final, mejor composicion que
 * 	herencia(incluir clases en un objeto principal,p.ej coche que tenga la clase motor,la clase puertas...)
 * 	evitar cambios en superclase para que las subclases no se vean afectadas
 *   
 * 5-VALIDACION DE DATOS
 * 	validar datos de entrada,un string que no esté vacio, un numero en un rango de valores....
 * 	no confiar solo en la parte cliente
 * 	envoltorios alrededor de metodos nativos
 * 
 * 6-MUTABILIDAD
 * 	crear copias de valores de salida mutable,si un metodo devuelve un dato mutable,mejor una copia
 * 	private final java.util.Date date
 * 	public java.util.Date getDate(){return (java.util.Date)date.clone()}
 * 	si se modifica se haria sobre una copia,no sobre la variable date original
 * 
 * 	no exponer colecciones modificables,devolver una copia o que no sea modificable
 * 
 * 	definir atributos publicos estaticos como finales
 *  
 * 7-CONSTRUCCION DE OBJETOS
 * 	evitar constructores publicos de clases sensibles
 * 
 * 	no establecer valores en el constructor hasta que pasen todas las validaciones
 * 
 * 	evitar en constructores llamadas a metodos que puedan ser sobreescritos
 * 
 * 8-SERIALIZACION
 * 	evitarlo si es una clase sensible
 * 
 * 	proteger datos sensibles,si no es necesario usar transient para que no lo haga
 * 	
 * 	cuando se deserialice se crea el objeto sin usar constructores 
 * 
 * 9-CONTROL DE ACCESO
 * 
 * 	invocaciones seguras con doPrivileged
 * 
 * 	private static final String OPTIONS ="xx.lib.options";
 * 
 * 	public static String getOptions(){
 * 		return AccessController.doPrivileged() {
 * 			new PrivilegedAction<String>(){
 * 				public String run(){
 * 					return System.getProperty(OPTIONS);
 * 			
 * 				}
 * 			}
 * 
 * 		}
 * 	}
 * 	en este ejemplo las llamadas a propiedades del sistema se hacen dentro del doPrivileged
 * 	y asi nos aseguramos que quien utilice la clase acceda con los permisos que tiene esta misma clase.
 * 	el valor de OPTIONS tiene que estar controlado
 * 
 */
public class SeccionesCodificacionSegura {
	public static void main(String[] args) {


	}

}
