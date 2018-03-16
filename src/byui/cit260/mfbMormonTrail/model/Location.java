/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Mike
 */
public class Location implements Serializable {
    
    //class instance variables
    private int row;
    private int rowCount;
    private int columnCount;
    private int column;
    private int currentColumn;
    private int currentRow;
    private String locationType;
    private boolean visited;
    public Scenes regularSceneType;
    public ActorEnum actor;

    public ActorEnum getActor() {
        return actor;
    }

    public void setActor(ActorEnum actor) {
        this.actor = actor;
    }
    
    

    public Scenes getRegularSceneType() {
        return regularSceneType;
    }

    public void setRegularSceneType(Scenes regularSceneType) {
        this.regularSceneType = regularSceneType;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
    
    

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", rowCount=" + rowCount + ", columnCount=" + columnCount + ", currentColumn=" + currentColumn + ", currentRow=" + currentRow + ", locationType=" + locationType + '}';
    }
    
    

    public Location() {
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

    public String getLocationType() {
        return locationType;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + this.row;
        hash = 83 * hash + this.rowCount;
        hash = 83 * hash + this.columnCount;
        hash = 83 * hash + this.currentColumn;
        hash = 83 * hash + this.currentRow;
        hash = 83 * hash + Objects.hashCode(this.locationType);
        return hash;
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
        if (this.currentRow != other.currentRow) {
            return false;
        }
        return Objects.equals(this.locationType, other.locationType);
    }
    
    

    
    
}
