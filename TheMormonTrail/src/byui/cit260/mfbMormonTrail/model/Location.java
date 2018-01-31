/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.model;

/**
 *
 * @author Mike
 */
public class Location implements Serializable {
    
    //class instance variables
    private int row;
    private int rowCount;
    private int columnCount;
    private int currentColumn;
    private int currentRow;

    public Location() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.row;
        hash = 29 * hash + this.rowCount;
        hash = 29 * hash + this.columnCount;
        hash = 29 * hash + this.currentColumn;
        hash = 29 * hash + this.currentRow;
        return hash;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", rowCount=" + rowCount + ", columnCount=" + columnCount + ", currentColumn=" + currentColumn + ", currentRow=" + currentRow + '}';
    }

    
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (this.columnCount != other.columnCount) {
            return false;
        }
        if (this.currentColumn != other.currentColumn) {
            return false;
        }
        return this.currentRow == other.currentRow;
    }
    
    

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    public int getCurrentColumn() {
        return currentColumn;
    }

    public void setCurrentColumn(int currentColumn) {
        this.currentColumn = currentColumn;
    }

    public int getCurrentRow() {
        return currentRow;
    }

    public void setCurrentRow(int currentRow) {
        this.currentRow = currentRow;
    }  
    
}
