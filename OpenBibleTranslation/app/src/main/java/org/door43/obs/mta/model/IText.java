package org.door43.obs.mta.model;

/**
 * General interface for any "text" to be used in this translation application.
 * <p>
 * Existence of following field is always expected:
 * <ul>
 *     <li>frame ID</li>
 *     <li>language code</li>
 *     <li>text</li>
 * </ul>
 * </p>
 */
public interface IText {

    /**
     * @return String representation of frame ID.<br/>
     * Example: "29-01"
     */
    String getFrameId();

    /**
     * Set's frame ID.
     * @param frameId
     */
    void setFrameId(String frameId);

    /**
     * @return Text
     */
    String getText();

    /**
     * Sets text of the frame.
     * @param text
     */
    void setText(String text);

    /**
     * @return IETF language tag/code of given text e.g. “en”, “”, “cs” etc.
     */
    String getLangCode();

    /**
     * Sets language code for given text.<br/>
     * IETF language tag/code is expected e.g. “en”, “”, “cs” etc.
     * @param langCode
     */
    void setLangCode(String langCode);

}
