package Nov.ex_11112024_Encapsulation_Part21.REAL;

public class BaseClass {

    private String browser;

    BaseClass(){ // Default Constractor
        System.out.println("DC - BaseClass");
    }

    BaseClass(String b){ // Parametrise Constractor
        System.out.println("CC - BaseClass");
    }



    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean isAuth) {
        if(isAuth){
            this.browser = browser;
        }else {
            System.out.println("Not Allowed");
        }
    }

    void openBrowser(){
        System.out.println("Opening Browser!!");
    }

    void openBrowser(String browserName){// Method Overloading
        System.out.println("Opening Browser!!");
    }

    void closeBrowser(){
        System.out.println("Close Browser!!");
    }





}
