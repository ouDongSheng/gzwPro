package org.springblade.modules.system.wrapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springblade.common.cache.SysCache;
import org.springblade.core.mp.support.BaseEntityWrapper;
import org.springblade.core.tool.constant.BladeConstant;
import org.springblade.core.tool.node.ForestNodeMerger;
import org.springblade.core.tool.node.INode;
import org.springblade.core.tool.utils.BeanUtil;
import org.springblade.core.tool.utils.Func;
import org.springblade.modules.system.entity.Role;
import org.springblade.modules.system.vo.RoleVO;

/**
 * 包装类,返回视图层所需的字段
 *
 * @author Chill
 */
public class RoleWrapper extends BaseEntityWrapper<Role, RoleVO> {

	public static RoleWrapper build() {
		return new RoleWrapper();
	}

	@Override
	public RoleVO entityVO(Role role) {
		RoleVO roleVO = BeanUtil.copy(role, RoleVO.class);
		assert roleVO != null;
		if (Func.equals(role.getParentId(), BladeConstant.TOP_PARENT_ID)) {
			roleVO.setParentName(BladeConstant.TOP_PARENT_NAME);
		} else {
			Role parent = SysCache.getRole(role.getParentId());
			if (parent != null) {
				roleVO.setParentName(parent.getRoleName());
			} else {
				roleVO.setParentId(BladeConstant.TOP_PARENT_ID);
				roleVO.setParentName(BladeConstant.TOP_PARENT_NAME);
			}
		}
		return roleVO;
	}


	public List<INode> listNodeVO(List<Role> list) {
		List<INode> collect = list.stream().map(this::entityVO).collect(Collectors.toList());
		return ForestNodeMerger.merge(collect);
	}
}