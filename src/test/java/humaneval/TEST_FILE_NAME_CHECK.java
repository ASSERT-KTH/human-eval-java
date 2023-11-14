package humaneval;

public class TEST_FILE_NAME_CHECK {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("example.txt");
        org.junit.Assert.assertEquals(
            result, "Yes"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("1example.dll");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("s1sdf3.asd");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("K.dll");
        org.junit.Assert.assertEquals(
            result, "Yes"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("MY16FILE3.exe");
        org.junit.Assert.assertEquals(
            result, "Yes"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("His12FILE94.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("_Y.txt");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check("?aREYA.exe");
        org.junit.Assert.assertEquals(
            result, "No"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        String[] inputs = new String[] {
            "/this_is_valid.dll", "this_is_valid.wow", "this_is_valid.txt", "this_is_valid.txtexe", "#this2_i4s_5valid.ten", "@this1_is6_valid.exe",
            "this_is_12valid.6exe4.txt", "all.exe.txt", "I563_No.exe", "Is3youfault.txt", "no_one#knows.dll", "1I563_Yes3.exe",
            "I563_Yes3.txtt", "final..txt", "final132", "_f4indsartal132."
        };
        String[] outputs = new String[] {
            "No", "No", "Yes", "No", "No", "No",
            "No", "No", "Yes", "Yes", "Yes", "No",
            "No", "No", "No", "No"
        };
        for (int i = 0; i < inputs.length; i += 1){
            String result = humaneval.buggy.FILE_NAME_CHECK.file_name_check(inputs[i]);
            org.junit.Assert.assertEquals(
                result, outputs[i]
            );
        }
    }
}
