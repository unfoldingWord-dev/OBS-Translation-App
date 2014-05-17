package org.door43.obs.mta.model;

/**
 * This interface is used for Term definition.
 * Term consists of:
 * <ul>
 *     <li>word - word / term it self</li>
 *     <li>description - word's description</li>
 * </ul>
 *
 * Example:
 *
 * <pre>
 *      word: the beginning
 *      description: That is, "the beginning of all things," before anything existed except God.
 * </pre>
 * */
public interface ITerm {

    /**
     * @return Word of given term.
     */
    String getWord();

    /**
     * Sets word of given term.
     * @param word
     */
    void setWord(String word);

    /**
     * @return Description of given term.
     */
    String getDescription();

    /**
     * Sets description of given term.
     * @param description
     */
    void setDescription(String description);

}
