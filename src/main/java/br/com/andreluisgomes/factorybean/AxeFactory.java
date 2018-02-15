package br.com.andreluisgomes.factorybean;

import br.com.andreluisgomes.factorybean.domain.Axe;
import br.com.andreluisgomes.factorybean.domain.Hands;
import br.com.andreluisgomes.factorybean.domain.WeaponType;
import org.springframework.beans.factory.FactoryBean;

public class AxeFactory implements FactoryBean<Axe> {

    private int attack;
    private int defense;
    private Hands hands;
    private WeaponType type;

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setHands(Hands hands) {
        this.hands = hands;
    }

    public void setType(WeaponType type) {
        this.type = type;
    }

    @Override
    public Axe getObject() throws Exception {
        return new Axe(attack,defense,hands,type);
    }

    @Override
    public Class<?> getObjectType() {
        return Axe.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
