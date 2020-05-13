package com.github.lithualien.webseosecurity.dao;

import com.github.lithualien.webseosecurity.entity.WorkableDay;

import java.util.List;

public interface WorkingHourDAO {

    List<WorkableDay> show(int employeeId);
}
