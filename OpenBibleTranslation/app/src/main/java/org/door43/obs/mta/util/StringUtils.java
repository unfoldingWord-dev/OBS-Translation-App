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

        if (text == null || text.trim().length() == 0) {
            return true;
        }

        return false;
    }

    /* GETTERS AND SETTERS */

    /* OBJECT METHODS */

}
