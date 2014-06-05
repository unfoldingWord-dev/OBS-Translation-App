package org.door43.obs.mta.util;

/**
 * Utility methods for String object.
 */
public class StringUtils {

	/* CONSTANTS */

    /* FIELDS */

    /* CONSTRUCTORS */

    /* METHODS */

    /**
     * Equivalent of org.apache.commons.lang.StringUtils#isBlank(String str) method.
     * @param text
     * @return True if given text is null or has no visible content.
     */
    public static boolean isBlank(String text) {

        int strLen = 0;
        if (text == null || (strLen = text.trim().length()) == 0) {
            return true;
        }

        //Consider whitespace to determine if it is blank
        for (int i = 0; i < strLen; i++) {
            if ((!Character.isWhitespace(text.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

    /* GETTERS AND SETTERS */

    /* OBJECT METHODS */

}
