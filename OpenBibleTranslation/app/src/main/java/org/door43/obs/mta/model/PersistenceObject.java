package org.door43.obs.mta.model;

import java.util.Date;

/**
 * Abstract class for objects that should be persisted in DB.
 */
public abstract class PersistenceObject implements IPersistenceObject {

	/* CONSTANTS */

    /* FIELDS */

    private Integer id;

    private Date created;

    private Date updated;

    /* CONSTRUCTORS */

    /* METHODS */

    /* GETTERS AND SETTERS */

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public Date getCreated() {
        return created;
    }

    @Override
    public void setCreated(Date created) {
        this.created = created;
    }

    @Override
    public Date getUpdated() {
        return updated;
    }

    @Override
    public void setUpdated(Date updated) {
        this.updated = updated;
    }


    /* OBJECT METHODS */

    @Override
    public String toString() {
        return "PersistenceObject{" +
                "id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersistenceObject that = (PersistenceObject) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
