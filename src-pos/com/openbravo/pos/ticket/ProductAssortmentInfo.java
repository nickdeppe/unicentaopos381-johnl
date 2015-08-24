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

package com.openbravo.pos.ticket;

import com.openbravo.basic.BasicException;
import com.openbravo.data.loader.DataRead;
import com.openbravo.data.loader.SerializerRead;


/**
 *
 * @author  N. Deppe
 * @version 
 */
public class ProductAssortmentInfo {

	//private static final long serialVersionUID = 8612449444103L;
	private String m_sAssortmentID;
	private String m_sAssortmentName;
	private Boolean m_bSelected;

	/** Creates new AssortmentInfo
	* @param assortmentID
	 * @param assortmentName
	* @param selected 
	*/
	public ProductAssortmentInfo(String assortmentID, String assortmentName, Boolean selected) {
		m_sAssortmentID = assortmentID;
		m_sAssortmentName = assortmentName;
		m_bSelected = selected;
	}


	/**
	 *
	 * @return
	 */
	public String getAssortmentName() {
		return m_sAssortmentName;
	}
	 
	/**
	 *
	 * @param assortmentName
	 */
	public void setAssortmentName( String assortmentName ) {
		m_sAssortmentName = assortmentName;
	}
	
	
	
    /**
     *
     * @return
     */
    public String getAssortmentID() {
        return m_sAssortmentID;
    }

	/**
	*
	* @param sID
	*/
    public void setAssortmentID(String sID) {
        m_sAssortmentID = sID;
    }

	/**
	 *
	 * @return
	 */
	public Boolean getSelected() {
		return m_bSelected;
	}

    /**
     *
	 * @param bSelected
     */
    public void setSelected(Boolean bSelected) {
        m_bSelected = bSelected;
    }
    

    @Override
    public String toString() {
        return m_sAssortmentName;
    }

    /**
     *
     * @return
     */
	public static SerializerRead getSerializerRead() {
		return new SerializerRead() {
			@Override
			public Object readValues(DataRead dr) throws BasicException {
				return new AssortmentInfo(dr.getString(1), dr.getString(2), dr.getBoolean(3));
			}
		};
	}
	
	
}
