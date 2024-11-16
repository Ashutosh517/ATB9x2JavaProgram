package Nov.ex_14112024_Static_Wrapper_Exceptions;

public enum APIConstantsEndpoints {

    BASE_URL("https://app.vwo.com");






    private String name;

    APIConstantsEndpoints(String name){
        this.name = name;
    }
    String getValue(){
        return name;
    }
}
