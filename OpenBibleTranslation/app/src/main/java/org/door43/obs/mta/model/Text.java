package org.door43.obs.mta.model;

public class Text implements IText {

	/* CONSTANTS */

    /* FIELDS */

    private String frameId;

    private String langCode;

    private String text;

    /* CONSTRUCTORS */

    public Text() {
        super();
    }

    public Text(String frameId, String langCode, String text) {
        this();
        this.frameId = frameId;
        this.langCode = langCode;
        this.text = text;
    }

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
        final StringBuilder sb = new StringBuilder("Text{");
        sb.append("frameId='").append(frameId).append('\'');
        sb.append(", langCode='").append(langCode).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Text)) return false;

        Text text = (Text) o;

        if (frameId != null ? !frameId.equals(text.frameId) : text.frameId != null) return false;
        if (langCode != null ? !langCode.equals(text.langCode) : text.langCode != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = frameId != null ? frameId.hashCode() : 0;
        result = 31 * result + (langCode != null ? langCode.hashCode() : 0);
        return result;
    }
}
