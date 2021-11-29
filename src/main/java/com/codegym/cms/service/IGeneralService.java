package com.codegym.cms.service;

import com.codegym.cms.model.Customer;

public interface IGeneralService<T> {
    boolean insertWithStoredProcedure(Customer customer);
}
