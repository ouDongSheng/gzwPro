package com.gzw.entity;

import java.math.BigInteger;
import java.sql.Timestamp;

public class BaseInfo {
    public Integer id;
    public BigInteger baseId;
    public BigInteger pid;
    public BigInteger companyId;
    public String companyName;
    public String companyShort;
    public String companyType;
    public String unitHeader;
    public String chiefAccountant;
    public String accountManager;
    public String preparer;
    public String zip;
    public String mailAddress;
    public String regionCode;
    public Integer areaNumber;
    public BigInteger telephoneNumber;
    public BigInteger extensionNumber;
    public String auditOrganization;
    public String signer;
    public String enterpriseCode;
    public String lastYearEnterpriseCode;
    public String parentEnterpriseCode;
    public String baseEnterpriseCode;
    public String administrativeSubjectCode;
    public String departmentCode;
    public String countryCode;
    public String administrativeDivisionCode;
    public String industryClassificationCode;
    public String accountCriteria;
    public String businessScale;
    public String economicType;
    public String organizationForm;
    public String newLeaseCriteria;
    public String stockType;
    public String stockCode;
    public String remark;
    public String salaryManagementCode;
    public String auditMode;
    public String auditOpinionType;
    public Timestamp setYear;
    public String reportFactor;
    public String otherReportFactor;
    public String reportTypeCode;
    public String spareCode;
    public String registerAddress;
    public String businessForm;
    public String state;
    public String administrativeCity;
    public String administrativeProvince;
    public String unitNature;
    public String mixedOwnerEnterprise;
    public String employeeOwnerEnterprise;
    public String sinoForeignUnionEnterprise;
    public String culturalEnterprise;
    public String newIncomeCriteria;
    public String newFinancialCriteria;
    public Integer budgetFlag;
    public String handInType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigInteger getBaseId() {
        return baseId;
    }

    public void setBaseId(BigInteger baseId) {
        this.baseId = baseId;
    }

    public BigInteger getPid() {
        return pid;
    }

    public void setPid(BigInteger pid) {
        this.pid = pid;
    }

    public BigInteger getCompanyId() {
        return companyId;
    }

    public void setCompanyId(BigInteger companyId) {
        this.companyId = companyId;
    }

    public void setTelephoneNumber(BigInteger telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public void setExtensionNumber(BigInteger extensionNumber) {
        this.extensionNumber = extensionNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyShort() {
        return companyShort;
    }

    public void setCompanyShort(String companyShort) {
        this.companyShort = companyShort;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public String getUnitHeader() {
        return unitHeader;
    }

    public void setUnitHeader(String unitHeader) {
        this.unitHeader = unitHeader;
    }

    public String getChiefAccountant() {
        return chiefAccountant;
    }

    public void setChiefAccountant(String chiefAccountant) {
        this.chiefAccountant = chiefAccountant;
    }

    public String getAccountManager() {
        return accountManager;
    }

    public void setAccountManager(String accountManager) {
        this.accountManager = accountManager;
    }

    public String getPreparer() {
        return preparer;
    }

    public void setPreparer(String preparer) {
        this.preparer = preparer;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public Integer getAreaNumber() {
        return areaNumber;
    }

    public void setAreaNumber(Integer areaNumber) {
        this.areaNumber = areaNumber;
    }

    public String getAuditOrganization() {
        return auditOrganization;
    }

    public void setAuditOrganization(String auditOrganization) {
        this.auditOrganization = auditOrganization;
    }

    public String getSigner() {
        return signer;
    }

    public void setSigner(String signer) {
        this.signer = signer;
    }

    public String getEnterpriseCode() {
        return enterpriseCode;
    }

    public void setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
    }

    public String getLastYearEnterpriseCode() {
        return lastYearEnterpriseCode;
    }

    public void setLastYearEnterpriseCode(String lastYearEnterpriseCode) {
        this.lastYearEnterpriseCode = lastYearEnterpriseCode;
    }

    public String getParentEnterpriseCode() {
        return parentEnterpriseCode;
    }

    public void setParentEnterpriseCode(String parentEnterpriseCode) {
        this.parentEnterpriseCode = parentEnterpriseCode;
    }

    public String getBaseEnterpriseCode() {
        return baseEnterpriseCode;
    }

    public void setBaseEnterpriseCode(String baseEnterpriseCode) {
        this.baseEnterpriseCode = baseEnterpriseCode;
    }

    public String getAdministrativeSubjectCode() {
        return administrativeSubjectCode;
    }

    public void setAdministrativeSubjectCode(String administrativeSubjectCode) {
        this.administrativeSubjectCode = administrativeSubjectCode;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getIndustryClassificationCode() {
        return industryClassificationCode;
    }

    public void setIndustryClassificationCode(String industryClassificationCode) {
        this.industryClassificationCode = industryClassificationCode;
    }

    public String getAccountCriteria() {
        return accountCriteria;
    }

    public void setAccountCriteria(String accountCriteria) {
        this.accountCriteria = accountCriteria;
    }

    public String getBusinessScale() {
        return businessScale;
    }

    public void setBusinessScale(String businessScale) {
        this.businessScale = businessScale;
    }

    public String getEconomicType() {
        return economicType;
    }

    public void setEconomicType(String economicType) {
        this.economicType = economicType;
    }

    public String getOrganizationForm() {
        return organizationForm;
    }

    public void setOrganizationForm(String organizationForm) {
        this.organizationForm = organizationForm;
    }

    public String getNewLeaseCriteria() {
        return newLeaseCriteria;
    }

    public void setNewLeaseCriteria(String newLeaseCriteria) {
        this.newLeaseCriteria = newLeaseCriteria;
    }

    public String getStockType() {
        return stockType;
    }

    public void setStockType(String stockType) {
        this.stockType = stockType;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getSalaryManagementCode() {
        return salaryManagementCode;
    }

    public void setSalaryManagementCode(String salaryManagementCode) {
        this.salaryManagementCode = salaryManagementCode;
    }

    public String getAuditMode() {
        return auditMode;
    }

    public void setAuditMode(String auditMode) {
        this.auditMode = auditMode;
    }

    public String getAuditOpinionType() {
        return auditOpinionType;
    }

    public void setAuditOpinionType(String auditOpinionType) {
        this.auditOpinionType = auditOpinionType;
    }

    public Timestamp getSetYear() {
        return setYear;
    }

    public void setSetYear(Timestamp setYear) {
        this.setYear = setYear;
    }

    public String getReportFactor() {
        return reportFactor;
    }

    public void setReportFactor(String reportFactor) {
        this.reportFactor = reportFactor;
    }

    public String getOtherReportFactor() {
        return otherReportFactor;
    }

    public void setOtherReportFactor(String otherReportFactor) {
        this.otherReportFactor = otherReportFactor;
    }

    public String getReportTypeCode() {
        return reportTypeCode;
    }

    public void setReportTypeCode(String reportTypeCode) {
        this.reportTypeCode = reportTypeCode;
    }

    public String getSpareCode() {
        return spareCode;
    }

    public void setSpareCode(String spareCode) {
        this.spareCode = spareCode;
    }

    public String getRegisterAddress() {
        return registerAddress;
    }

    public void setRegisterAddress(String registerAddress) {
        this.registerAddress = registerAddress;
    }

    public String getBusinessForm() {
        return businessForm;
    }

    public void setBusinessForm(String businessForm) {
        this.businessForm = businessForm;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAdministrativeCity() {
        return administrativeCity;
    }

    public void setAdministrativeCity(String administrativeCity) {
        this.administrativeCity = administrativeCity;
    }

    public String getAdministrativeProvince() {
        return administrativeProvince;
    }

    public void setAdministrativeProvince(String administrativeProvince) {
        this.administrativeProvince = administrativeProvince;
    }

    public String getUnitNature() {
        return unitNature;
    }

    public void setUnitNature(String unitNature) {
        this.unitNature = unitNature;
    }

    public String getMixedOwnerEnterprise() {
        return mixedOwnerEnterprise;
    }

    public void setMixedOwnerEnterprise(String mixedOwnerEnterprise) {
        this.mixedOwnerEnterprise = mixedOwnerEnterprise;
    }

    public String getEmployeeOwnerEnterprise() {
        return employeeOwnerEnterprise;
    }

    public void setEmployeeOwnerEnterprise(String employeeOwnerEnterprise) {
        this.employeeOwnerEnterprise = employeeOwnerEnterprise;
    }

    public String getSinoForeignUnionEnterprise() {
        return sinoForeignUnionEnterprise;
    }

    public void setSinoForeignUnionEnterprise(String sinoForeignUnionEnterprise) {
        this.sinoForeignUnionEnterprise = sinoForeignUnionEnterprise;
    }

    public String getCulturalEnterprise() {
        return culturalEnterprise;
    }

    public void setCulturalEnterprise(String culturalEnterprise) {
        this.culturalEnterprise = culturalEnterprise;
    }

    public String getNewIncomeCriteria() {
        return newIncomeCriteria;
    }

    public void setNewIncomeCriteria(String newIncomeCriteria) {
        this.newIncomeCriteria = newIncomeCriteria;
    }

    public String getNewFinancialCriteria() {
        return newFinancialCriteria;
    }

    public void setNewFinancialCriteria(String newFinancialCriteria) {
        this.newFinancialCriteria = newFinancialCriteria;
    }

    public Integer getBudgetFlag() {
        return budgetFlag;
    }

    public void setBudgetFlag(Integer budgetFlag) {
        this.budgetFlag = budgetFlag;
    }

    public String getHandInType() {
        return handInType;
    }

    public void setHandInType(String handInType) {
        this.handInType = handInType;
    }
}
