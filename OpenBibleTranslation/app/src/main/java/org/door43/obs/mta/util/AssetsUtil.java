package org.door43.obs.mta.util;

import android.content.Context;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static org.door43.obs.mta.ConstApp.ENC_UTF_8;

/**
 * Utility class for handling assets.
 */
public class AssetsUtil {

	/* CONSTANTS */

    /* FIELDS */

    /* CONSTRUCTORS */

    /* METHODS */

    /**
     * Reads text from file in "/assets/" folder.
     * @param path Path to file.
     * @param context Activity context.
     * @return String from file on given path.
     */
    public static String readTextFromAsset(String path, Context context) {

        StringBuilder documentText = new StringBuilder(200);
        BufferedReader reader = null;
        String line;

        try {
            reader = new BufferedReader(
                    new InputStreamReader(context.getAssets().open(path), ENC_UTF_8));

            // do reading, usually loop until end of file reading
            line = reader.readLine();
            while (line != null) {
                documentText.append(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            Log.e(AssetsUtil.class.getName(), "Error while reading asset: " + path, e);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    Log.w("Error while closing asset reader for: " + path, e);
                }
            }
        }

        return documentText.toString();
    }

    /* GETTERS AND SETTERS */

    /* OBJECT METHODS */

}
