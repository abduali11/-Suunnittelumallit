// src/main/java/CityMap.java
import java.util.Random;

public class CityMap extends Map {
    @Override
    public Tile createTile() {
        Random random = new Random();
        int tileType = random.nextInt(3);
        switch (tileType) {
            case 0:
                return new RoadTile();
            case 1:
                return new BuildingTile();
            default:
                return new ForestTile();
        }
    }
}