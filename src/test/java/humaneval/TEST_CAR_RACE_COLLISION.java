package humaneval;

public class TEST_CAR_RACE_COLLISION {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        int result = humaneval.buggy.CAR_RACE_COLLISION.car_race_collision(2);
        org.junit.Assert.assertEquals(
            result, 4
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        int result = humaneval.buggy.CAR_RACE_COLLISION.car_race_collision(3);
        org.junit.Assert.assertEquals(
            result, 9
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        int result = humaneval.buggy.CAR_RACE_COLLISION.car_race_collision(4);
        org.junit.Assert.assertEquals(
            result, 16
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        int result = humaneval.buggy.CAR_RACE_COLLISION.car_race_collision(8);
        org.junit.Assert.assertEquals(
            result, 64
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        int result = humaneval.buggy.CAR_RACE_COLLISION.car_race_collision(10);
        org.junit.Assert.assertEquals(
            result, 100
        );
    }
}
