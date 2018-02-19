package br.com.andreluisgomes.factorymethod;

import br.com.andreluisgomes.factorymethod.domain.Kakarotto;
import br.com.andreluisgomes.factorymethod.domain.Saiyajin;
import br.com.andreluisgomes.factorymethod.domain.Vegeta;

/**
 * Created by andre on 16/02/18.
 */
public class SaiyajinFactory {

    public static Saiyajin withPower(final Long power){
        if(power < 3000)
            return new Vegeta(power);
        else if (power > 8000)
            return new Kakarotto(power);
        return null;
    }
}
