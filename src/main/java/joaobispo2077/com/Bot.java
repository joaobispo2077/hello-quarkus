package joaobispo2077.com;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Bot extends PanacheEntity {
  public String name;
  public String description;
  public int energy;
}
