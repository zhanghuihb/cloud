package com.burton.cloud.common.base;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseRepository<T> extends JpaRepository<T, Integer> {


}
