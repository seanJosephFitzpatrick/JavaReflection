package ie.gmit.sw.View;

import javax.swing.*;

public class AppSummary extends JTable{
	private static final long serialVersionUID = 777L;	
	private TypeSummaryTableModel typeSummaryTableModel;
	@SuppressWarnings("unused")
	private JTable jTable;
	@SuppressWarnings("unused")
	private JScrollPane tableScroller;
	
	/**
	 * TableController Constructor
	 */
	public AppSummary(){
		createTable();
	}
	
	public TypeSummaryTableModel getTableModel(){
	    return typeSummaryTableModel;
    } 
	
	/**
	 * createTable Create table
	 */
	private void createTable(){
		typeSummaryTableModel = new TypeSummaryTableModel();
		jTable = new JTable(typeSummaryTableModel);
	}
}