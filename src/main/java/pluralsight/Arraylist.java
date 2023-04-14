package pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        int remaining = -4;
        List<String> urlList = new ArrayList<>();
        urlList.add("https://pluralsight.com/search?q=java");
        urlList.add("https://medium.com/search?q=java");
        urlList.add("https://stackoverflow.com/questions/tagged/java");
        urlList.add("https://stackoverflow.com/search?q=java+list");
        urlList.add("https://reddit.com/r/java");
        urlList.add("https://reddit.com/r/javahelp");
        urlList.sort(null);

        List<String> firstTwo = urlList.subList(0,2);
        System.out.println((2 - urlList.size()));

        System.out.println(firstTwo + "\n" + "And " + remaining + " more");
        List<String> remainingUrls = urlList.subList(2,urlList.size());
        System.out.println(remainingUrls);


        System.out.println("Links from stackoverflow.com:");
        for (String u : urlList){
            if ( u.contains("stackoverflow.com")){
                System.out.println(u);
            }

        }
        boolean del = urlList.remove("https://medium.com/search?q=java");
        System.out.println("Removed Medium result: " + del);
        System.out.println(urlList);







    }
}
