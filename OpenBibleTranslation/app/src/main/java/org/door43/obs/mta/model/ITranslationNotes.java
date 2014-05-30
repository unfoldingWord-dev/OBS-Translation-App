package org.door43.obs.mta.model;

import java.util.Set;

/**
 * ITranslation note object:
 * <ul>
 *     <li>holds translation notes for one frame</li>
 * </ul>
 */
public interface ITranslationNotes {

    /**
     * Identification of related {@link org.door43.obs.mta.model.IFrame}
     * @return Frame ID.
     */
    String getFrameId();

    /**
     * Sets related frame ID
     * @param frameId
     */
    void setFrameId(String frameId);

    /**
     * @return Notes string.
     */
    String getNotes();

    /**
     * Set notes.
     * @param notes Can be string or HTML or whatever for now.
     */
    void setNotes(String notes);

}
