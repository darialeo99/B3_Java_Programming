package day44_map_functions.enum_intro;

public class UsingBrowser {

    public static void main(String[] args) {


        Browser browser = Browser.CHROME;

        switch (browser) {

            case EDGE:
            case CHROME:
                System.out.println("Opening chrome or edge browser");
                break;
            case SAFARI:
                System.out.println("Opening safari browser");
                break;
            case FIREFOX:
                System.out.println("Opening firefox browser");
            default:
                System.out.println("NOT VALID browser");
        }


    }
}
