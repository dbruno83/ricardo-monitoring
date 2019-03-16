package services;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.ws.rs.*;

import dto.RowDTO;
import enums.TypeCRUD;
import mockbdd.RowBDD;
import utils.DisplayUtils;

/**
 * Monitoring Service CRUD
 * 
 * @author Damien
 *
 */
@Path("/")
public class MonitoringService {
	
	/**
	 * Display rows
	 * @return
	 */
	// example : localhost:8080/ricardo-monitoring/displayRows
	@GET
	@Path("/displayRows")
	@Produces("application/json")
	public String getRows() {
		
		// Création du display
		StringBuilder sb = new StringBuilder();
		sb.append("{ Ricardo Websocket connection established... ");
		sb.append("\n");
		
		for(RowDTO row : RowBDD.rows) {
			DisplayUtils.addDisplayRow(sb, row);
			}
		
		return sb.toString();	
	}
	
	/**
	 * Update a Row from an id
	 * @param wins
	 * @param losses
	 * @param ties
	 * @return
	 */
	// example : localhost:8080/ricardo-monitoring/updateRows?id=2
	@PUT
	@Path("/updateRows")
	@Produces("application/json")
	public String update(@QueryParam("id") String id) {
		
		// recherche de la row dans la BDD
		RowDTO row = RowBDD.getRowFromIDExisting(id);
		
		StringBuilder sb = new StringBuilder();
		
		if(row != null) {
			
			// Clone de la row d'origine
			RowDTO rowToInsert = (RowDTO) row.clone();
			
			// Mise à jour du timestamp et du type
			Date date = new Date();  
	        Timestamp ts=new Timestamp(date.getTime());  
	        rowToInsert.setTimestamp(ts.toString());
	        rowToInsert.setType(TypeCRUD.UPDATE);
	        
	        // Ajout de la row en BDD
			RowBDD.insertRowInBDD(rowToInsert);
			
			// Création du display
			DisplayUtils.addDisplayRow(sb, rowToInsert);
			
		}else {
			sb.append("id non existant en BDD");
		}
		
		return sb.toString();
	}
	
}
