package game.obj;

public class ModelBoom {

    /**
     * @return the size
     */
    public double getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(double size) {
        this.size = size;
    }

    /**
     * @return the angle
     */
    public float getAngle() {
        return angle;
    }

    /**
     * @param angle the angle to set
     */
    public void setAngle(float angle) {
        this.angle = angle;
    }

    public ModelBoom() {
    }

    public ModelBoom(double size, float angle) {
        this.size = size;
        this.angle = angle;
    }
    
    
   private double size;
   private float angle;
}
