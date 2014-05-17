package org.door43.obs.mta.model;

public class Term implements ITerm {

    /* CONSTANTS */

    /* FIELDS */

    private String word;

    private String description;

    /* CONSTRUCTOR */

    /* METHODS */

    /* GETTERS / SETTERS */

    @Override
    public String getWord() {
        return word;
    }

    @Override
    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    /* OBJECT METHODS */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Term term = (Term) o;

        if (word != null ? !word.equals(term.word) : term.word != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return word != null ? word.hashCode() : 0;
    }

}
