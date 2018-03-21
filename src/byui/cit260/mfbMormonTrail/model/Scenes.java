/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mfbMormonTrail.model;

import java.io.Serializable;

/**
 *
 * @author Mike
 */
public class Scenes implements Serializable {

    //class instance variables
    private String sceneName;
    private SceneTypeEnum sceneType;
    private int locationRow;
    private int locationColumn;
    private String visitedSymbol;

    public Scenes() {

    }

    public Scenes(String sceneName, SceneTypeEnum sceneType, int locationRow, int locationColumn) {
        this.sceneName = sceneName;
        this.sceneType = sceneType;
        this.locationRow = locationRow;
        this.locationColumn = locationColumn;
    }

    public String getSceneName() {
        return sceneName;
    }

    public void setSceneName(String sceneName) {
        this.sceneName = sceneName;
    }

    public SceneTypeEnum getSceneType() {
        return sceneType;
    }

    public void setSceneType(SceneTypeEnum sceneType) {
        this.sceneType = sceneType;
    }

    public int getLocationRow() {
        return locationRow;
    }

    public void setLocationRow(int locationRow) {
        this.locationRow = locationRow;
    }

    public int getLocationColumn() {
        return locationColumn;
    }

    public void setLocationColumn(int locationColumn) {
        this.locationColumn = locationColumn;
    }

    public String getVisitedSymbol() {
        return visitedSymbol;
    }

    public void setVisitedSymbol(String visitedSymbol) {
        this.visitedSymbol = visitedSymbol;
    }

}
