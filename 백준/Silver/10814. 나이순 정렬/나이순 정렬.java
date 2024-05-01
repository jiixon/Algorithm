
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Member{
    int age;
    String name;

    public Member(int age, String name){
        this.age = age;
        this.name = name;
    }
}

public class Main {
    public static void sort(Member[] members){
        Arrays.sort(members, new Comparator<Member>() {
                    @Override
                    public int compare(Member o1, Member o2) {
                        if(o1.age == o2.age) return 0; 
                        return Integer.compare(o1.age, o2.age);
                    }
                }
        );
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCnt = sc.nextInt();
        Member[] members = new Member[testCnt];
        for (int i = 0; i < testCnt; i++) {
            String age = sc.next();
            String name = sc.next();
            members[i] = new Member(Integer.parseInt(age), name);

        }
        sort(members);

        for(Member member: members){
            System.out.println(member.age + " "+ member.name);
        }
    }
}
