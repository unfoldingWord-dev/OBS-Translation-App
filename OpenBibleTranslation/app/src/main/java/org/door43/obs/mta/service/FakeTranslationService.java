package org.door43.obs.mta.service;

import org.door43.obs.mta.model.ITerm;
import org.door43.obs.mta.model.IText;
import org.door43.obs.mta.model.ITranslation;
import org.door43.obs.mta.model.ITranslationNotes;
import org.door43.obs.mta.model.Term;
import org.door43.obs.mta.model.Text;
import org.door43.obs.mta.model.Translation;
import org.door43.obs.mta.model.TranslationNotes;

public class FakeTranslationService implements ITranslationService {

	/* CONSTANTS */

    /* FIELDS */

    /* CONSTRUCTORS */

    /* METHODS */

    @Override
    public ITranslation loadTranslation(String frameId, String langCode) {

        ITranslation translation = new Translation();

        translation.setFrameId(frameId);
        translation.setLangCode(langCode);
        translation.setText("This is my translation of the story frame text...");

        return translation;
    }

    @Override
    public boolean saveTranslation(ITranslation translation) {
        return true;
    }

    @Override
    public IText loadOriginalText(String frameId, String langCode) {

        IText text = new Text("31-01", "en_US",
                "Then Jesus told the disciples to get into the boat and sail to the other side of the lake while he dismissed the crowd. After Jesus had sent the crowd away, he went up on a mountainside to pray. Jesus was there all alone, and he prayed until late at night.");

        return null;
    }

    @Override
    public ITranslationNotes loadTranslationNotes(String frameId) {

        ITranslationNotes notes = new TranslationNotes();

        notes.setFrameId(frameId);

        ITerm term1 = new Term("he dismissed the crowd",
                "This is another way of saying, “he sent the crowd on their way” or, “he told the crowd of people to go back to their homes.”");

        ITerm term2 = new Term("mountainside","That is, “the side of a mountain.”");

        final String notesString =
                "he dismissed the crowd - This is another way of saying, “he sent the crowd on their way” or, “he told the crowd of people to go back to their homes." +
                        "\n\nmountainside - That is, “the side of a mountain.”\"";

        notes.setNotes(notesString);

        return notes;
    }

    public void close(){
        // no resource to close
    }

    /* GETTERS AND SETTERS */

    /* OBJECT METHODS */

}
