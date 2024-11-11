package Nov.ex_07112024_OOPs_Inheritance_Singleinheritance.Real;

public class TestCase1 extends Common_BaseTest {
    TestCase1() {
        System.out.println("DC - Child");
    }
    void testcase(){
        startBrowser();
        readExcelFile();
        closeBrowser();
    }
}
