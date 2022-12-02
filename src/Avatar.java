public class Avatar {
    int posX;
    int posY;
    int dX;
    int dY;
    int height;
    int width;
    String power;
    String role;
    String weakness;



    public Avatar(int pPosX, int pPosY, int pDx, int pDy, int pHeight, int pWidth, String pPower, String pRole, String pWeakness){
        posX = pPosX;
        posY = pPosY;
        dX = pDx;
        dY = pDy;
        height = pHeight;
        width = pWidth;
        power = pPower;
        role = pRole;
        weakness = pWeakness;

    }
    public void print(){
        System.out.println("the "+ role + " can "+power+ " and their weakness is "+weakness);
        System.out.println("they are at the location ("+ posX+ ", "+posY + ")");
    }


}
