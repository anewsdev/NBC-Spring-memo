package com.sparta.nbcspringmemo.repository;

import com.sparta.nbcspringmemo.entity.Memo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

public interface MemoRepository extends JpaRepository<Memo, Long> {
    
}
