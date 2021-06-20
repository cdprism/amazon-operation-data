package org.shancm.advertisement.domain.tdo;

import com.opencsv.bean.CsvBindByName;
import lombok.Data;

import java.time.LocalTime;

/**
 * @Classname TermReportTDO
 * @Description TODO
 * @Date 2021/6/7 16:30
 * @Created by S.cm
 */
@Data
public class TermReportTDO {

    private LocalTime date;

    /**
     * 广告组合
     */
    @CsvBindByName(column = "性别")
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
