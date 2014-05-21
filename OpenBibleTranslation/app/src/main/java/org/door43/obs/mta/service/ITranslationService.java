package org.door43.obs.mta.service;

import org.door43.obs.mta.model.IText;
import org.door43.obs.mta.model.ITranslation;
import org.door43.obs.mta.model.ITranslationNotes;

/**
 * This is the main service "facade" for handling translations.
 */
public interface ITranslationService {

    /**
     * Intended for loading {@link org.door43.obs.mta.model.ITranslation} object.
     * @param frameId Frame ID.
     * @param langCode Language code.
     * @return Loads {@link org.door43.obs.mta.model.ITranslation} object based
     * on passed criteria.
     */
    public ITranslation loadTranslation(String frameId, String langCode);

    /**
     * Intended for saving {@link org.door43.obs.mta.model.ITranslation} object.
     * @param translation Translation object to be saved.
     * @return True if succeeded.
     */
    public boolean saveTranslation(ITranslation translation);

    /**
     * Intended for loading original frame text.
     * @param frameId Frame ID.
     * @param langCode Language code. Optional.
     * @return Original test for given story frame and language code.
     */
    public IText loadOriginalText(String frameId, String langCode);

    /**
     * Intended for loading translation notes for given frame.
     * @param frameId Frame ID.
     * @return Translation notes for given story frame.
     */
    public ITranslationNotes loadTranslationNotes(String frameId);

}
