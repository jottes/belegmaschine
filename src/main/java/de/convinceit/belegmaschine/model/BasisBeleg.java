package de.convinceit.belegmaschine.model;

import de.convinceit.belegmaschine.service.KlaraEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import java.util.UUID;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Data
public class BasisBeleg extends KlaraEntity {

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
