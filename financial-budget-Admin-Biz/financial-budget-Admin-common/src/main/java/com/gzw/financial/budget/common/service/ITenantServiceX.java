package com.gzw.financial.budget.common.service;

import org.springblade.core.mp.base.BaseService;
import org.springblade.modules.system.entity.Tenant;

import java.util.List;

public interface ITenantServiceX extends BaseService<Tenant> {

	List<Tenant> getTenantList(String account);

	boolean save(String companyId, String companyName,String shortName,Long deptId);
}
