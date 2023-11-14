package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

public class TEST_GET_ROW {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        ArrayList<humaneval.buggy.GET_ROW.Tuple> result = humaneval.buggy.GET_ROW.get_row(
            new ArrayList<ArrayList<Integer>>(
                Arrays.asList(
                    new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6)),
                    new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 1, 6)),
                    new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 1))
                )
            ), 1
        );
        org.junit.Assert.assertEquals(
            result, new ArrayList<humaneval.buggy.GET_ROW.Tuple>(Arrays.asList(
                new humaneval.buggy.GET_ROW().new Tuple(0, 0),
                new humaneval.buggy.GET_ROW().new Tuple(1, 4),
                new humaneval.buggy.GET_ROW().new Tuple(1, 0),
                new humaneval.buggy.GET_ROW().new Tuple(2, 5),
                new humaneval.buggy.GET_ROW().new Tuple(2, 0)
            ))
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        ArrayList<humaneval.buggy.GET_ROW.Tuple> result = humaneval.buggy.GET_ROW.get_row(
            new ArrayList<ArrayList<Integer>>(
                Arrays.asList(
                    new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6)),
                    new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6)),
                    new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6)),
                    new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6)),
                    new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6)),
                    new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6))
                )
            ), 2
        );
        org.junit.Assert.assertEquals(
            result, new ArrayList<humaneval.buggy.GET_ROW.Tuple>(Arrays.asList(
                new humaneval.buggy.GET_ROW().new Tuple(0, 1),
                new humaneval.buggy.GET_ROW().new Tuple(1, 1),
                new humaneval.buggy.GET_ROW().new Tuple(2, 1),
                new humaneval.buggy.GET_ROW().new Tuple(3, 1),
                new humaneval.buggy.GET_ROW().new Tuple(4, 1),
                new humaneval.buggy.GET_ROW().new Tuple(5, 1)
            ))
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        ArrayList<humaneval.buggy.GET_ROW.Tuple> result = humaneval.buggy.GET_ROW.get_row(
            new ArrayList<ArrayList<Integer>>(
                Arrays.asList(
                    new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6)),
                    new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6)),
                    new ArrayList<Integer>(Arrays.asList(1, 1, 3, 4, 5, 6)),
                    new ArrayList<Integer>(Arrays.asList(1, 2, 1, 4, 5, 6)),
                    new ArrayList<Integer>(Arrays.asList(1, 2, 3, 1, 5, 6)),
                    new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 1, 6)),
                    new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 1))
                )
            ), 1
        );
        org.junit.Assert.assertEquals(
            result, new ArrayList<humaneval.buggy.GET_ROW.Tuple>(Arrays.asList(
                new humaneval.buggy.GET_ROW().new Tuple(0, 0),
                new humaneval.buggy.GET_ROW().new Tuple(1, 0),
                new humaneval.buggy.GET_ROW().new Tuple(2, 1),
                new humaneval.buggy.GET_ROW().new Tuple(2, 0),
                new humaneval.buggy.GET_ROW().new Tuple(3, 2),
                new humaneval.buggy.GET_ROW().new Tuple(3, 0),
                new humaneval.buggy.GET_ROW().new Tuple(4, 3),
                new humaneval.buggy.GET_ROW().new Tuple(4, 0),
                new humaneval.buggy.GET_ROW().new Tuple(5, 4),
                new humaneval.buggy.GET_ROW().new Tuple(5, 0),
                new humaneval.buggy.GET_ROW().new Tuple(6, 5),
                new humaneval.buggy.GET_ROW().new Tuple(6, 0)
            ))
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        ArrayList<humaneval.buggy.GET_ROW.Tuple> result = humaneval.buggy.GET_ROW.get_row(
            new ArrayList<ArrayList<Integer>>(), 1
        );
        org.junit.Assert.assertEquals(
            result, new ArrayList<humaneval.buggy.GET_ROW.Tuple>()
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        ArrayList<humaneval.buggy.GET_ROW.Tuple> result = humaneval.buggy.GET_ROW.get_row(
            new ArrayList<ArrayList<Integer>>(
                Arrays.asList(
                    new ArrayList<Integer>(Arrays.asList(1))
                )
            ), 2
        );
        org.junit.Assert.assertEquals(
            result, new ArrayList<humaneval.buggy.GET_ROW.Tuple>()
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        ArrayList<humaneval.buggy.GET_ROW.Tuple> result = humaneval.buggy.GET_ROW.get_row(
            new ArrayList<ArrayList<Integer>>(
                Arrays.asList(
                    new ArrayList<Integer>(),
                    new ArrayList<Integer>(Arrays.asList(1)),
                    new ArrayList<Integer>(Arrays.asList(1, 2, 3))
                )
            ), 3
        );
        org.junit.Assert.assertEquals(
            result, new ArrayList<humaneval.buggy.GET_ROW.Tuple>(Arrays.asList(
                new humaneval.buggy.GET_ROW().new Tuple(2, 2)
            ))
        );
    }
}
