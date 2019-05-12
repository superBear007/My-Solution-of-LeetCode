import entity.ListNode;

public class Solution_83_Remove_Duplicates_LinkedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode next = deleteDuplicates(head.next);
        if (head.next.val != head.val){
            head.next = next;
            return head;
        }else{
            head.next = next.next;
            return head;
        }
        // �����ύʱ��Ϊ 20190512
        // ����ʱ�� 0ms ���� 100% �û�
        // �����ڴ� 35.6MB ���� 98.68% �û�
        // ����: ������������Ŀ�����Ծ��������ݹ��������ݹ��ʺ���ר��
        // ����������ۻ�
    }
}
