/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: PromoService
 * Author:   俊哥
 * Date:     2019/6/17 15:06
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package pers.jun.service;

import pers.jun.error.BusinessException;
import pers.jun.service.model.PromoModel;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 俊哥
 * @create 2019/6/17
 * @since 1.0.0
 */
public interface PromoService {

    PromoModel getPromoByItemId(Integer itemId);

    /**
     * 查询所有活动中的商品或者查询指定数量处于活动中的商品
     * @return
     */
    List<PromoModel> getPromoItems();

    /**
     * 发布活动商品
     * @param promoId
     * @throws BusinessException
     */
    void publishPromo(Integer promoId) throws BusinessException;

    /**
     * 生成秒杀令牌
     * @param promoId
     * @param userId
     * @param itemId
     * @return
     */
    String generateSecondKillToken(Integer promoId,Integer userId,Integer itemId);
}
