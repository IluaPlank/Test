import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {
    Numbers sut;
    @BeforeEach
    public void init(){
        System.out.println("начало теста");
        sut = new Numbers();
    }
    @BeforeAll
    public static void started(){
        System.out.println("начало тестировния");
    }
    @AfterAll
    public static void finished(){
        System.out.println("тесты выполнены");
    }
    @Test
    void testSum() {
        // given:
        int expected = 21;
        int number = 6;
        // when:
        int actual = sut.sum(number);
        // then:
        assertEquals(expected,actual);
    }

    @Test
    void TestRoot() {
        // given:
        int expected = 16;
        int degree = 4;
        int number = 2;
        // when:
        int actual = sut.root(number,degree);
        // then:
        assertEquals(expected,actual);
    }
    @Test
    void TestRootNumber(){
        // given:
        double expected = 3;
        int numbers = 9;
        // when:
        double actual = sut.sqrt(numbers);
        // then:
        assertEquals(expected,actual);
    }
}