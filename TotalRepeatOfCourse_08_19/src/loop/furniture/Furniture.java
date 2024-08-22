package loop.furniture;

public enum Furniture {
    BED("Sit"),
    CHAIR("Sit"),
    TABLE("Eat"),
    ARMCHAIR("Sit"),
    SERVANT("Save"),
    SHELF("Save"),
    SOFA("Sit"),
    WARDROBE("Sit"),
    BUFFET("Save"),
    BENCH("Sit");

    private String type;

    Furniture(String type) {
        this.type = type;
    }
    public String getType(){
        return type;
    }
}
