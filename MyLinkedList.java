class MyLinkedList {
	class ListNode {
		int val;
		ListNode next;
		public ListNode(int val) {
			this.val = val;
		}
	}
	private ListNode head;
	private int size;

	/** Initialize your data structure here. */
	public MyLinkedList() {

	}

	/** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
	public int get(int index) {
			if (index < 0 || index >= size) return -1;
			if (size == 1) return head.val;
			ListNode cur = head;
			for (int i = 0; i < index; i++) cur = cur.next;
			return cur.val;
		}

		/**
		 * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
		 */
		public void addAtHead(int val) {
			if (head == null) {
				head = new ListNode(val);
			} else {
				ListNode addHead = new ListNode(val);
				addHead.next = head;
				head = addHead;
			}
			size++;
		}

		/**
		 * Append a node of value val to the last element of the linked list.
		 */
		public void addAtTail(int val) {
			if (head == null) {
				head = new ListNode(val);
			} else {
				ListNode cur = head;
				for (int i = 0; i < size - 1; i++) {
					cur = cur.next;
				}
				cur.next = new ListNode(val);
			}
			size++;
		}

		/**
		 * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
		 */
		public void addAtIndex(int index, int val) {
			if ( index > size) {
				return;
			}

			if (index <= 0) {
				addAtHead(val);
			} else if (index == size) {
				addAtTail(val);
			} else {
				ListNode cur = head;
				for (int i = 0; i < index - 1; i++) {
					cur = cur.next;
				}
				ListNode addIdxNode = new ListNode(val);
				addIdxNode.next= cur.next;
				cur.next = addIdxNode;

				size++;
			}
		}

		/**
		 * Delete the index-th node in the linked list, if the index is valid.
		 */
		public void deleteAtIndex(int index) {
			if (index < 0 || index >= size) {
				return;
			}
			size--;
			if (index == 0) {
				head = head.next;
				return;
			}

			ListNode cur = head;
			for (int i = 0; i < index - 1; i++) {
				cur = cur.next;
			}

			cur.next = cur.next.next;
		}
}