package de.convinceit.belegmaschine.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import java.util.UUID;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class BasisBeleg {

    @Id
    UUID id;

    long briefbarcode;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public long getBriefbarcode() {
        return briefbarcode;
    }

    public void setBriefbarcode(long briefbarcode) {
        this.briefbarcode = briefbarcode;
    }

}
