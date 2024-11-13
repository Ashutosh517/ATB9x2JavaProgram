package Nov.ex_11112024_Encapsulation_Part21.police;

public class Cop {
    private int gun;
    public String iCard;

    public Cop(int gun){ // public constractor
        this.gun = gun;
    }

    protected void canIShoot(){ // normal method
        System.out.println("Yes, You can!");
    }



}




