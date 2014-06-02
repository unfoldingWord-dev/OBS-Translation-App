package org.door43.obs.mta.model;

public class TranslationNotes implements ITranslationNotes {

	/* CONSTANTS */

    /* FIELDS */

    private String frameId;

    private String notes;

    /* CONSTRUCTORS */

    /* METHODS */

    /* GETTERS AND SETTERS */

    @Override
    public String getFrameId() {
        return frameId;
    }

    @Override
    public void setFrameId(String frameId) {
        this.frameId = frameId;
    }

    @Override
    public String getNotes() {
        return notes;
    }

    @Override
    public void setNotes(String notes) {
        this.notes = notes;
    }

    /* OBJECT METHODS */

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TranslationNotes{");
        sb.append("frameId='").append(frameId).append('\'');
        sb.append(", notes=").append(notes);
        sb.append('}');
        return sb.toString();
    }
}
