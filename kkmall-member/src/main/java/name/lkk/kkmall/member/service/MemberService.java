package name.lkk.kkmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import name.lkk.common.utils.PageUtils;
import name.lkk.kkmall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author KirkLin
 * @email linkirk@163.com
 * @date 2021-06-07 16:27:46
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
