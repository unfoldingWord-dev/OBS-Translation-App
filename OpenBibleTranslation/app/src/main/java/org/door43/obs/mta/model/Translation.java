package org.door43.obs.mta.model;

public class Translation extends PersistenceObject implements ITranslation {

	/* CONSTANTS */

    /* FIELDS */

    private String frameId;

    private String langCode;

    private String text;

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
    public String getLangCode() {
        return langCode;
    }

    @Override
    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }

    /* OBJECT METHODS */

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Translation{");
        sb.append("id='").append(getId()).append('\'');
        sb.append("frameId='").append(frameId).append('\'');
        sb.append(", langCode='").append(langCode).append('\'');
        sb.append('}');
        return sb.toString();
    }
}