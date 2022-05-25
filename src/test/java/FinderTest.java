
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class FinderTest {

    @Test
    void checkMatchingTest() {
        assertTrue(Finder.CheckMatching("aab","aa" ));
        assertTrue(Finder.CheckMatching("aab","aba"));
        assertFalse(Finder.CheckMatching("ab","abc" ));
        assertFalse(Finder.CheckMatching("a","b"));
        assertFalse(Finder.CheckMatching("","good"));
        assertFalse(Finder.CheckMatching("good",""));
        assertFalse(Finder.CheckMatching(null,""));
        assertFalse(Finder.CheckMatching(null,null));



    }

    @Test
    void findTest() {
        String[] list = new String[11];
        list[0]="asd";
        list[1]="asdd";
        list[2]="fre";
        list[3]="glk";
        list[4]="lkm";
        list[5]="aaaaaaaaaaaaaaaaaaaaaaaa";
        list[6]="mdld";
        list[7]="rrrttt";
        list[8]="mpodf";
        list[10]="aaudd";
        Finder finder = new Finder(list);
        ArrayList<String> expectedResult = new ArrayList<>();
        expectedResult.add("asd");
        expectedResult.add("asdd");
        assertEquals(expectedResult,finder.find("sad"));
    }
}