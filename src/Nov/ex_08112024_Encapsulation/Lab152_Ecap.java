package Nov.ex_08112024_Encapsulation;

public class Lab152_Ecap {
    public static void main(String[] args) {
        VWOLogin vwoLogin = new VWOLogin("admin", "password123");
        System.out.println(vwoLogin.password);
        vwoLogin.password = "hacker";
        System.out.println(vwoLogin.password);

        GoodVWOLogin vwoLogin1 = new GoodVWOLogin("admin123", "goodadmin");
//        System.out.println(vwoLogin1.password);// Password can not access
//        vwoLogin1.password = "pass123";//
    //    String pass = vwoLogin1.giveMePassword(false);

        String pass = vwoLogin1.getPassword(true);
     //   vwoLogin1.setPassword("hacker123");
        vwoLogin1.setPassword("hacker",true);
        System.out.println(pass);
    }
}

class VWOLogin {
    public String username;
    public String password;

    public VWOLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

class GoodVWOLogin {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword(boolean isAdmin) {
        if(isAdmin){
            return password;
        }
        return "None";
    }
    public void setPassword(String password, boolean isAdmin){
        if(isAdmin){
            this.password = password;
        }else {
            System.out.println("Not Allowed");
        }
    }

//    public void setPassword(String password) {
//        this.password = password;
//    }

    public GoodVWOLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

//    public String giveMePassword(Boolean isAuth) {
//        if(isAuth){
//            return username;
//        }
//        return "None";
//    }

}
