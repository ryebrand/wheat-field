/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ItemService
 * Author:   俊哥
 * Date:     2019/6/12 17:22
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package pers.jun.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import io.swagger.models.auth.In;
import pers.jun.error.BusinessException;
import pers.jun.pojo.ItemScroll;
import pers.jun.service.model.ItemModel;
import pers.jun.service.model.OrderItemModel;
import pers.jun.service.model.PromoModel;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 俊哥
 * @create 2019/6/12
 * @since 1.0.0
 */
public interface ItemService {
    /**
     * 创建商品
     * @param itemModel
     * @return
     * @throws BusinessException
     */
    ItemModel createItem(ItemModel itemModel) throws BusinessException;

    /**
     * 浏览商品
     * @param key
     * @param page
     * @param size
     * @param sort
     * @param priceGt
     * @param priceLte
     * @return
     */
    Page<ItemModel> getList(String key, Integer page, Integer size, String sort, String priceGt, String priceLte);

    /**
     * 所有活动中的商品
     * @param page
     * @param size
     * @param sort
     * @param priceGt
     * @param priceLte
     * @return
     */
    Page<ItemModel> getPromoItems(Integer page, Integer size, String sort, String priceGt, String priceLte);

    /**
     * 通过分类查找查找商品
     * @param categoryId
     * @return
     */
    List<ItemModel> getByCategory(Integer categoryId);

    /**
     * 查看商品详情
     * @param id
     * @return
     */
    ItemModel getById(Integer id);

    /**
     * 从缓存查商品详情
     * @param id
     * @return
     */
    ItemModel getByIdIncache(Integer id);

    //得到名称和活动（订单调用）
    //ItemModel getNameAndPromo(Integer id);

    /**
     * 更新库存，此方法用于购物车或非秒杀活动中的商品
     * @param itemId
     * @param amount
     * @return
     */
    boolean decreaseStock(Integer itemId,Integer amount);

    /**
     * 更新库存，此方法用于秒杀活动商品
     * @param itemId
     * @param amount
     * @return
     */
    boolean decreaseStockIncache(Integer itemId, Integer amount);

    // 异步更新库存
    boolean asyncDecreaseStock(Integer itemId,Integer amount);

    /**
     * 回滚库存
     * @param itemId
     * @param amount
     * @return
     */
    boolean increaseStock(Integer itemId,Integer amount);

    /**
     * 更新销量
     * @param id
     * @param amount
     * @return
     */
    boolean increaseSales(Integer id,Integer amount);

    /**
     * 查询热门商品
     * @param count
     * @return
     */
    List<ItemModel> getPopular(int count);

    /**
     * 根据活动进行查询商品
     * @return
     */
    List<ItemModel> getPromoHotItems();

    /**
     * 查询图片轮播的商品
     * @return
     */
    List<ItemScroll> getHomeScroll();

    /**
     * 初始化库存流水
     * @param itemId
     * @param amount
     * @return
     */
    String initStockLog(Integer itemId,Integer amount);
}
