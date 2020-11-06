-- auto Generated on 2020-11-06 20:26:45 
-- DROP TABLE IF EXISTS `base_info`; 
CREATE TABLE base_info(
    `id` INTEGER(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
    `company_name` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'companyName',
    `company_short` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'companyShort',
    `company_type` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'companyType',
    `unit_header` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'unitHeader',
    `chief_accountant` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'chiefAccountant',
    `account_manager` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'accountManager',
    `preparer` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'preparer',
    `zip` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'zip',
    `mail_address` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'mailAddress',
    `region_code` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'regionCode',
    `area_number` INTEGER(12) NOT NULL DEFAULT -1 COMMENT 'areaNumber',
    `audit_organization` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'auditOrganization',
    `signer` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'signer',
    `enterprise_code` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'enterpriseCode',
    `last_year_enterprise_code` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'lastYearEnterpriseCode',
    `parent_enterprise_code` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'parentEnterpriseCode',
    `base_enterprise_code` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'baseEnterpriseCode',
    `administrative_subject_code` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'administrativeSubjectCode',
    `department_code` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'departmentCode',
    `country_code` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'countryCode',
    `administrative_division_code` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'administrativeDivisionCode',
    `industry_classification_code` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'industryClassificationCode',
    `account_criteria` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'accountCriteria',
    `business_scale` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'businessScale',
    `economic_type` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'economicType',
    `organization_form` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'organizationForm',
    `new_lease_criteria` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'newLeaseCriteria',
    `stock_type` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'stockType',
    `stock_code` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'stockCode',
    `remark` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'remark',
    `salary_management_code` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'salaryManagementCode',
    `audit_mode` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'auditMode',
    `audit_opinion_type` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'auditOpinionType',
    `set_year` DATETIME NOT NULL DEFAULT '1000-01-01 00:00:00' COMMENT 'setYear',
    `report_factor` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'reportFactor',
    `other_report_factor` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'otherReportFactor',
    `report_type_code` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'reportTypeCode',
    `spare_code` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'spareCode',
    `register_address` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'registerAddress',
    `business_form` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'businessForm',
    `state` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'state',
    `administrative_city` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'administrativeCity',
    `administrative_province` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'administrativeProvince',
    `unit_nature` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'unitNature',
    `mixed_owner_enterprise` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'mixedOwnerEnterprise',
    `employee_owner_enterprise` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'employeeOwnerEnterprise',
    `sino_foreign_union_enterprise` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'sinoForeignUnionEnterprise',
    `cultural_enterprise` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'culturalEnterprise',
    `new_income_criteria` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'newIncomeCriteria',
    `new_financial_criteria` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'newFinancialCriteria',
    `budget_flag` INTEGER(12) NOT NULL DEFAULT -1 COMMENT 'budgetFlag',
    `hand_in_type` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'handInType',
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'base_info';


ALTER TABLE base_info
ADD COLUMN `administrative_division_code` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'administrativeDivisionCode' AFTER `country_code`;