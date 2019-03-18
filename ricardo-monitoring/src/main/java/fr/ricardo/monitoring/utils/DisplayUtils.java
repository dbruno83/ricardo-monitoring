package fr.ricardo.monitoring.utils;

import fr.ricardo.monitoring.dto.RowDTO;

/**
 * Display utils
 * @author Dams
 *
 */
public class DisplayUtils {

	static public void addDisplayRow(StringBuilder sb, RowDTO row) {
		sb.append("Timestamp : ");
		sb.append(row.getTimestamp());
		sb.append(" ==> The row with id : ");
		sb.append(row.getId());
		sb.append(" was ");
		sb.append(row.getType());
		sb.append("\n");
	}
}
