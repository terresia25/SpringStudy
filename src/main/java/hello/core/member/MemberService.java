package hello.core.member;

public interface MemberService {

    void join(Member member);//회원가입 기능

    Member findMember(Long memberId);//회원조회 기능
}
