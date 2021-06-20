package org.shancm.advertisement.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author S.cm
 * @since 2021-06-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TermReport implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private LocalTime date;

    /**
     * 广告组合
     */
    private String portfolio;

    /**
     * 广告活动
     */
    private String campaign;

    /**
     * 广告组
     */
    private String groupName;

    /**
     * 投放
     */
    private String target;

    /**
     * 匹配类型
     */
    private String matchType;

    /**
     * 搜索词
     */
    private String searchTerm;

    /**
     * 展示量
     */
    private Integer impressions;

    /**
     * 点击量
     */
    private Integer clicks;

    /**
     * 点击率
     */
    private Float clickThruRate;

    /**
     * 每次点击成本
     */
    private Float costPerClick;

    /**
     * 花费
     */
    private Float spend;

    /**
     * 7天总销售额
     */
    private Float totalSales;

    /**
     * 广告成本销售比
     */
    private Float acos;

    /**
     * 投入产出比
     */
    private Float roas;

    /**
     * 7天总订单数
     */
    private Integer totalOrders;

    /**
     * 7天总销售量
     */
    private Integer totalUnits;

    /**
     * 7天的转化率
     */
    private Float conversionRate;

    /**
     * 7天内广告SKU销售量
     */
    private Integer advertisedSkuUnits;

    /**
     * 7天内其他SKU销售量
     */
    private Integer otherSkuUnits;

    /**
     * 7天内广告SKU销售额
     */
    private Float advertisedSkuSales;

    /**
     * 7天内其他SKU销售额
     */
    private Float otherSkuSales;


}
