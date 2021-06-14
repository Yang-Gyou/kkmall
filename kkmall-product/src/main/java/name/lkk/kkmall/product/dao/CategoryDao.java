package name.lkk.kkmall.product.dao;

import name.lkk.kkmall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author KirkLin
 * @email linkirk@163.com
 * @date 2021-06-07 15:14:37
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}