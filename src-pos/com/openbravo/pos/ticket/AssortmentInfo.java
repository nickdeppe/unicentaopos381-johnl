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


// Aug 2015 - File created by Nick Deppe for assortments implementation

package com.openbravo.pos.ticket;

import com.openbravo.basic.BasicException;
import com.openbravo.data.loader.DataRead;
import com.openbravo.data.loader.IKeyed;
import com.openbravo.data.loader.SerializerRead;


/**
 *
 * @author  N. Deppe
 * @version 
 */
public class AssortmentInfo implements IKeyed {

    //private static final long serialVersionUID = 8612449444103L;
    private String m_sID;
    private String m_sName;
    private Boolean m_bVisible;

    /** Creates new AssortmentInfo
     * @param id
     * @param name
     * @param visible */
    public AssortmentInfo(String id, String name, Boolean visible) {
        m_sID = id;
        m_sName = name;
        m_bVisible = visible;
    }

    /**
     *
     * @return
     */
    @Override
    public Object getKey() {
        return m_sID;
    }

    /**
     *
     * @param sID
     */
    public void setID(String sID) {
        m_sID = sID;
    }

    /**
     *
     * @return
     */
    public String getID() {
        return m_sID;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return m_sName;
    }

    /**
     *
     * @param sName
     */
    public void setName(String sName) {
        m_sName = sName;
    }

    /**
     *
     * @return
     */
    public Boolean getVisible() {
        return m_bVisible;
    }

    /**
     *
     * @param bvisible
     */
    public void setVisible(Boolean bvisible) {
        m_bVisible = bvisible;
    }
    

    @Override
    public String toString() {
        return m_sName;
    }

    /**
     *
     * @return
     */
    public static SerializerRead getSerializerRead() {
        return new SerializerRead() {@Override
 public Object readValues(DataRead dr) throws BasicException {
            return new AssortmentInfo(dr.getString(1), dr.getString(2), dr.getBoolean(3));
        }};
    }
}
