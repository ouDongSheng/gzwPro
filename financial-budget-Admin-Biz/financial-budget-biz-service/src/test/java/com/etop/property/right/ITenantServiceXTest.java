/*
package com.etop.property.right;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.etop.property.right.common.service.ITenantServiceX;
import com.etop.property.right.entity.BaseInfo;
import com.etop.property.right.service.IBaseInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springblade.core.test.BladeBootTest;
import org.springblade.core.test.BladeSpringRunner;
import org.springblade.modules.system.entity.Dept;
import org.springblade.modules.system.entity.Role;
import org.springblade.modules.system.entity.Tenant;
import org.springblade.modules.system.mapper.DeptMapper;
import org.springblade.modules.system.mapper.RoleMapper;

import javax.annotation.Resource;
import java.util.List;

@RunWith(BladeSpringRunner.class)
@BladeBootTest(appName = "etop-message", enableLoader = true)
public class ITenantServiceXTest {
	@Resource
	private ITenantServiceX tenantServiceX;

	@Resource
	private IBaseInfoService baseInfoService;

	@Resource
	private RoleMapper roleMapper;

	@Resource
	private DeptMapper deptMapper;



	@Test
	public void getTenantList() {
		String account = "eoechina";
		List<Tenant> tenantList = tenantServiceX.getTenantList(account);
		for (Tenant tenant : tenantList) {
			System.out.println(tenant.getTenantId() + ":" + tenant.getTenantName());
		}
	}

	@Test
	public void save() {
		//开始前建议清空无关紧要的数据
		BaseInfo baseInfo = baseInfoService.getById(2940);
		if(null==baseInfo){
			return;
		}

		String tenantId = Long.toString(baseInfo.getId());
		//公司全称
		String companyName = baseInfo.getCompanyName();
		//公司简称
		String companyShort = baseInfo.getCompanyShort();

		//初始化部门
		Dept dept = new Dept();
		dept.setTenantId(tenantId);
		dept.setParentId((long) 0);
		dept.setFullName(companyName);
		dept.setDeptName(companyShort);
		dept.setDeptCategory(1);
		dept.setSort(0);
		dept.setRemark("系统自动创建");
		dept.setIsDeleted(0);
		deptMapper.insert(dept);

		//删掉多余的租户
		tenantServiceX.remove(new QueryWrapper<Tenant>().eq("tenant_id",tenantId));
		//初始化用户
		tenantServiceX.save(tenantId, companyName,companyShort,dept.getId());

		//初始化管理员角色
		Role role = new Role();
		role.setSort(0);
		role.setTenantId(tenantId);
		role.setRoleName(companyShort+"管理员");
		role.setRoleAlias(companyShort+"管理员");
		role.setIsDeleted(0);
		roleMapper.insert(role);


	}
}
*/
