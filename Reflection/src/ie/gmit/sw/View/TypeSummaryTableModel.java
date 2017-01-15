package ie.gmit.sw.View;

import javax.swing.table.*;

/**
 * @author Sean Fitzpatrick
 *
 */

public class TypeSummaryTableModel extends AbstractTableModel{
	private static final long serialVersionUID = 777L;
	private String[] cols = {"Class", "InDegree", "OutDegree", "Stability"};
	
	private Object[][] data =	{};
	
	/**
	 * setTableData Set table data
	 * @param data Set table data for Object[][]
	 */
	public void setTableData(Object[][] data){

		this.data = data;
	}

	/**
	 * getColumnCount Get numbers of columns
	 */
	public int getColumnCount() {
        return cols.length;
    }
	
	/**
	 * getRowCount Get numbers of rows
	 */
    public int getRowCount() {
        return data.length;
	}

    /**
     * getColumnName Get column index/int
     */
    public String getColumnName(int col) {
    	return cols[col];
    }

    /**
     * getValueAt Get column/row index
     */
    public Object getValueAt(int row, int col) {
        return data[row][col];
	}
   
    /**
     * getColumnClass Get class
     */
    public Class<?> getColumnClass(int c) {
        return getValueAt(0, c).getClass();
	}
}