package org.door43.obs.mta.model;

import java.util.LinkedHashSet;
import java.util.Set;

public class TranslationNotes implements ITranslationNotes {

	/* CONSTANTS */

    /* FIELDS */

    private String frameId;

    private Set<ITerm> terms = new LinkedHashSet<ITerm>();

    /* CONSTRUCTORS */

    /* METHODS */

    /* GETTERS AND SETTERS */

    @Override
    public String getFrameId() {
        return null;
    }

    @Override
    public void setFrameId(String frameId) {

    }

    @Override
    public boolean addTerm(ITerm term) {

        if (term != null) {
            return this.terms.add(term);
        }

        return false;
    }

    @Override
    public boolean replaceTerm(ITerm term) {

        if (term != null && terms.contains(term)) {
            terms.remove(term);
            terms.add(term);
            return true;
        }

        return false;

    }

    @Override
    public boolean deleteTerm(ITerm term) {
        if (term != null) {
            return this.terms.remove(term);
        }
        return false;
    }

    @Override
    public void setTerms(Set<ITerm> terms) {
        this.terms.clear();
        if (terms != null && !terms.isEmpty()) {
            this.terms.addAll(terms);
        }
    }

    @Override
    public Set<ITerm> getTerms() {
        return terms;
    }

    /* OBJECT METHODS */

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TranslationNotes{");
        sb.append("frameId='").append(frameId).append('\'');
        sb.append(", terms=").append(terms.size());
        sb.append('}');
        return sb.toString();
    }
}
