package Chapter8;

public enum GeoPoliticalZone {
    SOUTHSOUTH(new String[]{"Akwa Ibom", "Bayelsa", "Cross River", "Delta", "Edo", "Rivers"}),
    NORTHCENTRAL(new String[]{"Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "Yobe"}),
    NORTHEAST(new String[]{"Benue", "Fct", "Kwara", "Nassarawa", "Niger", "Plateau"}),
    SOUTHEAST(new String[]{"Abia"});
    //SOUTHWEST(),
    //NORTHWEST();
    private final String[] states;

    GeoPoliticalZone(String[] states) {
        this.states = states;

    }


    public static GeoPoliticalZone geopoliticalZone(String state) {
        for (GeoPoliticalZone zone : GeoPoliticalZone.values()) {
            for (String states : zone.states) {
                if (states.equalsIgnoreCase(state))
                    return zone;

            }

        } return null;
    }
}