import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @org.junit.jupiter.api.Test
    void calculate() {
        Task2 task2 = new Task2();
        assertEquals(0, task2.calculate(1,1,1));
    }
}