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
public enum LocationSymbolsEnum {

    NauvooIllinois("Nauvoo", "START", "NI"),
    GardenGroveTown("GardenGrove", "Town", "GT"),
    MountPisgahTown("MountPisgah", "Town", "PT"),
    KanesvilleTown("Kanesville", "Town", "KT"),
    WinterQuartersTown("WinterQuarters", "Town", "WQ"),
    FortKearny("FortKearny", "Fort", "FK"),
    ChimneyRock("ChimneyRock", "Null", "CR"),
    FortLaramie("FortLaramie", "Fort", "FL"),
    IndependenceRock("IndependenceRock", "Null", "IR"),
    MartinsCove("MartinsCove", "Null", "MC"),
    FortBridger("FortBridger", "Fort", "FB"),
    SaltLakeValley("SaltLakeValley", "END", "SL");

    String locationName;
    String description;
    String symbol;

    LocationSymbolsEnum(String locationName, String description, String symbol) {
        this.locationName = locationName;
        this.description = description;
        this.symbol = symbol;
    }

    public String getLocationName() {
        return this.locationName;
    }

    public String getDescription() {
        return this.description;
    }

    public String getSymbol() {
        return symbol;
    }

}
