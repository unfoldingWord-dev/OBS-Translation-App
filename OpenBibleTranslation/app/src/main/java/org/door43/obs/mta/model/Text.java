package org.door43.obs.mta.model;

public class Text implements IText {

	/* CONSTANTS */

    /* FIELDS */

    private String frameId;

    private String langCode;

    private String text;

    /* CONSTRUCTORS */

    /* METHODS */

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

    /* GETTERS AND SETTERS */

    /* OBJECT METHODS */

}
