package br.com.andreluisgomes.simplefactory;

import br.com.andreluisgomes.simplefactory.domain.Kakarotto;
import br.com.andreluisgomes.simplefactory.domain.Saiyajin;
import br.com.andreluisgomes.simplefactory.domain.Vegeta;

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
