/**    138,146,merge sort, remove element, remove dupl, majority, rotate array, 121,238, 134,28,54,48
       73,141,2,21,20 ,496,456,42,84,225,232,622,104,100,102,103,530,230,98,200,994,133,207,785, 909, 210,70, 198,139,322,300,64,5,72,eggdrop puzzle, 
       373,692,383,205, 1143,152,215, 242,49,,1,202,128,35,162,33,153,34,148,23,53,918,172,66,78, 46,39,17,52, 79,22,131,37, n meeeting in room, job seq, minimu platform 0-1 knapsack, diji,bellmam,prim
 * 
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
    public:
        bool hasCycle(ListNode *head) {
            if (head ==  null){
                return false;
            }
        ListNode slow= head;
        Listnode fast = head;
    
        while(fast!=null && fast.next=null){
            slow= slow.next;
            fast= fast.next.next;
    
            if (slow==fast){
                return true;
            }
        }
        return false;
        }
    };