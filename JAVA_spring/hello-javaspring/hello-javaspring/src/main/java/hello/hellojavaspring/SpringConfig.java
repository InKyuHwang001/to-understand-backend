package hello.hellojavaspring;

import hello.hellojavaspring.repository.MemberRepository;
import hello.hellojavaspring.repository.MemoryMemberRepository;
import hello.hellojavaspring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService (){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
}
