package com.mbcrmsys.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Customer {
    private Integer cusId;

    private Integer cusAreId;

    private Integer cusCkId;

    private String cusName;

    private String cusNumber;

    private String cusAddress;

    private String cusChangeOrigin;

    private String cusChangeDescribe;

    private String cusSuccessProbability;

    private String cusManager;

    private String cusAllotName;

    private Date cusAllotDate;

    private String cusPostalCode;

    private String cusTelephone;

    private String cusFasimile;

    private String cusUrl;

    private String cusRegisterNumber;

    private String cusLegalPerson;

    private BigDecimal cusRegisterMoney;

    private BigDecimal cusRmb;

    private String cusOpeningBank;

    private String cusBankAccount;

    private String cusCrownRent;

    private String cusStateTaxes;

    private String cusResume;

    private Long cusCreditworthiness;

    private Long cusStatisfcing;

    private Long cusState;

    public Integer getCusId() {
        return cusId;
    }

    public void setCusId(Integer cusId) {
        this.cusId = cusId;
    }

    public Integer getCusAreId() {
        return cusAreId;
    }

    public void setCusAreId(Integer cusAreId) {
        this.cusAreId = cusAreId;
    }

    public Integer getCusCkId() {
        return cusCkId;
    }

    public void setCusCkId(Integer cusCkId) {
        this.cusCkId = cusCkId;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName == null ? null : cusName.trim();
    }

    public String getCusNumber() {
        return cusNumber;
    }

    public void setCusNumber(String cusNumber) {
        this.cusNumber = cusNumber == null ? null : cusNumber.trim();
    }

    public String getCusAddress() {
        return cusAddress;
    }

    public void setCusAddress(String cusAddress) {
        this.cusAddress = cusAddress == null ? null : cusAddress.trim();
    }

    public String getCusChangeOrigin() {
        return cusChangeOrigin;
    }

    public void setCusChangeOrigin(String cusChangeOrigin) {
        this.cusChangeOrigin = cusChangeOrigin == null ? null : cusChangeOrigin.trim();
    }

    public String getCusChangeDescribe() {
        return cusChangeDescribe;
    }

    public void setCusChangeDescribe(String cusChangeDescribe) {
        this.cusChangeDescribe = cusChangeDescribe == null ? null : cusChangeDescribe.trim();
    }

    public String getCusSuccessProbability() {
        return cusSuccessProbability;
    }

    public void setCusSuccessProbability(String cusSuccessProbability) {
        this.cusSuccessProbability = cusSuccessProbability == null ? null : cusSuccessProbability.trim();
    }

    public String getCusManager() {
        return cusManager;
    }

    public void setCusManager(String cusManager) {
        this.cusManager = cusManager == null ? null : cusManager.trim();
    }

    public String getCusAllotName() {
        return cusAllotName;
    }

    public void setCusAllotName(String cusAllotName) {
        this.cusAllotName = cusAllotName == null ? null : cusAllotName.trim();
    }

    public Date getCusAllotDate() {
        return cusAllotDate;
    }

    public void setCusAllotDate(Date cusAllotDate) {
        this.cusAllotDate = cusAllotDate;
    }

    public String getCusPostalCode() {
        return cusPostalCode;
    }

    public void setCusPostalCode(String cusPostalCode) {
        this.cusPostalCode = cusPostalCode == null ? null : cusPostalCode.trim();
    }

    public String getCusTelephone() {
        return cusTelephone;
    }

    public void setCusTelephone(String cusTelephone) {
        this.cusTelephone = cusTelephone == null ? null : cusTelephone.trim();
    }

    public String getCusFasimile() {
        return cusFasimile;
    }

    public void setCusFasimile(String cusFasimile) {
        this.cusFasimile = cusFasimile == null ? null : cusFasimile.trim();
    }

    public String getCusUrl() {
        return cusUrl;
    }

    public void setCusUrl(String cusUrl) {
        this.cusUrl = cusUrl == null ? null : cusUrl.trim();
    }

    public String getCusRegisterNumber() {
        return cusRegisterNumber;
    }

    public void setCusRegisterNumber(String cusRegisterNumber) {
        this.cusRegisterNumber = cusRegisterNumber == null ? null : cusRegisterNumber.trim();
    }

    public String getCusLegalPerson() {
        return cusLegalPerson;
    }

    public void setCusLegalPerson(String cusLegalPerson) {
        this.cusLegalPerson = cusLegalPerson == null ? null : cusLegalPerson.trim();
    }

    public BigDecimal getCusRegisterMoney() {
        return cusRegisterMoney;
    }

    public void setCusRegisterMoney(BigDecimal cusRegisterMoney) {
        this.cusRegisterMoney = cusRegisterMoney;
    }

    public BigDecimal getCusRmb() {
        return cusRmb;
    }

    public void setCusRmb(BigDecimal cusRmb) {
        this.cusRmb = cusRmb;
    }

    public String getCusOpeningBank() {
        return cusOpeningBank;
    }

    public void setCusOpeningBank(String cusOpeningBank) {
        this.cusOpeningBank = cusOpeningBank == null ? null : cusOpeningBank.trim();
    }

    public String getCusBankAccount() {
        return cusBankAccount;
    }

    public void setCusBankAccount(String cusBankAccount) {
        this.cusBankAccount = cusBankAccount == null ? null : cusBankAccount.trim();
    }

    public String getCusCrownRent() {
        return cusCrownRent;
    }

    public void setCusCrownRent(String cusCrownRent) {
        this.cusCrownRent = cusCrownRent == null ? null : cusCrownRent.trim();
    }

    public String getCusStateTaxes() {
        return cusStateTaxes;
    }

    public void setCusStateTaxes(String cusStateTaxes) {
        this.cusStateTaxes = cusStateTaxes == null ? null : cusStateTaxes.trim();
    }

    public String getCusResume() {
        return cusResume;
    }

    public void setCusResume(String cusResume) {
        this.cusResume = cusResume == null ? null : cusResume.trim();
    }

    public Long getCusCreditworthiness() {
        return cusCreditworthiness;
    }

    public void setCusCreditworthiness(Long cusCreditworthiness) {
        this.cusCreditworthiness = cusCreditworthiness;
    }

    public Long getCusStatisfcing() {
        return cusStatisfcing;
    }

    public void setCusStatisfcing(Long cusStatisfcing) {
        this.cusStatisfcing = cusStatisfcing;
    }

    public Long getCusState() {
        return cusState;
    }

    public void setCusState(Long cusState) {
        this.cusState = cusState;
    }
}