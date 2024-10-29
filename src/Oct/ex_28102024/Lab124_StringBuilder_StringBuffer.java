package Oct.ex_28102024;

public class Lab124_StringBuilder_StringBuffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Pramod");
        stringBuffer.append("Dutta");
        System.out.println(stringBuffer);
        stringBuffer.reverse();
        System.out.println(stringBuffer);



        StringBuilder stringBuilder = new StringBuilder("Pramod");
        stringBuilder.append("Shrama");
        System.out.println(stringBuilder);
    }
}
