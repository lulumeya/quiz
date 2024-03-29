package com.haksu.quizqube.spring.repo;

import java.util.List;

import com.haksu.quizqube.spring.domain.Member;

public interface MemberDao
{
    public Member findById(Long id);

    public Member findByEmail(String email);

    public List<Member> findAllOrderedByName();

    public void register(Member member);
}
