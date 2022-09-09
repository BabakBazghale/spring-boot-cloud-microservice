package com.bob.consumer.proxies.hrm.fallback;

import com.bob.consumer.dtos.EmployeeDTO;
import com.bob.consumer.proxies.hrm.EmployeeProxy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class EmployeeProxyFallBack implements EmployeeProxy {

    @Override
    public Boolean employeePersistence() {
        return true;
    }

    @Override
    public EmployeeDTO findEmployeeByPersonnelCode(Integer personnelCode) {
        return EmployeeDTO.builder()
                .id(6l)
                .gender("male")
                .personnelCode(173931)
                .position("developer")
                .username("peter").build();
    }
}
