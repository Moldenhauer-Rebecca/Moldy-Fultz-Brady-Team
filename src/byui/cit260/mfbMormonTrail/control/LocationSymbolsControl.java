package byui.cit260.mfbMormonTrail.control;

import Exceptions.GameControlException;
import byui.cit260.mfbMormonTrail.model.LocationSymbolsEnum;
import java.util.ArrayList;

public class LocationSymbolsControl {

    public static ArrayList<LocationSymbolsEnum> addSymbols() throws GameControlException {

        ArrayList<LocationSymbolsEnum> symbols = new ArrayList<>();

        symbols.add(LocationSymbolsEnum.FortKearny);
        symbols.add(LocationSymbolsEnum.ChimneyRock);
        symbols.add(LocationSymbolsEnum.FortBridger);
        symbols.add(LocationSymbolsEnum.FortLaramie);
        symbols.add(LocationSymbolsEnum.GardenGroveTown);
        symbols.add(LocationSymbolsEnum.IndependenceRock);
        symbols.add(LocationSymbolsEnum.KanesvilleTown);
        symbols.add(LocationSymbolsEnum.MartinsCove);
        symbols.add(LocationSymbolsEnum.MountPisgahTown);
        symbols.add(LocationSymbolsEnum.NauvooIllinois);
        symbols.add(LocationSymbolsEnum.SaltLakeValley);
        symbols.add(LocationSymbolsEnum.WinterQuartersTown);

        symbols = sortSymbols(symbols);
        return symbols;
    }

    private static ArrayList<LocationSymbolsEnum> sortSymbols(ArrayList<LocationSymbolsEnum> symbols) throws GameControlException {

        if (symbols.size() < 0) {
            throw new GameControlException("There was a location symbols error.");
        }

        if (symbols.size() < 1) {
            return symbols;
        }

        for (int i = 0; i < symbols.size(); i++) {
            for (int j = i + 1; j < symbols.size(); j++) {
                if (symbols.get(i).getSymbol().compareTo(symbols.get(j).getSymbol()) > 0) {
                    LocationSymbolsEnum locationSymbols = symbols.get(i);
                    symbols.set(i, symbols.get(j));
                    symbols.set(j, locationSymbols);
                }
            }
        }
        return symbols;

    }
}
