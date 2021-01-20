package com.bbva.papx.dto.account;

import com.bbva.apx.dto.AbstractDTO;

import java.sql.Date;

public class AccountDTO extends AbstractDTO {
    private String accountId;
    private String accountNumberId;
    private String accountType;
    private String currencyName;

    private String familyName;
    private String aliasDesc;
    private Date oppeningDate;
    private boolean statusType;
    private String titleDesc;

    private double currentBalanceAmount;
    private double pendingBalanceAmount;
    private double postedBalanceAmount;
    private String relatedContractId;
    private String AgreementId;

    public AccountDTO() {
    }

    public AccountDTO(String accountId, String accountNumberId, String accountType, String currencyName) {
        this.accountId = accountId;
        this.accountNumberId = accountNumberId;
        this.accountType = accountType;
        this.currencyName = currencyName;
    }

    public AccountDTO(String accountId, String familyName, String accountType, String aliasDesc, String currencyName) {
        this.accountId = accountId;
        this.familyName = familyName;
        this.accountType = accountType;
        this.aliasDesc = aliasDesc;
        this.currencyName = currencyName;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAliasDesc() {
        return aliasDesc;
    }

    public void setAliasDesc(String aliasDesc) {
        this.aliasDesc = aliasDesc;
    }

    public String getAccountNumberId() {
        return accountNumberId;
    }

    public void setAccountNumberId(String accountNumberId) {
        this.accountNumberId = accountNumberId;
    }

    public Date getOppeningDate() {
        return oppeningDate;
    }

    public void setOppeningDate(Date oppeningDate) {
        this.oppeningDate = oppeningDate;
    }

    public boolean isStatusType() {
        return statusType;
    }

    public void setStatusType(boolean statusType) {
        this.statusType = statusType;
    }

    public String getTitleDesc() {
        return titleDesc;
    }

    public void setTitleDesc(String titleDesc) {
        this.titleDesc = titleDesc;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public double getCurrentBalanceAmount() {
        return currentBalanceAmount;
    }

    public void setCurrentBalanceAmount(double currentBalanceAmount) {
        this.currentBalanceAmount = currentBalanceAmount;
    }

    public double getPendingBalanceAmount() {
        return pendingBalanceAmount;
    }

    public void setPendingBalanceAmount(double pendingBalanceAmount) {
        this.pendingBalanceAmount = pendingBalanceAmount;
    }

    public double getPostedBalanceAmount() {
        return postedBalanceAmount;
    }

    public void setPostedBalanceAmount(double postedBalanceAmount) {
        this.postedBalanceAmount = postedBalanceAmount;
    }

    public String getRelatedContractId() {
        return relatedContractId;
    }

    public void setRelatedContractId(String relatedContractId) {
        this.relatedContractId = relatedContractId;
    }

    public String getAgreementId() {
        return AgreementId;
    }

    public void setAgreementId(String agreementId) {
        AgreementId = agreementId;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Account{");
        sb.append("accountId='").append(accountId).append('\'');
        sb.append(", familyName='").append(familyName).append('\'');
        sb.append(", accountType='").append(accountType).append('\'');
        sb.append(", aliasDesc='").append(aliasDesc).append('\'');
        sb.append(", accountNumberId='").append(accountNumberId).append('\'');
        sb.append(", oppeningDate=").append(oppeningDate);
        sb.append(", statusType=").append(statusType);
        sb.append(", titleDesc='").append(titleDesc).append('\'');
        sb.append(", currencyName='").append(currencyName).append('\'');
        sb.append(", currentBalanceAmount=").append(currentBalanceAmount);
        sb.append(", pendingBalanceAmount=").append(pendingBalanceAmount);
        sb.append(", postedBalanceAmount=").append(postedBalanceAmount);
        sb.append(", relatedContractId='").append(relatedContractId).append('\'');
        sb.append(", AgreementId='").append(AgreementId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
