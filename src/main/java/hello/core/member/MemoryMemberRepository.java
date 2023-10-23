package hello.core.member;

import java.util.HashMap;
import java.util.Map;

//MemberRepository 인터페이스와 연결해주기 위한 구현체 클래스이므로, MemberRepository implement함
public class MemoryMemberRepository implements MemberRepository{

    private static Map<Long, Member> store = new HashMap<>();
    //동시성 이슈 때문에 보통 Hashmap 말고 concurrentHashmap 사용이 권장됨

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);

    }//회원 ID 저장

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }//회원 ID 찾기 위함
}
