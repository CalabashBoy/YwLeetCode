package list;

import lombok.Data;
import lombok.extern.java.Log;

@Data
@Log
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
        next = null;
    }

//    @Override
//    public String toString(){
//        ListNode cur = this;
//        StringBuilder sb = new StringBuilder();
//        while (cur != null){
//            sb.append(cur.val);
//            sb.append(" ");
//            cur = cur.next;
//        }
//
//        return sb.toString();
//    }
}