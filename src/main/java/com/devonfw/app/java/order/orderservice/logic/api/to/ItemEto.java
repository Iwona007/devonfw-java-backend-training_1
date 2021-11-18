package com.devonfw.app.java.order.orderservice.logic.api.to;

import com.devonfw.app.java.order.orderservice.common.api.Item;
import com.devonfw.module.basic.common.api.to.AbstractEto;

/**
 * Entity transport object of Item
 */
public class ItemEto extends AbstractEto implements Item {

  private static final long serialVersionUID = 1L;

  private String name;

  private String description;

  private double price;

  /**
   * @return name
   */
  @Override
  public String getName() {

    return this.name;
  }

  /**
   * @param name new value of {@link #getname}.
   */
  @Override
  public void setName(String name) {

    this.name = name;
  }

  /**
   * @return description
   */
  @Override
  public String getDescription() {

    return this.description;
  }

  /**
   * @param description new value of {@link #getdescription}.
   */
  @Override
  public void setDescription(String description) {

    this.description = description;
  }

  /**
   * @return price
   */
  @Override
  public double getPrice() {

    return this.price;
  }

  /**
   * @param price new value of {@link #getprice}.
   */
  @Override
  public void setPrice(double price) {

    this.price = price;
  }

  @Override
  public int hashCode() {

    final int prime = 31;
    int result = 1;
    result = prime * result + ((this.description == null) ? 0 : this.description.hashCode());
    result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
    long temp;
    temp = Double.doubleToLongBits(this.price);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    return result;
  }

  @Override
  public boolean equals(Object obj) {

    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    ItemEto other = (ItemEto) obj;
    if (this.description == null) {
      if (other.description != null)
        return false;
    } else if (!this.description.equals(other.description))
      return false;
    if (this.name == null) {
      if (other.name != null)
        return false;
    } else if (!this.name.equals(other.name))
      return false;
    if (Double.doubleToLongBits(this.price) != Double.doubleToLongBits(other.price))
      return false;
    return true;
  }

}
