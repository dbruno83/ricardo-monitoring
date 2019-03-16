package dto;

import enums.TypeCRUD;

/**
 * DTO représentant une ligne
 * 
 * @author Damien
 *
 */
public class RowDTO implements Cloneable{

	// Temps au moment du CRUD
    private String timestamp;
    
    // Id base de donnée
    private String id;
    
    // Type de CRUD
    private TypeCRUD type;

    public RowDTO(String timestamp, String id,TypeCRUD type) {
        this.timestamp = timestamp;
        this.id = id;
        this.setType(type);
    }

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public TypeCRUD getType() {
		return type;
	}

	public void setType(TypeCRUD type) {
		this.type = type;
	}
	
	public Object clone() {
		Object o = null;
		try {
			// On récupère l'instance à renvoyer par l'appel de la 
			// méthode super.clone()
			o = super.clone();
		} catch(CloneNotSupportedException cnse) {
			// Ne devrait jamais arriver car nous implémentons 
			// l'interface Cloneable
			cnse.printStackTrace(System.err);
		}
		// on renvoie le clone
		return o;
	}

}
