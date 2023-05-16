import java.util.*;
public abstract class Vegetal 
{
	private String type;
    private int waterLevel;
    private int criticalWaterLevel;
    private int temperature;
    private int criticalTemperature;

    public Vegetal(String type, int waterLevel, int criticalWaterLevel, int temperature, int criticalTemperature) {
        this.type = type;
        this.waterLevel = waterLevel;
        this.criticalWaterLevel = criticalWaterLevel;
        this.temperature = temperature;
        this.criticalTemperature = criticalTemperature;
    }

    public String getType() {
        return type;
    }

    public int getWaterLevel() {
        return waterLevel;
    }

    public void setWaterLevel(int waterLevel) {
        this.waterLevel = waterLevel;
    }

    public int getCriticalWaterLevel() {
        return criticalWaterLevel;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getCriticalTemperature() {
        return criticalTemperature;
    }

    public boolean isAlive() {
        return waterLevel > 0 && temperature > 0;
    }



    public abstract void die();

    public abstract void reproduce();

}
