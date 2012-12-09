package com.heren.his.domain;

import java.util.List;

public interface ClinicRegisterRepository {
    List<ClinicRegister> allAvailable();

    ClinicRegister findBy(long id);
}
