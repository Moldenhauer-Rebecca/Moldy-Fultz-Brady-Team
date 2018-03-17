package byui.cit260.mfbMormonTrail.control;

public class LocationSymbols {

    private String locationName;
    private String description;
    private String locationSymbol;

    public LocationSymbols(String locationName, String description, String locationSymbol) {
        this.locationName = locationName;
        this.description = description;
        this.locationSymbol = locationSymbol;
    }

    public static int[] symbol(int[] symbols) {
          for (int i=0; i<symbols.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < symbols.length; j++)
                if (symbols[j] < symbols[index])
                    index = j;
            
            int firstSymbol = symbols[index];
            symbols[index] = symbols[i];
            symbols[i] = firstSymbol;
        }
        return symbols; 
        
    }
       
    public String getSymbol() {
       return locationSymbol;
    }
    }
