package org.door43.obs.mta.model;

/**
 * ITranslation
 */
public interface ITranslation extends IPersistenceObject, IText {

    /**
     * @return IETF language tag/code of translation e.g. “en”, “”, “cs” etc.
     */
    String getLangCode();

    /**
     * Sets language code for given translation
     * @param langCode
     */
    void setLangCode(String langCode);

    /**
     * @return Translated text
     */
    String getText();

    /**
     * Sets translated text
     * @param translationText
     */
    void setText(String translationText);


}
