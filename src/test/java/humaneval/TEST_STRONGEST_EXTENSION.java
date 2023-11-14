package humaneval;

public class TEST_STRONGEST_EXTENSION {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        String result = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(
            "Watashi", new String[] {"tEN", "niNE", "eIGHt8OKe"}
        );
        org.junit.Assert.assertEquals(
            result, "Watashi.eIGHt8OKe"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        String result = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(
            "Boku233", new String[] {"nani", "NazeDa", "YEs.WeCaNe", "32145tggg"}
        );
        org.junit.Assert.assertEquals(
            result, "Boku233.YEs.WeCaNe"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        String result = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(
            "__YESIMHERE", new String[] {"t", "eMptY", "nothing", "zeR00", "NuLl__", "123NoooneB321"}
        );
        org.junit.Assert.assertEquals(
            result, "__YESIMHERE.NuLl__"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        String result = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(
            "K", new String[] {"Ta", "TAR", "t234An", "cosSo"}
        );
        org.junit.Assert.assertEquals(
            result, "K.TAR"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        String result = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(
            "__HAHA", new String[] {"Tab", "123", "781345", "-_-"}
        );
        org.junit.Assert.assertEquals(
            result, "__HAHA.123"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        String result = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(
            "YameRore", new String[] {"HhAas", "okIWILL123", "WorkOut", "Fails", "-_-"}
        );
        org.junit.Assert.assertEquals(
            result, "YameRore.okIWILL123"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        String result = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(
            "finNNalLLly", new String[] {"Die", "NowW", "Wow", "WoW"}
        );
        org.junit.Assert.assertEquals(
            result, "finNNalLLly.WoW"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        String result = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(
            "_", new String[] {"Bb", "91245"}
        );
        org.junit.Assert.assertEquals(
            result, "_.Bb"
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        String result = humaneval.buggy.STRONGEST_EXTENSION.strongest_extension(
            "Sp", new String[] {"671235", "Bb"}
        );
        org.junit.Assert.assertEquals(
            result, "Sp.671235"
        );
    }
}
