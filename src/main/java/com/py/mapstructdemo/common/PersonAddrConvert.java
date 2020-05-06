package com.py.mapstructdemo.common;


import com.py.mapstructdemo.common.entity.AddressDO;
import com.py.mapstructdemo.common.entity.PersonDO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 * @author pengyou@xiaomi.com
 * @date 2020/5/6
 */
@Mapper(componentModel = "spring")
public interface PersonAddrConvert {

    /**
     * 映射
     *
     * @param personDO
     * @param addressDO
     * @return
     */
    @Mappings({
            @Mapping(source = "personDO.name", target = "personName"),
            @Mapping(source = "addressDO.address", target = "addr")
    })
    PersonAddrDTO map2Dto(PersonDO personDO, AddressDO addressDO);

}
