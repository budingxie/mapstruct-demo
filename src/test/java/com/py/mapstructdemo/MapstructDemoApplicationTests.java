package com.py.mapstructdemo;

import com.py.mapstructdemo.common.PersonAddrConvert;
import com.py.mapstructdemo.common.PersonAddrDTO;
import com.py.mapstructdemo.common.entity.AddressDO;
import com.py.mapstructdemo.common.entity.PersonDO;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class MapstructDemoApplicationTests {

    @Resource
    private PersonAddrConvert personAddrConvert;

    @Test
    void contextLoads() {
        // 从数据库中person表中查询到的数据
        PersonDO person = new PersonDO();
        person.setName("Yezhiwei");
        person.setAge(18);
        person.setPhone("150");
        // 从数据库中address表中查询到的数据
        AddressDO address = new AddressDO();
        address.setAddress("BeiJing");
        address.setPostcode("10086");
        // 将多个表的数据拼装成页面需要的 Model
        PersonAddrDTO personAddrDTO = personAddrConvert.map2Dto(person, address);
        System.out.println("personAddrDTO=>" + personAddrDTO);

        //方式二
//        PersonAddrConvert INSTANCE = Mappers.getMapper(PersonAddrConvert.class);
//        PersonAddrDTO personAddrDTO = INSTANCE.map2Dto(person, address);
//        System.out.println("personAddrDTO=>" + personAddrDTO);
    }

}
