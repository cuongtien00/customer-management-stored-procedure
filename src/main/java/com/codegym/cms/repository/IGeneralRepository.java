package com.codegym.cms.repository;

import com.codegym.cms.model.Customer;

public interface IGeneralRepository<T> {
    boolean insertWithStoredProcedure(Customer customer);
}
