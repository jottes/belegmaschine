package de.convinceit.belegmaschine.regelwerk;

import de.convinceit.belegmaschine.model.BasisBeleg;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service("basisRegelwerk")
public class KlaraBasisRegelwerk<T extends BasisBeleg> {

    public BigDecimal ermittleBemessungsgrundlage(T beleg) {

        //(Tagessatz * Tage) vs. Rechungsbetrag
        return BigDecimal.valueOf(1);
    }

}
