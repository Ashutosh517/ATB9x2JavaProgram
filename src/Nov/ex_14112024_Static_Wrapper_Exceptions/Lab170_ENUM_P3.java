package Nov.ex_14112024_Static_Wrapper_Exceptions;



public class Lab170_ENUM_P3 {

    public static void main(String[] args) {
        System.out.println(color.RED.getHexcode());

//        if(color.GREEN.getHexcode() == "#61FF33"){
//            System.out.println("Color is Green");
//        }
    }
}


enum color {

    RED("#f0000");
  //  GREEN(Hexcode:"#61FF33");


    private String Hexcode;

    color(String Hexcode){
        this.Hexcode = Hexcode;
    }

    String getHexcode(){
        return this.Hexcode;
    }


}
