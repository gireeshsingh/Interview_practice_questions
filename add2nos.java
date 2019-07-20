public class add2nos 
{ 
	class node 
	{ 
		int val; 
		node next; 

		public node(int val) 
		{ 
			this.val = val; 
		} 
	} 
	
	void printlist(node head) 
	{ 
		while (head != null) 
		{ 
			System.out.print(head.val + " "); 
			head = head.next; 
		} 
	} 

	node head1, head2, result; 
	int carry; 

	void push(int val, int list) 
	{ 
		node newnode = new node(val); 
		if (list == 1) 
		{ 
			newnode.next = head1; 
			head1 = newnode; 
		} 
		else if (list == 2) 
		{ 
			newnode.next = head2; 
			head2 = newnode; 
		} 
		else
		{ 
			newnode.next = result; 
			result = newnode; 
		} 

	} 

	void addsamesize(node n, node m) 
	{ 
		if (n == null) 
			return; 

		addsamesize(n.next, m.next); 

		int sum = n.val + m.val + carry; 
		carry = sum / 10; 
		sum = sum % 10; 

		push(sum, 3); 

	} 

	node cur; 

	void propogatecarry(node head1) 
	{ 
		if (head1 != cur) 
		{ 
			propogatecarry(head1.next); 
			int sum = carry + head1.val; 
			carry = sum / 10; 
			sum %= 10; 

			push(sum, 3); 
		} 
	} 

	int getsize(node head) 
	{ 
		int count = 0; 
		while (head != null) 
		{ 
			count++; 
			head = head.next; 
		} 
		return count; 
	} 

	void addlists() 
	{ 
		if (head1 == null) 
		{ 
			result = head2; 
			return; 
		} 

		if (head2 == null) 
		{ 
			result = head1; 
			return; 
		} 

		int size1 = getsize(head1); 
		int size2 = getsize(head2); 

		if (size1 == size2) 
		{ 
			addsamesize(head1, head2); 
		} 
		else
		{ 
			if (size1 < size2) 
			{ 
				node temp = head1; 
				head1 = head2; 
				head2 = temp; 
			} 
			int diff = Math.abs(size1 - size2); 

			node temp = head1; 
			while (diff-- >= 0) 
			{ 
				cur = temp; 
				temp = temp.next; 
			} 

			addsamesize(cur, head2); 

			propogatecarry(head1); 
		} 
			if (carry > 0) 
				push(carry, 3); 
		
	} 

	public static void main(String args[]) 
	{ 
		add2nos list = new add2nos(); 
		list.head1 = null; 
		list.head2 = null; 
		list.result = null; 
		list.carry = 0; 
		int arr1[] = { 9, 9, 9 }; 
		int arr2[] = { 1, 8 }; 

		for (int i = arr1.length - 1; i >= 0; --i) 
			list.push(arr1[i], 1); 

		for (int i = arr2.length - 1; i >= 0; --i) 
			list.push(arr2[i], 2); 

		list.addlists(); 

		list.printlist(list.result); 
	} 
} 
