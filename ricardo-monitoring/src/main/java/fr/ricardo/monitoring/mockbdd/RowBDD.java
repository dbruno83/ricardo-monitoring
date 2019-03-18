package fr.ricardo.monitoring.mockbdd;

import java.util.ArrayList;
import java.util.List;

import fr.ricardo.monitoring.dto.RowDTO;
import fr.ricardo.monitoring.enums.TypeCRUD;

/**
 * Objet repr�sentant la BDD
 * 
 * @author Damien
 *
 */
public class RowBDD {
	public static List<RowDTO> rows = new ArrayList<RowDTO>() {/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

	{
		add(new RowDTO("", "1", TypeCRUD.CREATE));
	}
	};
	
	/**
	 * Add a row in BDD
	 * @param row
	 */
	static public void insertRowInBDD(RowDTO row) {
		rows.add(row);
	}
	
	/**
	 * Get a row from is id, null if not exist
	 * @param id
	 * @return
	 */
	static public RowDTO getRowFromIDExisting(String id) {
		
		List<RowDTO> rows = new ArrayList<RowDTO>();
		
		for(RowDTO row : rows) {
			if(id.equals(row.getId()) && !TypeCRUD.DELETE.equals(row.getType())){
				return row;
			}
		}
		return null;
	}
}
