package org.door43.obs.mta.model;

public class Frame implements IFrame {

	/* CONSTANTS */

    /* FIELDS */

    private String frameId;

    private IText originalText;

    private ITranslation translation;

    private ITranslationNotes translationNotes;

    /* CONSTRUCTORS */

    /* METHODS */

    /* GETTERS AND SETTERS */

    @Override
    public IText getOriginalText() {
        return originalText;
    }

    @Override
    public void setOriginalText(IText originalText) {
        this.originalText = originalText;
    }

    @Override
    public ITranslation getTranslation() {
        return translation;
    }

    @Override
    public void setTranslation(ITranslation translation) {
        this.translation = translation;
    }

    @Override
    public ITranslationNotes getTranslationNotes() {
        return translationNotes;
    }

    @Override
    public void setTranslationNotes(ITranslationNotes translationNotes) {
        this.translationNotes = translationNotes;
    }

    @Override
    public String getFrameId() {
        return frameId;
    }

    @Override
    public void setFrameId(String frameId) {
        this.frameId = frameId;
    }

    /* OBJECT METHODS */

    @Override
    public String toString() {
        return "Frame{" +
                "frameId='" + frameId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Frame)) return false;

        Frame frame = (Frame) o;

        if (frameId != null ? !frameId.equals(frame.frameId) : frame.frameId != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return frameId != null ? frameId.hashCode() : 0;
    }
}
