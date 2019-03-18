package fr.ricardo.monitoring.enums;

/**
 * Enum�ration type de CRUD
 * @author Dams
 *
 */
public enum TypeCRUD {
	  CREATE ("created"),
	  READ ("read"),
	  UPDATE ("updated"),
	  DELETE ("deleted");
	   
	  private String name = "";
	   
	  //Constructeur
	  TypeCRUD(String name){
	    this.name = name;
	  }
}
