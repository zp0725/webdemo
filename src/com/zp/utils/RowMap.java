package com.zp.utils;

import java.sql.ResultSet;

public interface RowMap<T> {
    T RowMapping(ResultSet rs);
}
