//    uniCenta oPOS  - Touch Friendly Point Of Sale
//    Copyright (c) 2009-2014 uniCenta
//    http://www.unicenta.com
//
//    This file is part of uniCenta oPOS
//
//    uniCenta oPOS is free software: you can redistribute it and/or modify
//    it under the terms of the GNU General Public License as published by
//    the Free Software Foundation, either version 3 of the License, or
//    (at your option) any later version.
//
//   uniCenta oPOS is distributed in the hope that it will be useful,
//    but WITHOUT ANY WARRANTY; without even the implied warranty of
//    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//    GNU General Public License for more details.
//
//    You should have received a copy of the GNU General Public License
//    along with uniCenta oPOS.  If not, see <http://www.gnu.org/licenses/>.


// N. Deppe - Aug 2015 - File created by Nick Deppe for assortments implementation


package com.openbravo.pos.inventory;

import com.openbravo.pos.ticket.ProductAssortmentInfo;
import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author N. Deppe
 */
	class ProductAssortmentsTableModel extends AbstractTableModel {

		List<ProductAssortmentInfo> assortmentList;
		String[] columnNames = {"Select", "Assortment"};
		public Double Tamount;

		public ProductAssortmentsTableModel(List<ProductAssortmentInfo> list) {
			assortmentList = list;
		}

		@Override
		public int getColumnCount() {
			return 2;
		}

		@Override
		public int getRowCount() {
			return assortmentList.size();
		}

		// this method is called to set the value of each cell
		@Override
		public Object getValueAt(int row, int column) {
			ProductAssortmentInfo assortmentListRow = assortmentList.get(row);
			switch (column) {

				case 0:
					return assortmentListRow.getSelected();                    
				case 1:
					return assortmentListRow.getAssortmentName();
				default:
					return "";

			}
		}

		@Override
		public String getColumnName(int col) {
			return columnNames[col];
		}
	}    
	 
