package ligue;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class matchTest {

        @BeforeEach
        void setUp() {
            Combattant John = new Combattant("2", "John", "Close",
                    "Guerrier", 67.88);
            Combattant Marry = new Combattant("1", "Marry", "Bryan",
                    "Loup", 70);
            Combattant Tommy = new Combattant("3", "Tommy", "Tress",
                    "Red", 80);
            Combattant Toavina = new Combattant("4", "Toavina", "Nomena", "Blue", 78.5);

            match Elimination = new match(1, LocalDate.now(), "Stade Mahamasina");
            match Training = new match(2, LocalDate.of(2023, 12, 2), "Paris");
            match game = new match(1, LocalDate.of(2025, 1, 31), "New York");
        }
        @Test
        public void combattant_exist(){
            assertFalse(match.matchStart(Tommy, null));
            assertFalse(match.matchStart(Tommy, Tommy))
        }
        @Test
        public void combattant_in_match(){
            assertEquals("Tommy", setCombattant("John"));
        }

}