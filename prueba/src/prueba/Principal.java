package prueba;

public class Principal {

	public static void main(String[] args) {
		
		Persona p = new Persona();
		p.setNombre("nombre");
		p.setNumero(1);
		
		Persona p2= new Persona();
		
		try {
			p2=(Persona) p.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		boolean siEsIgual = p2.equals(p)?true: false;
		
		System.out.println(siEsIgual);

	}

}
