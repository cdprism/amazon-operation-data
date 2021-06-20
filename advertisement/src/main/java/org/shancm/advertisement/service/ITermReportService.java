package org.shancm.advertisement.service;

import org.shancm.advertisement.domain.entity.TermReport;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author S.cm
 * @since 2021-06-02
 */
public interface ITermReportService extends IService<TermReport> {

    void queryAll();

}
