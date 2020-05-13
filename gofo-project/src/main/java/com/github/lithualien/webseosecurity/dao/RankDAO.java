package com.github.lithualien.webseosecurity.dao;

import com.github.lithualien.webseosecurity.entity.Rank;

import java.util.List;

public interface RankDAO {

    List<Rank> show(int companyId);
}
