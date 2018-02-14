package br.com.andreluisgomes.enumfactory;

import br.com.andreluisgomes.enumfactory.domain.DarkElves;
import br.com.andreluisgomes.enumfactory.domain.Elves;
import br.com.andreluisgomes.enumfactory.domain.LightElves;

public enum ElvesTypeEnumFactory {

    LIGHT {

        @Override
        public Elves createElves() {
            return new LightElves();
        }
    },

    DARK {

        @Override
        public Elves createElves() {
            return new DarkElves();
        }
    };

    public abstract Elves createElves();
}
