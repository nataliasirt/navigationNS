package com.solvd.interfaces;

import java.util.List;

public interface IDAO<T> {
    T getById (Long id);

    List<T> getAll();
}

