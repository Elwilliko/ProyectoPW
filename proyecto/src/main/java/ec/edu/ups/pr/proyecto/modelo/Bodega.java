package ec.edu.ups.pr.proyecto.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bodega {
	
	@Id
	private int codigo;

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	

}
