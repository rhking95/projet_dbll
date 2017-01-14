package com.dbll;

import com.dbll.Voitures;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-01-14T11:24:45")
@StaticMetamodel(Marques.class)
public class Marques_ { 

    public static volatile SingularAttribute<Marques, String> nomm;
    public static volatile SingularAttribute<Marques, Integer> idm;
    public static volatile SingularAttribute<Marques, String> logoM;
    public static volatile CollectionAttribute<Marques, Voitures> voituresCollection;

}