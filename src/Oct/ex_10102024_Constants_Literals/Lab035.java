package Oct.ex_10102024_Constants_Literals;

public class Lab035 {
    public static void main(String[] args) {
        // Char literal

        char c1 = 'A';
        char c2 = 'b';
        char c3 = '@';

        // Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char car_r = '\r';

        System.out.println("Ashutosh"+ new_line + "Mall");//New line
        System.out.println("Ashutosh"+"Mall");// Same line
        System.out.println("Ashutosh"+ tab_line + "Mall");//Four space b/w Ashutosh & mall
        System.out.println("Ashutosh"+ back_space + "Mall");// 1 character delete from Ashutosh
        System.out.println("Ashutosh"+ car_r + "Mall");// Delete previous words

        char c11 = '\u1F60';





    }
}
