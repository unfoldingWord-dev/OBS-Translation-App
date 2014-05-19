package org.door43.obs.mta.model;

/**
 * IFrame consists of:
 * <ul>
 *     <li>original text</li>
 *     <li>translation notes</li>
 *     <li>translation</li>
 * </ul>
 */
public interface IFrame {

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
     * @return Original text for frame.
     */
    IText getOriginalText();

    /**
     * Sets original text for frame.
     * @param text
     */
    void setOriginalText(IText text);


    /**
     * @return Translation for given frame.
     */
    ITranslation getTranslation();

    /**
     * Sets translation for give frame.
     * @param translation
     */
    void setTranslation(ITranslation translation);


    /**
     * @return Translation notes for given frame.
     */
    ITranslationNotes getTranslationNotes();

    /**
     * Sets translation notes for given frame.
     * @param notes
     */
    void setTranslationNotes(ITranslationNotes notes);

}
