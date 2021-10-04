package de.convinceit.belegmaschine.service;

import lombok.Data;
import org.springframework.data.annotation.Version;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Entity
@MappedSuperclass
@Data
public class KlaraEntity {

    LocalDateTime veraenderungsZeitpunkt;

    @Version
    long aenderungsVersion;
}
