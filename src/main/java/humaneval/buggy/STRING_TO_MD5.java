package humaneval.buggy;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.xml.bind.DatatypeConverter;

// Given a string 'text', return its md5 hash equivalent string.
// If 'text' is an empty string, return None.

// >>> string_to_md5('Hello world') == '3e25960a79dbc69b674cd4ec67a72c62'

public class STRING_TO_MD5 {
    public static String string_to_md5(String text) throws NoSuchAlgorithmException {
        if (text.equals("")) return null;

        MessageDigest md = MessageDigest.getInstance("SHA-384");
        md.update(text.getBytes());
        byte[] digest = md.digest();
        return DatatypeConverter.printHexBinary(digest).toLowerCase();
    } 
}
