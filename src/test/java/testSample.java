import Framework.dataDriven;

import java.io.IOException;
import java.util.ArrayList;

public class testSample {

    public static void main(String[] args) throws IOException {

        dataDriven d = new dataDriven();
        ArrayList<String> data=d.getData("Add profile");
        System.out.println(data.get(0));
        System.out.println(data.get(1));
        System.out.println(data.get(2));
        System.out.println(data.get(3));
        System.out.println(data.get(4));
        System.out.println("Good day 208");
        System.out.println("Good day 208");
        System.out.println("Good day 208");
        System.out.println("Good day 208");System.out.println("Good day 208");


    }
}
