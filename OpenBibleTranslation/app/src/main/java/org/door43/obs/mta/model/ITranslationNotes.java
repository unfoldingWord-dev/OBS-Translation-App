package org.door43.obs.mta.model;

import java.util.Set;

/**
 * ITranslation note object:
 * <ul>
 *     <li>holds translation notes for one frame</li>
 *     <li>provide methods for adding/removing/searching {@link org.door43.obs.mta.model.ITerm}
 *     objects</li>
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
     * Adds given term to translation notes.
     * @param term
     * @return True if term was added to set.
     */
    public boolean addTerm(ITerm term);

    /**
     * Replaces given term in translation notes.
     * @param term
     * @return True if term was replaced in translation notes.
     */
    boolean replaceTerm(ITerm term);

    /**
     * Deletes given term from translation notes.
     * @param term
     * @return True if given term was deleted from translation notes.
     */
    boolean deleteTerm(ITerm term);

    /**
     * Sets terms for translation notes.
     * @param terms
     */
    void setTerms(Set<ITerm> terms);

    /**
     * Returns all terms for translation notes.<br/>
     * This method should never return null!
     * @return
     */
    Set<ITerm> getTerms();

}
