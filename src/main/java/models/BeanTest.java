package models;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;

public class BeanTest {
    public static void main(String[] args) {
        authors at = new authors();
        at.setFirstName("lening");
        at.setLastName("rodas");
        at.setAuthor("lening rodas");
        at.setId(123456);



        quote qt = new quote();
        qt.setId(1234567);
        qt.setAuthor(at);
        qt.getAuthor().getFirstName();
        qt.getContent();
        qt.getAuthor().getLastName();
        qt.setContent("yosemite is a great national park");
        qt.setContent("irelands was awesome");
        qt.setContent("spain wass cool");
        qt.setContent("Holland was hella chill");
        qt.setContent("honduras was a ride");

        ArrayList<String> str = new ArrayList<String>();
        str.add("yosemite is a great national park -" + at.getAuthor());
        str.add("irelands was awesome -" + at.getAuthor());
        str.add("Holland was hella chill -" + at.getAuthor());


        Iterator<String> iter = str.iterator();

        System.out.println("\n amazing quotes from " + at.getFirstName());
        while (iter.hasNext()) {
            System.out.println(iter.next() + " ");
        }

        albums album = new albums();
        album.setAlbumName("2014 forest hills drive");
//        album.getId(1L);
        album.setArtist("J.Cole");
        album.setGenre("hip hop");
        album.setReleaseDate(2014);
        album.setSales(100000);





    }
}
