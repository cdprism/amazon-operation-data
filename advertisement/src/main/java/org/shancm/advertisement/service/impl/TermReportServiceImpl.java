package org.shancm.advertisement.service.impl;

import org.shancm.advertisement.domain.entity.TermReport;
import org.shancm.advertisement.mapper.TermReportMapper;
import org.shancm.advertisement.service.ITermReportService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author S.cm
 * @since 2021-06-02
 */
@Service
public class TermReportServiceImpl extends ServiceImpl<TermReportMapper, TermReport> implements ITermReportService {


    @Override
    public void queryAll() {
        List<TermReport> list = this.list();
        list.forEach(System.out::println);
    }
}
