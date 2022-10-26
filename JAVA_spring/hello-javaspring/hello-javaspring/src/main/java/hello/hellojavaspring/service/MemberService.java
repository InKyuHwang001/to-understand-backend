package hello.hellojavaspring.service;

import hello.hellojavaspring.domain.Member;
import hello.hellojavaspring.repository.MemberRepository;
import hello.hellojavaspring.repository.MemoryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static hello.hellojavaspring.repository.MemberRepository.*;

public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository){

        this.memberRepository = memberRepository;
    }

    /**
     * 회원가입
     */
    public Long join(Member member){

        validateDuplicateMember(member);//중복확인검증

        memberRepository.save(member);
        return member.getId();
    }

    private void validateDuplicateMember(Member member) {
        memberRepository.findByName(member.getName())
                .ifPresent(m -> {
            throw new IllegalStateException("이미 존재한 회원입니다.");
            });
    }
    /**
     * 전체 회원 조회
     */
    public List<Member> findMembers(){
        return memberRepository.findAll();
    }

    public Optional<Member> findOne(Long memberId){
        return memberRepository.findById(memberId);
    }
}
