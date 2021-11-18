package com.devonfw.app.java.order.orderservice.logic.api.to;

import org.springframework.data.domain.Pageable;

import com.devonfw.app.java.order.general.common.api.to.AbstractSearchCriteriaTo;
import com.devonfw.module.basic.common.api.query.StringSearchConfigTo;

public class ItemSearchCriteriaTo extends AbstractSearchCriteriaTo {

  private String name;

  private String description;

  private Double price;

  private StringSearchConfigTo nameOption;

  private StringSearchConfigTo descriptionOption;

  private Pageable pageable;

  /**
   * @return name
   */
  public String getName() {

    return this.name;
  }

  /**
   * @param name new value of {@link #getname}.
   */
  public void setName(String name) {

    this.name = name;
  }

  /**
   * @return description
   */
  public String getDescription() {

    return this.description;
  }

  /**
   * @param description new value of {@link #getdescription}.
   */
  public void setDescription(String description) {

    this.description = description;
  }

  /**
   * @return price
   */
  public Double getPrice() {

    return this.price;
  }

  /**
   * @param price new value of {@link #getprice}.
   */
  public void setPrice(Double price) {

    this.price = price;
  }

  /**
   * @return nameOption
   */
  public StringSearchConfigTo getNameOption() {

    return this.nameOption;
  }

  /**
   * @param nameOption new value of {@link #getnameOption}.
   */
  public void setNameOption(StringSearchConfigTo nameOption) {

    this.nameOption = nameOption;
  }

  /**
   * @return descriptionOption
   */
  public StringSearchConfigTo getDescriptionOption() {

    return this.descriptionOption;
  }

  /**
   * @param descriptionOption new value of {@link #getdescriptionOption}.
   */
  public void setDescriptionOption(StringSearchConfigTo descriptionOption) {

    this.descriptionOption = descriptionOption;
  }

  /**
   * @return pageable
   */
  @Override
  public Pageable getPageable() {

    return this.pageable;
  }

  /**
   * @param pageable new value of {@link #getpageable}.
   */
  @Override
  public void setPageable(Pageable pageable) {

    this.pageable = pageable;
  }

}
