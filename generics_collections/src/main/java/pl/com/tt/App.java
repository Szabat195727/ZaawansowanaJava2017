package pl.com.tt;


public class App {

    public static void main(String[] args) {
    	GenericList<String> test = new GenericList<>();
    	test.add("Test0");
    	test.add("Test1");
    	test.add("Test2");
    	test.add("Test3");
    	test.add("Test4");
    	
    	System.out.println(test.get(5).getValue());
    }
}
