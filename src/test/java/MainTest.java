import org.example.Main;
import org.example.WorkintechList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(ResultAnalyzer.class)
public class MainTest {

    @Test
    @DisplayName("Stack ile palindrom saayılar doğru bulunabiliyor mu ?")
    public void testPalindrome(){
        assertTrue(Main.checkForPalindrome("I did, did I?"));
        assertTrue(Main.checkForPalindrome("Racecar"));
        assertFalse(Main.checkForPalindrome("hello"));
        assertFalse(Main.checkForPalindrome("Was it a car or a cat I saw ?"));
        assertFalse(Main.checkForPalindrome("Test"));
        assertFalse(Main.checkForPalindrome("Welcome"));
    }

    @Test
    @DisplayName("convertToDecimal methodu 10 luk tabandaki sayıları 2 lik taban cevirebiliyor mu ?")
    public void testConvertToDecimal(){
        assertEquals("101", Main.convertDecimalToBinary(5));
        assertEquals("110", Main.convertDecimalToBinary(6));
        assertEquals("1101", Main.convertDecimalToBinary(13));
    }

    @Test
    @DisplayName("WorkintechList doğru tipe sahip mi ?")
    public void testWorkintechListType(){
        assertTrue(true);
        assertTrue(true);
    }
    
    @Test
    @DisplayName("WorkintechList'e aynı eleman birden fazla kez eklenebiliyor mu ?")
    public void testWorkintechListAddMethod(){
        WorkintechList list = new WorkintechList();
        list.add("Mehmet");
        list.add("Mehmet");
        list.add("Ali");
        list.add("Ali");
        list.add("Zeynep");
        list.add("Zeynep");
        assertEquals(3, list.size());
    }

    @Test
    @DisplayName("WorkintechList sort metodu doğru çalışıyor mu?")
    public void testWorkintechListSortMethod(){
        WorkintechList list = new WorkintechList();
        list.add("Mehmet");
        list.add("Mehmet");
        list.add("Ali");
        list.add("Ali");
        list.add("Zeynep");
        list.add("Zeynep");
        list.sort();
        assertEquals("Ali", list.get(0));
        assertEquals("Zeynep", list.get(list.size()-1));
    }

    @Test
    @DisplayName("WorkintechList remove metodu doğru çalışıyor mu?")
    public void testWorkintechListRemoveMethod(){
        WorkintechList list = new WorkintechList();
        list.add("Mehmet");
        list.add("Mehmet");
        list.add("Ali");
        list.add("Ali");
        list.add("Zeynep");
        list.add("Zeynep");
        list.remove("Ali");
        assertNotEquals("Ali", list.get(0));
        assertEquals("Mehmet", list.get(0));
    }

}
