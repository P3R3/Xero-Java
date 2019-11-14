/*
 * Xero Payroll AU
 * This is the Xero Payroll API for orgs in Australia region.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.xero.models.payrollau;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.models.payrollau.SuperannuationCalculationType;
import com.xero.models.payrollau.SuperannuationContributionType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * SuperannuationLine
 */

public class SuperannuationLine {
  
  @JsonProperty("SuperMembershipID")
  private UUID superMembershipID;

  
  @JsonProperty("ContributionType")
  private SuperannuationContributionType contributionType;

  
  @JsonProperty("CalculationType")
  private SuperannuationCalculationType calculationType;

  
  @JsonProperty("MinimumMonthlyEarnings")
  private Float minimumMonthlyEarnings;

  
  @JsonProperty("ExpenseAccountCode")
  private String expenseAccountCode;

  
  @JsonProperty("LiabilityAccountCode")
  private String liabilityAccountCode;

  
  @JsonProperty("PaymentDateForThisPeriod")
  private String paymentDateForThisPeriod;

  
  @JsonProperty("Percentage")
  private Float percentage;

  
  @JsonProperty("Amount")
  private Float amount;

  public SuperannuationLine superMembershipID(UUID superMembershipID) {
    this.superMembershipID = superMembershipID;
    return this;
  }

   /**
   * Xero identifier for payroll super fund membership ID.
   * @return superMembershipID
  **/
  @ApiModelProperty(example = "e0eb6747-7c17-4075-b804-989f8d4e5d39", value = "Xero identifier for payroll super fund membership ID.")
  public UUID getSuperMembershipID() {
    return superMembershipID;
  }

  public void setSuperMembershipID(UUID superMembershipID) {
    this.superMembershipID = superMembershipID;
  }

  public SuperannuationLine contributionType(SuperannuationContributionType contributionType) {
    this.contributionType = contributionType;
    return this;
  }

   /**
   * Get contributionType
   * @return contributionType
  **/
  @ApiModelProperty(value = "")
  public SuperannuationContributionType getContributionType() {
    return contributionType;
  }

  public void setContributionType(SuperannuationContributionType contributionType) {
    this.contributionType = contributionType;
  }

  public SuperannuationLine calculationType(SuperannuationCalculationType calculationType) {
    this.calculationType = calculationType;
    return this;
  }

   /**
   * Get calculationType
   * @return calculationType
  **/
  @ApiModelProperty(value = "")
  public SuperannuationCalculationType getCalculationType() {
    return calculationType;
  }

  public void setCalculationType(SuperannuationCalculationType calculationType) {
    this.calculationType = calculationType;
  }

  public SuperannuationLine minimumMonthlyEarnings(Float minimumMonthlyEarnings) {
    this.minimumMonthlyEarnings = minimumMonthlyEarnings;
    return this;
  }

   /**
   * Superannuation minimum monthly earnings.
   * @return minimumMonthlyEarnings
  **/
  @ApiModelProperty(example = "100.5", value = "Superannuation minimum monthly earnings.")
  public Float getMinimumMonthlyEarnings() {
    return minimumMonthlyEarnings;
  }

  public void setMinimumMonthlyEarnings(Float minimumMonthlyEarnings) {
    this.minimumMonthlyEarnings = minimumMonthlyEarnings;
  }

  public SuperannuationLine expenseAccountCode(String expenseAccountCode) {
    this.expenseAccountCode = expenseAccountCode;
    return this;
  }

   /**
   * Superannuation expense account code.
   * @return expenseAccountCode
  **/
  @ApiModelProperty(example = "450", value = "Superannuation expense account code.")
  public String getExpenseAccountCode() {
    return expenseAccountCode;
  }

  public void setExpenseAccountCode(String expenseAccountCode) {
    this.expenseAccountCode = expenseAccountCode;
  }

  public SuperannuationLine liabilityAccountCode(String liabilityAccountCode) {
    this.liabilityAccountCode = liabilityAccountCode;
    return this;
  }

   /**
   * Superannuation liability account code
   * @return liabilityAccountCode
  **/
  @ApiModelProperty(example = "650", value = "Superannuation liability account code")
  public String getLiabilityAccountCode() {
    return liabilityAccountCode;
  }

  public void setLiabilityAccountCode(String liabilityAccountCode) {
    this.liabilityAccountCode = liabilityAccountCode;
  }

  public SuperannuationLine paymentDateForThisPeriod(String paymentDateForThisPeriod) {
    this.paymentDateForThisPeriod = paymentDateForThisPeriod;
    return this;
  }

   /**
   * Superannuation payment date for the current period (YYYY-MM-DD)
   * @return paymentDateForThisPeriod
  **/
  @ApiModelProperty(example = "2019-10-01", value = "Superannuation payment date for the current period (YYYY-MM-DD)")
  public String getPaymentDateForThisPeriod() {
    return paymentDateForThisPeriod;
  }

  public void setPaymentDateForThisPeriod(String paymentDateForThisPeriod) {
    this.paymentDateForThisPeriod = paymentDateForThisPeriod;
  }

  public SuperannuationLine percentage(Float percentage) {
    this.percentage = percentage;
    return this;
  }

   /**
   * Superannuation percentage
   * @return percentage
  **/
  @ApiModelProperty(example = "4.0", value = "Superannuation percentage")
  public Float getPercentage() {
    return percentage;
  }

  public void setPercentage(Float percentage) {
    this.percentage = percentage;
  }

  public SuperannuationLine amount(Float amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Superannuation amount
   * @return amount
  **/
  @ApiModelProperty(example = "10.5", value = "Superannuation amount")
  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuperannuationLine superannuationLine = (SuperannuationLine) o;
    return Objects.equals(this.superMembershipID, superannuationLine.superMembershipID) &&
        Objects.equals(this.contributionType, superannuationLine.contributionType) &&
        Objects.equals(this.calculationType, superannuationLine.calculationType) &&
        Objects.equals(this.minimumMonthlyEarnings, superannuationLine.minimumMonthlyEarnings) &&
        Objects.equals(this.expenseAccountCode, superannuationLine.expenseAccountCode) &&
        Objects.equals(this.liabilityAccountCode, superannuationLine.liabilityAccountCode) &&
        Objects.equals(this.paymentDateForThisPeriod, superannuationLine.paymentDateForThisPeriod) &&
        Objects.equals(this.percentage, superannuationLine.percentage) &&
        Objects.equals(this.amount, superannuationLine.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(superMembershipID, contributionType, calculationType, minimumMonthlyEarnings, expenseAccountCode, liabilityAccountCode, paymentDateForThisPeriod, percentage, amount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuperannuationLine {\n");
    sb.append("    superMembershipID: ").append(toIndentedString(superMembershipID)).append("\n");
    sb.append("    contributionType: ").append(toIndentedString(contributionType)).append("\n");
    sb.append("    calculationType: ").append(toIndentedString(calculationType)).append("\n");
    sb.append("    minimumMonthlyEarnings: ").append(toIndentedString(minimumMonthlyEarnings)).append("\n");
    sb.append("    expenseAccountCode: ").append(toIndentedString(expenseAccountCode)).append("\n");
    sb.append("    liabilityAccountCode: ").append(toIndentedString(liabilityAccountCode)).append("\n");
    sb.append("    paymentDateForThisPeriod: ").append(toIndentedString(paymentDateForThisPeriod)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
