package br.com.andreluisgomes.servicelocator;

import br.com.andreluisgomes.servicelocator.domain.Hobbit;

public interface HobbitFactory {

    Hobbit getHobbit(String name);
}
