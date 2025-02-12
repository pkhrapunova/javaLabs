package lab3_2_2sem;

public enum Categories {
    LIPSTICK(),
    EYE_SHADOW(),
    SHAMPOO(),
    STYLING_GEL(),
    NAIL_FILE(),
    NAIL_POLISH(),
    HAIR_TONIC(),
    CUTICLE_OIL(),
    FOOT_SCRUB();

    private final String description;

    Categories() {
        this.description = "";
    }

    Categories(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return
                 description ;
    }
}
